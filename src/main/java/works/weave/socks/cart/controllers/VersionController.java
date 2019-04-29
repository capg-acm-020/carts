package works.weave.socks.cart.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/")
public class VersionController {

   @Value("${version}")
   private String version;
      @Value("${backgroundcolor1}")
   private String backgroundcolor1;
   @Value("${backgroundcolor2}")
   private String backgroundcolor2;
   @Value("${welcomemessage}")
   private String welcomemessage;
   private String template = "<table style=\"font-family:sans-serif;font-size:24\"><tr><td>Container image</td><td>%s</td></tr><tr><td>Kubernetes namespace</td><td>%s</td></tr><tr><td>Version</td><td>%s</td></tr></table>";

   @ResponseStatus(HttpStatus.OK)
   @RequestMapping(method = RequestMethod.GET, path = "/")
   public @ResponseBody String getInformation() {
      String namespace = System.getenv("KUBERNETES_NAMESPACE");
      if (namespace == null) {
         namespace = "No namespace found in environment variable KUBERNETES_NAMESPACE";
      }

      String image = System.getenv("CONTAINER_IMAGE");
      if (image == null) {
         image = "No image found in environment variable CONTAINER_IMAGE";
      }

      if (version == null) {
         version = "No version found in application.properties";
      }

      return String.format(template, image, namespace, version);
   }

   @ResponseStatus(HttpStatus.OK)
   @RequestMapping(method = RequestMethod.GET, path = "/version")
   public @ResponseBody String getVersion() {
      //return "Version = " + version;
      //return "<html><head><center><font size=\"7\"><br /><br /><br />Welcome " + welcomemessage + "</font></center></head><body><center><font size=\"6\" style=\"background-color:" + backgroundcolor1 + "\"><br /><br /><br /><br />(Version </font>= <b><font size= \"6\" style=\"background-color:" + backgroundcolor2 + "\">" + version + ")</b></font></center><br /><br /><br /><br /><br /><br /><br /><br /><center><font size=\"4\" style=\"color:mediumblue\">Powered by Keptn !</font></center></body></html>";
     private string env="<html><head><center><font size=\"7\"><br /><br /><br />Welcome \" + welcomemessage + \"</font></center></head><body><center><font size=\"6\" style=\"background-color:\" + backgroundcolor1 + \"\"><br /><br /><br /><br />(Version </font>= <b><font size= \"6\" style=\"background-color:\" + backgroundcolor2 + \"\">\" + version + \")</b></font></center><br /><br /><br /><br /><br /><br /><br /><br /> "
                    + "<p align=\"right\" style=\"color:mediumblue\"><font size=\"6\">Powered by </font> "
                    + "<svg version=\"1.1\" id=\"Layer_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"10%\" heigth=\"10%\" x=\"0px\" y=\"0px\"    viewBox=\"0 0 139.8 44\" style=\"enable-background:new 0 0 139.8 44;\" xml:space=\"preserve\"> "
                    + "<style type=\"text/css\"> "
                    + ".st0{fill:#006BB8;} "
                    + ".st1{fill:#002C66;} "
                    + "</style> "
                    + "<title>Group</title> "
                    + "<desc>Created with Sketch.</desc> "
                    + "<g> "
                    + "<g> "
                + "<path class=\"st0\" d=\"M33.5,6.9l-2.1-1L8.4,34.4l1.5,1.9c0.1,0.1,0.2,0.2,0.2,0.3L33.8,7.1C33.7,7,33.6,7,33.5,6.9z\"/> "
                    + "<polygon class=\"st0\" points=\"13,37.2 16.5,37.2 35.8,13.2 35.1,9.8 		\"/> "
                    + "<polygon class=\"st0\" points=\"26.4,3.5 15.7,16.8 15.7,16.8 15.7,16.8 5,30.1 6.7,32.2 28.8,4.7 		\"/> "
                    + "<path class=\"st0\" d=\"M26.3,37.2c0.8,0,1.5-0.4,2-0.9l9.1-11.4c0.5-0.6,0.7-1.4,0.5-2.1l-1.4-6.2L20,37.2H26.3z\"/> "
                    + "<path class=\"st0\" d=\"M13.2,12c-1-0.8-2.3-0.6-3.1,0.3c-0.8,1-0.6,2.3,0.3,3.1c1,0.8,2.3,0.6,3.1-0.3l0,0 "
                + "C14.3,14.1,14.2,12.7,13.2,12z\"/> "
                    + "<path class=\"st0\" d=\"M8.8,17.5c-2.1-1.7-2.5-4.8-0.7-6.9s4.8-2.5,6.9-0.7c0.6,0.5,1.1,1.1,1.4,1.8l7.5-9.4l-3.4-1.7 "
                    + "c-0.7-0.3-1.5-0.3-2.2,0L5.2,6.9c-0.4,0.2-0.7,0.5-1,0.8C4,8,3.9,8.3,3.8,8.6L0.5,22.8c-0.2,0.7,0,1.5,0.5,2.1l2.3,3l7.5-9.4 "
                    + "C10.1,18.3,9.4,18,8.8,17.5z\"/> "
                    + "</g> "
                    + "<g> "
                + "<path class=\"st1\" d=\"M68.3,28.3c0-1.6,0.2-3,0.7-4.2c0.5-1.2,1.1-2.2,1.9-3s1.7-1.4,2.7-1.8c1-0.4,2-0.6,3.1-0.6 "
                    + "c2.5,0,4.4,0.8,5.8,2.3c1.4,1.5,2.1,3.8,2.1,6.9c0,0.2,0,0.5,0,0.8c0,0.3,0,0.5-0.1,0.8H72.7c0.1,1.4,0.6,2.6,1.5,3.4 "
                    + "c0.9,0.8,2.2,1.2,4,1.2c1,0,1.9-0.1,2.8-0.3c0.8-0.2,1.5-0.4,2-0.6l0.6,3.4c-0.2,0.1-0.5,0.2-1,0.4c-0.4,0.1-0.9,0.2-1.4,0.4 "
                    + "c-0.5,0.1-1.1,0.2-1.7,0.3c-0.6,0.1-1.2,0.1-1.8,0.1c-1.6,0-3-0.2-4.1-0.7c-1.2-0.5-2.1-1.1-2.9-2c-0.8-0.8-1.3-1.8-1.7-3 "
                    + "C68.5,30.9,68.3,29.7,68.3,28.3z M80.5,26.4c0-0.6-0.1-1.1-0.2-1.6c-0.2-0.5-0.4-1-0.7-1.3c-0.3-0.4-0.7-0.7-1.1-0.9 "
                    + "s-1-0.3-1.6-0.3c-0.6,0-1.2,0.1-1.7,0.4c-0.5,0.2-0.9,0.6-1.2,1c-0.3,0.4-0.6,0.8-0.8,1.3c-0.2,0.5-0.3,1-0.4,1.5L80.5,26.4 "
                    + "L80.5,26.4z\"/> "
                + "<path class=\"st1\" d=\"M105.1,28.2c0,1.4-0.2,2.6-0.5,3.8c-0.4,1.2-0.9,2.1-1.5,3c-0.7,0.8-1.5,1.5-2.5,1.9c-1,0.5-2.1,0.7-3.4,0.7"
                      + "c-0.8,0-1.6-0.1-2.4-0.3c-0.7-0.2-1.3-0.4-1.8-0.7v7h-4.2V19.8c0.8-0.2,1.9-0.5,3.1-0.7c1.2-0.2,2.6-0.3,3.9-0.3"
                    + "c1.4,0,2.7,0.2,3.8,0.7c1.1,0.4,2.1,1.1,2.9,1.9c0.8,0.8,1.4,1.8,1.8,3C104.9,25.5,105.1,26.8,105.1,28.2z M100.8,28.3"
                    + "c0-1.9-0.4-3.3-1.3-4.4c-0.8-1-2.2-1.5-4.1-1.5c-0.4,0-0.8,0-1.2,0.1c-0.4,0-0.8,0.1-1.3,0.2V33c0.4,0.2,0.9,0.5,1.5,0.7"
                    + "c0.6,0.2,1.3,0.3,1.9,0.3c1.5,0,2.6-0.5,3.3-1.5C100.5,31.4,100.8,30,100.8,28.3z\"/>"
                + "<path class=\"st1\" d=\"M109,14.4l4.2-0.7v5.5h6.4v3.5h-6.4V30c0,1.4,0.2,2.5,0.7,3.1c0.5,0.6,1.2,0.9,2.4,0.9c0.8,0,1.4-0.1,2-0.2"
                    + "c0.6-0.2,1.1-0.3,1.4-0.5l0.7,3.3c-0.5,0.2-1.1,0.4-1.9,0.6c-0.8,0.2-1.7,0.3-2.8,0.3c-1.3,0-2.4-0.2-3.2-0.5"
                    + "c-0.9-0.4-1.5-0.8-2.1-1.5c-0.5-0.7-0.9-1.4-1.1-2.4c-0.2-0.9-0.3-2-0.3-3.2L109,14.4L109,14.4z\"/>"
                + "<path class=\"st1\" d=\"M124.3,19.8c0.8-0.2,1.9-0.5,3.1-0.7c1.3-0.2,2.7-0.3,4.3-0.3c1.5,0,2.7,0.2,3.7,0.6c1,0.4,1.8,1,2.4,1.7"
                    + "c0.6,0.7,1,1.6,1.2,2.6c0.2,1,0.4,2.1,0.4,3.4v10.2h-4.2v-9.5c0-1-0.1-1.8-0.2-2.5c-0.1-0.7-0.3-1.2-0.6-1.7"
                    + "c-0.3-0.4-0.7-0.7-1.2-0.9c-0.5-0.2-1.1-0.3-1.8-0.3c-0.5,0-1.1,0-1.7,0.1c-0.6,0.1-1,0.1-1.3,0.2v14.6h-4.2L124.3,19.8"
                    + "L124.3,19.8z\"/>"
                + "<g>"
                + "<path class=\"st1\" d=\"M66.9,37.2h-4.9l-7-8.4v8.4h-4.2V10.8l4.2-0.7v15.9c0.5-0.6,1.1-1.2,1.7-1.8c0.6-0.6,1.2-1.3,1.8-1.9"
                    + "c0.6-0.6,1.1-1.3,1.7-1.9s1-1.1,1.3-1.5h5c-1.2,1.3-2.4,2.7-3.7,4c-1.3,1.4-2.8,3.2-4.1,4.5L66.9,37.2z\"/>"
                + "</g>"
                + "</g>"
                + "</g>"
                + "</svg>"
                + "</p>"
                + "</body></html> ";
    
      return env;
   }

}
