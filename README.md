# PlayerParticles

A Spigot particles plugin with more customizability than any other. Create particles around players 
or blocks with any particle effect in the game with a plethora of skillfully crafted styles.

## Replacing the old Plugin
Delete the previous PlayerParticles.jar file, and delete the "locale" directory in "plugins/PlayerParticles/".

The locale files are re-written to reflect the new command names, which is why the removal of the old instances is necessary.

### Wiki

For information about how to use the plugin or API within the plugin, please refer to the [Wiki](https://github.com/Esophose/PlayerParticles/wiki)

### Server Compatibility 
This plugin is compatible with [Spigot](https://www.spigotmc.org/) and any forks, I recommend using [Paper](https://papermc.io/). 
Using CraftBukkit will not work. 
The versions of Minecraft that are currently supported are `1.16.5-1.7.10`.

### Compilation

PlayerParticles uses Gradle to compile and build the plugin. Run `./gradlew build` in the project's root directory to build the jar.
The plugin jar will be located in `./build/libs` when finished.

### Development Builds

You can find development builds for this plugin [here](https://ci.codemc.io/job/Esophose/job/PlayerParticles/).
