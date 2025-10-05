package se.fk.template;

import se.fk.template.sefkgradleexamplestemplateapi.generatedsource.model.PingResponse;

public class Main
{
   public static void main(final String[] args) throws Exception
   {
      System.out.println(
            new PingResponse()
                  .pong(true));
   }
}
