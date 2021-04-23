package com.example.demo;

@RestController
public class DemoController {

    @RequestMapping(value="/hello", method=RequestMethod.POST)
    public String getHello(@RequestBody Data data)
    {
        return "Data inserted into the DB";
    }

}