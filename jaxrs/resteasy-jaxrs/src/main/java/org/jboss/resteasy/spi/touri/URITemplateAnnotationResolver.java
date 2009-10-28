package org.jboss.resteasy.spi.touri;

import java.lang.annotation.Annotation;

import org.jboss.resteasy.specimpl.UriBuilderImpl;

public class URITemplateAnnotationResolver extends
      AbstractURITemplateAnnotationResolver
{

   protected Class<? extends Annotation> getAnnotationType()
   {
      return URITemplate.class;
   }

   protected UriBuilderImpl getUriBuilder(Class<? extends Object> clazz)
   {
      String uriTemplate = clazz.getAnnotation(URITemplate.class).value();
      UriBuilderImpl uriBuilderImpl = new UriBuilderImpl();
      uriBuilderImpl.replacePath(uriTemplate);
      return uriBuilderImpl;
   }
}