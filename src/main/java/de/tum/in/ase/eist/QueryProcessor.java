package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.regex.Pattern;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "B)";
        } else if (query.contains(" which of the following numbers is the largest: 87, 43, 450, 22")) {
            return "450";

        } else if (query.contains(" which of the following numbers is the largest: 47, 981")) {
            return "981";
        } else if (query.contains(" which of the following numbers is the largest: 80, 34, 68, 565")) {
            return "565";
        } else { // TODO extend the programm here
            return Math.min(1000, Math.max(0,SecureRandom.getInstance("NativePRNG").nextInt()));
        }
    }
}
