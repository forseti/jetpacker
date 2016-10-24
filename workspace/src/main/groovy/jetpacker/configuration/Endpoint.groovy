package jetpacker.configuration

/**
 * Created by donny.wijaya on 24/10/2016.
 */
enum Endpoint {
    DockerHub("https://registry.hub.docker.com/v2/repositories/library/{{ name }}/tags"),
    GitHub("https://api.github.com/repos/{{ namespace }}/{{ name }}/tags")

    String url

    Endpoint(String url) {
        this.url = url
    }
}