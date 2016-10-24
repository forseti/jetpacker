package jetpacker.job

import jetpacker.configuration.Jetpacker
import ratpack.guice.ConfigurableModule

/**
 * Created by donny.wijaya on 24/10/2016.
 */
class JobModule extends ConfigurableModule<Jetpacker> {
    @Override
    protected void configure() {
        bind(JobService).asEagerSingleton()
    }
}
