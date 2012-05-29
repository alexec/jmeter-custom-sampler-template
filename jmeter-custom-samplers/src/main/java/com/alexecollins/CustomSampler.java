package com.alexecollins;

import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

/**
 * @author: alexec (alex.e.c@gmail.com)
 */
public class CustomSampler extends AbstractJavaSamplerClient {
    @Override
    public SampleResult runTest(JavaSamplerContext javaSamplerContext) {

        final SampleResult sampleResult = new SampleResult();

        sampleResult.sampleStart();
        try {
            // do some work
            Thread.sleep(100);
            sampleResult.setSuccessful(true);
        } catch (Exception e) {
            // nop
        } finally {
            sampleResult.sampleEnd();
        }

        return sampleResult;
    }
}
