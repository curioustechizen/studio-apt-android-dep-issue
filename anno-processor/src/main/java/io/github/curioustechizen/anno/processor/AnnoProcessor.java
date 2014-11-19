package io.github.curioustechizen.anno.processor;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

import android.app.Activity;

import io.github.curioustechizen.anno.api.AwesomeActivity;


public class AnnoProcessor extends AbstractProcessor{

    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        messager = processingEnv.getMessager();
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> supportedAnnotationTypes = new HashSet<String>();
        supportedAnnotationTypes.add(AwesomeActivity.class.getCanonicalName());
        return supportedAnnotationTypes;
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        if(!roundEnv.processingOver()){
            Set<? extends Element> awesomeActivities = roundEnv.getElementsAnnotatedWith(AwesomeActivity.class);
            messager.printMessage(Diagnostic.Kind.NOTE, String.format("Found %d Activities annotated with @AwesomeActivity", awesomeActivities.size()));
        }
        return false;
    }
}
