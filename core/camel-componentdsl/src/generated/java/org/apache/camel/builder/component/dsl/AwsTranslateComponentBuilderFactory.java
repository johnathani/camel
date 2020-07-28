/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.translate.TranslateComponent;

/**
 * Translate texts using AWS Translate.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsTranslateComponentBuilderFactory {

    /**
     * AWS Translate (camel-aws-translate)
     * Translate texts using AWS Translate.
     * 
     * Category: cloud,management
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-aws-translate
     */
    static AwsTranslateComponentBuilder awsTranslate() {
        return new AwsTranslateComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Translate component.
     */
    interface AwsTranslateComponentBuilder
            extends
                ComponentBuilder<TranslateComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AwsTranslateComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Being able to autodetect the source language.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsTranslateComponentBuilder autodetectSourceLanguage(
                boolean autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.translate.TranslateConfiguration</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder configuration(
                org.apache.camel.component.aws.translate.TranslateConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsTranslateComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.translate.TranslateOperations</code> type.
         * 
         * Default: translateText
         * Group: producer
         */
        default AwsTranslateComponentBuilder operation(
                org.apache.camel.component.aws.translate.TranslateOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder proxyHost(
                java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default AwsTranslateComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Translate client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder secretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Source language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder sourceLanguage(
                java.lang.String sourceLanguage) {
            doSetProperty("sourceLanguage", sourceLanguage);
            return this;
        }
        /**
         * Target language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder targetLanguage(
                java.lang.String targetLanguage) {
            doSetProperty("targetLanguage", targetLanguage);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option is a:
         * <code>com.amazonaws.services.translate.AmazonTranslate</code> type.
         * 
         * Group: producer
         */
        default AwsTranslateComponentBuilder translateClient(
                com.amazonaws.services.translate.AmazonTranslate translateClient) {
            doSetProperty("translateClient", translateClient);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsTranslateComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class AwsTranslateComponentBuilderImpl
            extends
                AbstractComponentBuilder<TranslateComponent>
            implements
                AwsTranslateComponentBuilder {
        @Override
        protected TranslateComponent buildConcreteComponent() {
            return new TranslateComponent();
        }
        private org.apache.camel.component.aws.translate.TranslateConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.translate.TranslateComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.translate.TranslateConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((TranslateComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((TranslateComponent) component).setAccessKey((java.lang.String) value); return true;
            case "autodetectSourceLanguage": getOrCreateConfiguration((TranslateComponent) component).setAutodetectSourceLanguage((boolean) value); return true;
            case "configuration": ((TranslateComponent) component).setConfiguration((org.apache.camel.component.aws.translate.TranslateConfiguration) value); return true;
            case "lazyStartProducer": ((TranslateComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((TranslateComponent) component).setOperation((org.apache.camel.component.aws.translate.TranslateOperations) value); return true;
            case "proxyHost": getOrCreateConfiguration((TranslateComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((TranslateComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((TranslateComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((TranslateComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((TranslateComponent) component).setSecretKey((java.lang.String) value); return true;
            case "sourceLanguage": getOrCreateConfiguration((TranslateComponent) component).setSourceLanguage((java.lang.String) value); return true;
            case "targetLanguage": getOrCreateConfiguration((TranslateComponent) component).setTargetLanguage((java.lang.String) value); return true;
            case "translateClient": getOrCreateConfiguration((TranslateComponent) component).setTranslateClient((com.amazonaws.services.translate.AmazonTranslate) value); return true;
            case "basicPropertyBinding": ((TranslateComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}