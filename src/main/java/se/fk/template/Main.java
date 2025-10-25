package se.fk.template;

import se.fk.template.sefkgradleexamplestemplateapi.generatedsource.model.OmbudRequest;

public class Main
{
   public static void main(final String[] args) throws Exception
   {
      System.out.println(
            new OmbudRequest()
                  .personnummer("123"));
   }
}
