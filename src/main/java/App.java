import java.util.HashMap;

public class App {
    public static void main( String[] args ) {
        map<String, Object> model = new HashMap<~>();
        ProcessBuilder process = new ProcessBuilder( );
        Integer port;
        If (process.environment().get("PORT") !=null){
            port = Integer.parseInt( process.environment().get( "PORT" ) );
        }else {
            port = 4567;
        }
        setPort(port);
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
            model.put("template", "templates/home.vtl" );
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squadform", (request, response) -> {

            model.put("template", "templates/squadform.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/squad", (request, response) -> {


        }

}
