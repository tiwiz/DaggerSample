package net.orgiu.disample.api;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Device extends RealmObject implements Parcelable{

    @SerializedName("DeviceName") @PrimaryKey
    private String deviceName;
    @SerializedName("Brand")
    private String brand;
    @SerializedName("technology")
    private String technology;
    @SerializedName("gprs")
    private String gprs;
    @SerializedName("edge")
    private String edge;
    @SerializedName("announced")
    private String announced;
    @SerializedName("status")
    private String status;
    @SerializedName("dimensions")
    private String dimensions;
    @SerializedName("weight")
    private String weight;
    @SerializedName("sim")
    private String sim;
    @SerializedName("type")
    private String type;
    @SerializedName("size")
    private String size;
    @SerializedName("resolution")
    private String resolution;
    @SerializedName("card_slot")
    private String cardSlot;
    @SerializedName("alert_types")
    private String alertTypes;
    @SerializedName("loudspeaker_")
    private String loudspeaker;
    @SerializedName("sound_c")
    private String soundC;
    @SerializedName("wlan")
    private String wlan;
    @SerializedName("bluetooth")
    private String bluetooth;
    @SerializedName("gps")
    private String gps;
    @SerializedName("radio")
    private String radio;
    @SerializedName("usb")
    private String usb;
    @SerializedName("messaging")
    private String messaging;
    @SerializedName("browser")
    private String browser;
    @SerializedName("java")
    private String java;
    @SerializedName("features_c")
    private String featuresC;
    @SerializedName("battery_c")
    private String batteryC;
    @SerializedName("stand_by")
    private String standBy;
    @SerializedName("talk_time")
    private String talkTime;
    @SerializedName("colors")
    private String colors;
    @SerializedName("sensors")
    private String sensors;
    @SerializedName("cpu")
    private String cpu;
    @SerializedName("internal")
    private String internal;
    @SerializedName("os")
    private String os;
    @SerializedName("primary_")
    private String primary;
    @SerializedName("video")
    private String video;
    @SerializedName("secondary")
    private String secondary;
    @SerializedName("speed")
    private String speed;
    @SerializedName("network_c")
    private String networkC;
    @SerializedName("chipset")
    private String chipset;
    @SerializedName("features")
    private String features;
    @SerializedName("music_play")
    private String musicPlay;
    @SerializedName("protection")
    private String protection;
    @SerializedName("gpu")
    private String gpu;
    @SerializedName("multitouch")
    private String multitouch;
    @SerializedName("nfc")
    private String nfc;
    @SerializedName("camera")
    private String camera;
    @SerializedName("performance")
    private String performance;
    @SerializedName("_2g_bands")
    private String _2gBands;
    @SerializedName("_3_5mm_jack_")
    private String _35mmJack;
    @SerializedName("_3g_bands")
    private String _3gBands;
    @SerializedName("_4g_bands")
    private String _4gBands;

    public Device() {
        this.deviceName = "";
        this.brand = "";
        this.technology = "";
        this.gprs = "";
        this.edge = "";
        this.announced = "";
        this.status = "";
        this.dimensions = "";
        this.weight = "";
        this.sim = "";
        this.type = "";
        this.size = "";
        this.resolution = "";
        this.cardSlot = "";
        this.alertTypes = "";
        this.loudspeaker = "";
        this.soundC = "";
        this.wlan = "";
        this.bluetooth = "";
        this.gps = "";
        this.radio = "";
        this.usb = "";
        this.messaging = "";
        this.browser = "";
        this.java = "";
        this.featuresC = "";
        this.batteryC = "";
        this.standBy = "";
        this.talkTime = "";
        this.colors = "";
        this.sensors = "";
        this.cpu = "";
        this.internal = "";
        this.os = "";
        this.primary = "";
        this.video = "";
        this.secondary = "";
        this.speed = "";
        this.networkC = "";
        this.chipset = "";
        this.features = "";
        this.musicPlay = "";
        this.protection = "";
        this.gpu = "";
        this.multitouch = "";
        this.nfc = "";
        this.camera = "";
        this.performance = "";
        this._2gBands = "";
        this._35mmJack = "";
        this._3gBands = "";
        this._4gBands = "";
    }

    public Device(String deviceName, String brand, String technology, String gprs, String edge, String announced, String status, String dimensions, String weight, String sim, String type, String size, String resolution, String cardSlot, String alertTypes, String loudspeaker, String soundC, String wlan, String bluetooth, String gps, String radio, String usb, String messaging, String browser, String java, String featuresC, String batteryC, String standBy, String talkTime, String colors, String sensors, String cpu, String internal, String os, String primary, String video, String secondary, String speed, String networkC, String chipset, String features, String musicPlay, String protection, String gpu, String multitouch, String nfc, String camera, String performance, String _2gBands, String _35mmJack, String _3gBands, String _4gBands) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.technology = technology;
        this.gprs = gprs;
        this.edge = edge;
        this.announced = announced;
        this.status = status;
        this.dimensions = dimensions;
        this.weight = weight;
        this.sim = sim;
        this.type = type;
        this.size = size;
        this.resolution = resolution;
        this.cardSlot = cardSlot;
        this.alertTypes = alertTypes;
        this.loudspeaker = loudspeaker;
        this.soundC = soundC;
        this.wlan = wlan;
        this.bluetooth = bluetooth;
        this.gps = gps;
        this.radio = radio;
        this.usb = usb;
        this.messaging = messaging;
        this.browser = browser;
        this.java = java;
        this.featuresC = featuresC;
        this.batteryC = batteryC;
        this.standBy = standBy;
        this.talkTime = talkTime;
        this.colors = colors;
        this.sensors = sensors;
        this.cpu = cpu;
        this.internal = internal;
        this.os = os;
        this.primary = primary;
        this.video = video;
        this.secondary = secondary;
        this.speed = speed;
        this.networkC = networkC;
        this.chipset = chipset;
        this.features = features;
        this.musicPlay = musicPlay;
        this.protection = protection;
        this.gpu = gpu;
        this.multitouch = multitouch;
        this.nfc = nfc;
        this.camera = camera;
        this.performance = performance;
        this._2gBands = _2gBands;
        this._35mmJack = _35mmJack;
        this._3gBands = _3gBands;
        this._4gBands = _4gBands;
    }

    protected Device(Parcel in) {
        deviceName = in.readString();
        brand = in.readString();
        technology = in.readString();
        gprs = in.readString();
        edge = in.readString();
        announced = in.readString();
        status = in.readString();
        dimensions = in.readString();
        weight = in.readString();
        sim = in.readString();
        type = in.readString();
        size = in.readString();
        resolution = in.readString();
        cardSlot = in.readString();
        alertTypes = in.readString();
        loudspeaker = in.readString();
        soundC = in.readString();
        wlan = in.readString();
        bluetooth = in.readString();
        gps = in.readString();
        radio = in.readString();
        usb = in.readString();
        messaging = in.readString();
        browser = in.readString();
        java = in.readString();
        featuresC = in.readString();
        batteryC = in.readString();
        standBy = in.readString();
        talkTime = in.readString();
        colors = in.readString();
        sensors = in.readString();
        cpu = in.readString();
        internal = in.readString();
        os = in.readString();
        primary = in.readString();
        video = in.readString();
        secondary = in.readString();
        speed = in.readString();
        networkC = in.readString();
        chipset = in.readString();
        features = in.readString();
        musicPlay = in.readString();
        protection = in.readString();
        gpu = in.readString();
        multitouch = in.readString();
        nfc = in.readString();
        camera = in.readString();
        performance = in.readString();
        _2gBands = in.readString();
        _35mmJack = in.readString();
        _3gBands = in.readString();
        _4gBands = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(deviceName);
        dest.writeString(brand);
        dest.writeString(technology);
        dest.writeString(gprs);
        dest.writeString(edge);
        dest.writeString(announced);
        dest.writeString(status);
        dest.writeString(dimensions);
        dest.writeString(weight);
        dest.writeString(sim);
        dest.writeString(type);
        dest.writeString(size);
        dest.writeString(resolution);
        dest.writeString(cardSlot);
        dest.writeString(alertTypes);
        dest.writeString(loudspeaker);
        dest.writeString(soundC);
        dest.writeString(wlan);
        dest.writeString(bluetooth);
        dest.writeString(gps);
        dest.writeString(radio);
        dest.writeString(usb);
        dest.writeString(messaging);
        dest.writeString(browser);
        dest.writeString(java);
        dest.writeString(featuresC);
        dest.writeString(batteryC);
        dest.writeString(standBy);
        dest.writeString(talkTime);
        dest.writeString(colors);
        dest.writeString(sensors);
        dest.writeString(cpu);
        dest.writeString(internal);
        dest.writeString(os);
        dest.writeString(primary);
        dest.writeString(video);
        dest.writeString(secondary);
        dest.writeString(speed);
        dest.writeString(networkC);
        dest.writeString(chipset);
        dest.writeString(features);
        dest.writeString(musicPlay);
        dest.writeString(protection);
        dest.writeString(gpu);
        dest.writeString(multitouch);
        dest.writeString(nfc);
        dest.writeString(camera);
        dest.writeString(performance);
        dest.writeString(_2gBands);
        dest.writeString(_35mmJack);
        dest.writeString(_3gBands);
        dest.writeString(_4gBands);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static Creator<Device> CREATOR = new Creator<Device>() {
        @Override
        public Device createFromParcel(Parcel in) {
            return new Device(in);
        }

        @Override
        public Device[] newArray(int size) {
            return new Device[size];
        }
    };

    public String getDeviceName() {
        return deviceName;
    }

    public String getBrand() {
        return brand;
    }

    public String getTechnology() {
        return technology;
    }

    public String getGprs() {
        return gprs;
    }

    public String getEdge() {
        return edge;
    }

    public String getAnnounced() {
        return announced;
    }

    public String getStatus() {
        return status;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getWeight() {
        return weight;
    }

    public String getSim() {
        return sim;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public String getResolution() {
        return resolution;
    }

    public String getCardSlot() {
        return cardSlot;
    }

    public String getAlertTypes() {
        return alertTypes;
    }

    public String getLoudspeaker() {
        return loudspeaker;
    }

    public String getSoundC() {
        return soundC;
    }

    public String getWlan() {
        return wlan;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public String getGps() {
        return gps;
    }

    public String getRadio() {
        return radio;
    }

    public String getUsb() {
        return usb;
    }

    public String getMessaging() {
        return messaging;
    }

    public String getBrowser() {
        return browser;
    }

    public String getJava() {
        return java;
    }

    public String getFeaturesC() {
        return featuresC;
    }

    public String getBatteryC() {
        return batteryC;
    }

    public String getStandBy() {
        return standBy;
    }

    public String getTalkTime() {
        return talkTime;
    }

    public String getColors() {
        return colors;
    }

    public String getSensors() {
        return sensors;
    }

    public String getCpu() {
        return cpu;
    }

    public String getInternal() {
        return internal;
    }

    public String getOs() {
        return os;
    }

    public String getPrimary() {
        return primary;
    }

    public String getVideo() {
        return video;
    }

    public String getSecondary() {
        return secondary;
    }

    public String getSpeed() {
        return speed;
    }

    public String getNetworkC() {
        return networkC;
    }

    public String getChipset() {
        return chipset;
    }

    public String getFeatures() {
        return features;
    }

    public String getMusicPlay() {
        return musicPlay;
    }

    public String getProtection() {
        return protection;
    }

    public String getGpu() {
        return gpu;
    }

    public String getMultitouch() {
        return multitouch;
    }

    public String getNfc() {
        return nfc;
    }

    public String getCamera() {
        return camera;
    }

    public String getPerformance() {
        return performance;
    }

    public String get_2gBands() {
        return _2gBands;
    }

    public String get_35mmJack() {
        return _35mmJack;
    }

    public String get_3gBands() {
        return _3gBands;
    }

    public String get_4gBands() {
        return _4gBands;
    }

    @Override
    public int hashCode() {
        return deviceName.hashCode();
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", technology='" + technology + '\'' +
                ", gprs='" + gprs + '\'' +
                ", edge='" + edge + '\'' +
                ", announced='" + announced + '\'' +
                ", status='" + status + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", weight='" + weight + '\'' +
                ", sim='" + sim + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", resolution='" + resolution + '\'' +
                ", cardSlot='" + cardSlot + '\'' +
                ", alertTypes='" + alertTypes + '\'' +
                ", loudspeaker='" + loudspeaker + '\'' +
                ", soundC='" + soundC + '\'' +
                ", wlan='" + wlan + '\'' +
                ", bluetooth='" + bluetooth + '\'' +
                ", gps='" + gps + '\'' +
                ", radio='" + radio + '\'' +
                ", usb='" + usb + '\'' +
                ", messaging='" + messaging + '\'' +
                ", browser='" + browser + '\'' +
                ", java='" + java + '\'' +
                ", featuresC='" + featuresC + '\'' +
                ", batteryC='" + batteryC + '\'' +
                ", standBy='" + standBy + '\'' +
                ", talkTime='" + talkTime + '\'' +
                ", colors='" + colors + '\'' +
                ", sensors='" + sensors + '\'' +
                ", cpu='" + cpu + '\'' +
                ", internal='" + internal + '\'' +
                ", os='" + os + '\'' +
                ", primary='" + primary + '\'' +
                ", video='" + video + '\'' +
                ", secondary='" + secondary + '\'' +
                ", speed='" + speed + '\'' +
                ", networkC='" + networkC + '\'' +
                ", chipset='" + chipset + '\'' +
                ", features='" + features + '\'' +
                ", musicPlay='" + musicPlay + '\'' +
                ", protection='" + protection + '\'' +
                ", gpu='" + gpu + '\'' +
                ", multitouch='" + multitouch + '\'' +
                ", nfc='" + nfc + '\'' +
                ", camera='" + camera + '\'' +
                ", performance='" + performance + '\'' +
                ", _2gBands='" + _2gBands + '\'' +
                ", _35mmJack='" + _35mmJack + '\'' +
                ", _3gBands='" + _3gBands + '\'' +
                ", _4gBands='" + _4gBands + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Device && ((Device) obj).deviceName.equalsIgnoreCase(deviceName);
    }
}

