/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.facebook.messenger;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKMessengerSharer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKMessengerSharerPtr extends Ptr<FBSDKMessengerSharer, FBSDKMessengerSharerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKMessengerSharer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKMessengerSharer() {}
    protected FBSDKMessengerSharer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "messengerPlatformCapabilities")
    public static native FBSDKMessengerPlatformCapability getMessengerPlatformCapabilities();
    @Method(selector = "openMessenger")
    public static native void openMessenger();
    @Method(selector = "shareImage:withOptions:")
    public static native void shareImage(UIImage image, FBSDKMessengerShareOptions options);
    @Method(selector = "shareAnimatedGIF:withOptions:")
    public static native void shareAnimatedGIF(NSData animatedGIFData, FBSDKMessengerShareOptions options);
    @Method(selector = "shareAnimatedWebP:withOptions:")
    public static native void shareAnimatedWebP(NSData animatedWebPData, FBSDKMessengerShareOptions options);
    @Method(selector = "shareVideo:withOptions:")
    public static native void shareVideo(NSData videoData, FBSDKMessengerShareOptions options);
    @Method(selector = "shareAudio:withOptions:")
    public static native void shareAudio(NSData audioData, FBSDKMessengerShareOptions options);
    /*</methods>*/
}