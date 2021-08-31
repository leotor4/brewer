package com.algaworks.brewer.config.init;

import com.algaworks.brewer.config.WebConfig;

public class AppInitializer extends org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //Configuracao para encontrar nossas controllers.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    //Mapeia as rotas que o dispatchservlet monitora.
    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }
}
