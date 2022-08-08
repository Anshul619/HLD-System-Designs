
package SpringBoot.SampleApp;

/*

@Controller Map of the model object to view or template and make it human readable
- But @RestController simply returns the object and object data is directly written in HTTP response as JSON or XML. Hence we should use @RestController.

RequestMapping can be used with GET, POST, PUT, and many other request methods using the method attribute on the annotation.
- Whereas getMapping is only an extension of RequestMapping which helps you to improve on clarity on request.
- Reference - https://java2blog.com/spring-restcontroller-example/
*/

@RestController
public class CountryController {

    @GetMapping(value = "/countries", headers = "Accept=application/json")
    public List getCountries() {
        List listOfCountries = new ArrayList();
        listOfCountries = createCountryList();
        return listOfCountries;
    }

    @PostMapping(value = "/countries", headers = "Accept=application/json")
    public boolean saveCountry() {
        // Save country and retry boolean
    }
}