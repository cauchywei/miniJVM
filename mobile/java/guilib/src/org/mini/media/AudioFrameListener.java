/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mini.media;

import org.mini.reflect.DirectMemObj;

/**
 *
 * @author Gust
 */
public interface AudioFrameListener {

    void onReceiveFrames(AudioDevice pDevice, int frameCount, DirectMemObj dmo);

    int onSendFrames(AudioDevice pDevice, int frameCount, DirectMemObj dmo);

    void onStop(AudioDevice pDevice);
}
