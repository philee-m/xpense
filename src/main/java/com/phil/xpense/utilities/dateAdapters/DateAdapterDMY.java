package com.phil.xpense.utilities.dateAdapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapterDMY extends XmlAdapter<String, Date> {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyyHHmmss");

    @Override
    public String marshal(Date v) throws Exception {
        synchronized (dateFormat){
            return dateFormat.format(v);
        }
    }

    @Override
    public Date unmarshal(String v) throws Exception {
        synchronized (dateFormat){
            return dateFormat.parse(v);
        }
    }
}
