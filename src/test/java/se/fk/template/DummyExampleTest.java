package se.fk.template;

import org.junit.jupiter.api.Test;
import se.fk.template.sefkgradleexamplestemplateapi.generatedsource.model.PingResponse;

import static org.assertj.core.api.Assertions.assertThat;

class DummyExampleTest
{

   @Test
   void thingsShouldDoStuff()
   {
      PingResponse actual = new PingResponse()
            .pong(true);

      assertThat(actual.toString()).isEqualToIgnoringWhitespace("""
              class PingResponse {
                  pong: true
              }
            """);
   }

}
