package com.example.ManufacturerDetail.HomeController;
import com.example.ManufacturerDetail.Model.Manufacturer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    Manufacturer manufacturer;

    @Value("${service.x}")
    String serviceURL;





@GetMapping (value = "/test")
public String getpage()
{
    return "home";
}


    @RequestMapping(value="/test",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getMessage(@RequestParam String company_name, ModelMap model) throws JSONException {
        String serviceurl = serviceURL + "/" + company_name + "?format=JSON";
        String val = null;
        ResponseEntity<String> response = null;
        List<Manufacturer> mfglist = new ArrayList<Manufacturer>();

        response = restTemplate.getForEntity(serviceurl, String.class);

        val = response.getBody().toString();
        JSONObject jsonObj = new JSONObject(val);
        JSONArray res = jsonObj.getJSONArray("Results");
        if (res.length() < 1) {
            System.out.println("404 bad request");

            return "Nodata";
        } else {
            for (int i = 0; i < res.length(); i++) {
                Manufacturer manufacturer1 = new Manufacturer();
                manufacturer1.setmID(res.getJSONObject(i).getString("Mfr_ID"));
                manufacturer1.setmName(res.getJSONObject(i).getString("Mfr_Name"));
                manufacturer1.setMcountry(res.getJSONObject(i).getString("Country"));
                manufacturer1.setmCity(res.getJSONObject(i).getString("City"));
                manufacturer1.setmState(res.getJSONObject(i).getString("StateProvince"));
                mfglist.add(manufacturer1);
            }
            System.out.println(mfglist);
            model.put("data", mfglist);

        }
        return "getdata";
    }



    @RequestMapping(value="/test",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getMsg(@RequestParam String company_name, ModelMap model) throws JSONException {
        String serviceurl = serviceURL + "/" + company_name + "?format=JSON";
        String val = null;
        ResponseEntity<String> response = null;
        List<Manufacturer> mfglist = new ArrayList<Manufacturer>();

        response = restTemplate.getForEntity(serviceurl, String.class);

        val = response.getBody().toString();
        JSONObject jsonObj = new JSONObject(val);
        JSONArray res = jsonObj.getJSONArray("Results");
        if (res.length() < 1) {
            System.out.println("404 bad request");

            return "Nodata";
        } else {
            for (int i = 0; i < res.length(); i++) {
                Manufacturer manufacturer1 = new Manufacturer();
                manufacturer1.setmID(res.getJSONObject(i).getString("Mfr_ID"));
                manufacturer1.setmName(res.getJSONObject(i).getString("Mfr_Name"));
                manufacturer1.setMcountry(res.getJSONObject(i).getString("Country"));
                manufacturer1.setmCity(res.getJSONObject(i).getString("City"));
                manufacturer1.setmState(res.getJSONObject(i).getString("StateProvince"));
                mfglist.add(manufacturer1);
            }
            System.out.println(mfglist);
            model.put("data", mfglist);

        }
        return "getdata";
       }
}
