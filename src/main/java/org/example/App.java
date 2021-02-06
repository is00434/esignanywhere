package org.example;

import java.io.File;

import osplus.esa.api.SspFileApi;
import osplus.esa.invoker.ApiClient;

/**
 * Hello world!
 *
 */
public class App implements Runnable {
    private final String[] args;

    private App(final String[] args) {
        this.args = args;
    }

    private ApiClient apiClient = null;

    private ApiClient getApiClient() {
        if (apiClient == null) {
            apiClient = new ApiClient();
        }
        return apiClient;
    }

    private SspFileApi sspFileApi = null;

    private SspFileApi getSspFileApi() {
        if (sspFileApi == null) {
            sspFileApi = new SspFileApi(getApiClient());
        }
        return sspFileApi;
    }

    @Override
    public void run() {
        final SspFileApi sspFileApi = getSspFileApi();        
        sspFileApi.sspFileUploadTemporary(new File(""));
    }

    public static void main(final String[] args) {
        new App(args).run();
    }
}
