package se.fk.template;

import org.junit.jupiter.api.Test;
import se.fk.template.sefkgradleexamplestemplateapi.generatedsource.model.OmbudRequest;

import static org.assertj.core.api.Assertions.assertThat;

class DummyExampleTest
{

   @Test
   void thingsShouldDoStuff()
   {
      OmbudRequest actual = new OmbudRequest()
            .personnummer("123");

      assertThat(actual.toString()).isEqualToIgnoringWhitespace("""
              class OmbudRequest {
                  personnummer: 123
              }
            """);
   }

}
