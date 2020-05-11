package dev.esophose.playerparticles.particles.color;

import dev.esophose.playerparticles.particles.ParticleEffect;

/**
 * Represents the color for effects like {@link ParticleEffect#ENTITY_EFFECT},
 * {@link ParticleEffect#AMBIENT_ENTITY_EFFECT}, {@link ParticleEffect#DUST}
 * and {@link ParticleEffect#NOTE}
 * <p>
 * This class is part of the <b>ParticleEffect Library</b> and follows the
 * same usage conditions
 *
 * @author DarkBlade12
 * @since 1.7
 */
public interface ParticleColor {
    /**
     * Returns the value for the offsetX field
     *
     * @return The offsetX value
     */
    float getValueX();

    /**
     * Returns the value for the offsetY field
     *
     * @return The offsetY value
     */
    float getValueY();

    /**
     * Returns the value for the offsetZ field
     *
     * @return The offsetZ value
     */
    float getValueZ();

}