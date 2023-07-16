package software.bernie.shadowed.fasterxml.jackson.databind.cfg;

import software.bernie.shadowed.fasterxml.jackson.core.Version;
import software.bernie.shadowed.fasterxml.jackson.core.Versioned;
import software.bernie.shadowed.fasterxml.jackson.core.util.VersionUtil;

public final class PackageVersion implements Versioned {
   public static final Version VERSION = VersionUtil.parseVersion("2.9.0", "software.bernie.shadowed.fasterxml.jackson.core", "jackson-databind");

   public Version version() {
      return VERSION;
   }
}
