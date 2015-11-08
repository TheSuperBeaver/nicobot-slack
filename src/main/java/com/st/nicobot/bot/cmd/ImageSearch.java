package com.st.nicobot.bot.cmd;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Logs on 22-08-15.
 */
@Service
public class ImageSearch extends AbstractSearch {

    private static final String COMMAND = "!img";
    private static final String FORMAT = "!img query";
    private static final String DESC = "Recherche une image sur les internets et retourne le premier résultat";

    @Override
    public String getCommandName() {
        return COMMAND;
    }

    @Override
    public String getDescription() {
        return DESC;
    }

    @Override
    public String getFormat() {
        return FORMAT;
    }

    @Override
    protected Map<String, String> getSpecificQueryArguments() {
        Map<String,String> map = new HashMap<>();
        map.put("searchType","image");
        return map;
    }
}
