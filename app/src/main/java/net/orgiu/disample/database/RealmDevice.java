package net.orgiu.disample.database;

import com.google.gson.annotations.SerializedName;

import net.orgiu.disample.api.Device;
import net.orgiu.disample.api.ImageApiService;
import net.orgiu.disample.api.ImageUrl;
import net.orgiu.disample.list.DeviceUtils;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class RealmDevice extends RealmObject{

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
    private String imageUrl;
    private String smallIconUrl;
    private String largeIconUrl;

    public RealmDevice() {
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
        this.imageUrl = "";
        this.smallIconUrl = "";
        this.largeIconUrl = "";
    }

    public RealmDevice(String deviceName, String brand, String technology, String gprs, String edge, String announced, String status, String dimensions, String weight, String sim, String type, String size, String resolution, String cardSlot, String alertTypes, String loudspeaker, String soundC, String wlan, String bluetooth, String gps, String radio, String usb, String messaging, String browser, String java, String featuresC, String batteryC, String standBy, String talkTime, String colors, String sensors, String cpu, String internal, String os, String primary, String video, String secondary, String speed, String networkC, String chipset, String features, String musicPlay, String protection, String gpu, String multitouch, String nfc, String camera, String performance, String _2gBands, String _35mmJack, String _3gBands, String _4gBands, String imageUrl, String smallIconUrl, String largeIconUrl) {
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
        this.imageUrl = imageUrl;
        this.smallIconUrl = smallIconUrl;
        this.largeIconUrl = largeIconUrl;
    }

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

    public String getImageUrl() {
        return imageUrl;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public String getLargeIconUrl() {
        return largeIconUrl;
    }

    private RealmDevice setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    private RealmDevice setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    private RealmDevice setTechnology(String technology) {
        this.technology = technology;
        return this;
    }

    private RealmDevice setGprs(String gprs) {
        this.gprs = gprs;
        return this;
    }

    private RealmDevice setEdge(String edge) {
        this.edge = edge;
        return this;
    }

    private RealmDevice setAnnounced(String announced) {
        this.announced = announced;
        return this;
    }

    private RealmDevice setStatus(String status) {
        this.status = status;
        return this;
    }

    private RealmDevice setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    private RealmDevice setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    private RealmDevice setSim(String sim) {
        this.sim = sim;
        return this;
    }

    private RealmDevice setType(String type) {
        this.type = type;
        return this;
    }

    private RealmDevice setSize(String size) {
        this.size = size;
        return this;
    }

    private RealmDevice setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    private RealmDevice setCardSlot(String cardSlot) {
        this.cardSlot = cardSlot;
        return this;
    }

    private RealmDevice setAlertTypes(String alertTypes) {
        this.alertTypes = alertTypes;
        return this;
    }

    private RealmDevice setLoudspeaker(String loudspeaker) {
        this.loudspeaker = loudspeaker;
        return this;
    }

    private RealmDevice setSoundC(String soundC) {
        this.soundC = soundC;
        return this;
    }

    private RealmDevice setWlan(String wlan) {
        this.wlan = wlan;
        return this;
    }

    private RealmDevice setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    private RealmDevice setGps(String gps) {
        this.gps = gps;
        return this;
    }

    private RealmDevice setRadio(String radio) {
        this.radio = radio;
        return this;
    }

    private RealmDevice setUsb(String usb) {
        this.usb = usb;
        return this;
    }

    private RealmDevice setMessaging(String messaging) {
        this.messaging = messaging;
        return this;
    }

    private RealmDevice setBrowser(String browser) {
        this.browser = browser;
        return this;
    }

    private RealmDevice setJava(String java) {
        this.java = java;
        return this;
    }

    private RealmDevice setFeaturesC(String featuresC) {
        this.featuresC = featuresC;
        return this;
    }

    private RealmDevice setBatteryC(String batteryC) {
        this.batteryC = batteryC;
        return this;
    }

    private RealmDevice setStandBy(String standBy) {
        this.standBy = standBy;
        return this;
    }

    private RealmDevice setTalkTime(String talkTime) {
        this.talkTime = talkTime;
        return this;
    }

    private RealmDevice setColors(String colors) {
        this.colors = colors;
        return this;
    }

    private RealmDevice setSensors(String sensors) {
        this.sensors = sensors;
        return this;
    }

    private RealmDevice setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    private RealmDevice setInternal(String internal) {
        this.internal = internal;
        return this;
    }

    private RealmDevice setOs(String os) {
        this.os = os;
        return this;
    }

    private RealmDevice setPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    private RealmDevice setVideo(String video) {
        this.video = video;
        return this;
    }

    private RealmDevice setSecondary(String secondary) {
        this.secondary = secondary;
        return this;
    }

    private RealmDevice setSpeed(String speed) {
        this.speed = speed;
        return this;
    }

    private RealmDevice setNetworkC(String networkC) {
        this.networkC = networkC;
        return this;
    }

    private RealmDevice setChipset(String chipset) {
        this.chipset = chipset;
        return this;
    }

    private RealmDevice setFeatures(String features) {
        this.features = features;
        return this;
    }

    private RealmDevice setMusicPlay(String musicPlay) {
        this.musicPlay = musicPlay;
        return this;
    }

    private RealmDevice setProtection(String protection) {
        this.protection = protection;
        return this;
    }

    private RealmDevice setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    private RealmDevice setMultitouch(String multitouch) {
        this.multitouch = multitouch;
        return this;
    }

    private RealmDevice setNfc(String nfc) {
        this.nfc = nfc;
        return this;
    }

    private RealmDevice setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    private RealmDevice setPerformance(String performance) {
        this.performance = performance;
        return this;
    }

    private RealmDevice set_2gBands(String _2gBands) {
        this._2gBands = _2gBands;
        return this;
    }

    private RealmDevice set_35mmJack(String _35mmJack) {
        this._35mmJack = _35mmJack;
        return this;
    }

    private RealmDevice set_3gBands(String _3gBands) {
        this._3gBands = _3gBands;
        return this;
    }

    private void set_4gBands(String _4gBands) {
        this._4gBands = _4gBands;
    }

    private RealmDevice setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    private void setSmallIconUrl(String smallIconUrl) {
        this.smallIconUrl = smallIconUrl;
    }

    private RealmDevice setLargeIconUrl(String largeIconUrl) {
        this.largeIconUrl = largeIconUrl;
        return this;
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
        return obj instanceof RealmDevice && ((RealmDevice) obj).deviceName.equalsIgnoreCase(deviceName);
    }

    public static class Importer {
        final RealmDevice realmDevice;

        public Importer() {
            realmDevice = new RealmDevice();
        }

        public Importer with(Device device) {
            realmDevice.setDeviceName(DeviceUtils.clearFromBrand(device))
                    .setBrand(device.getBrand())
                    .setTechnology(device.getTechnology())
                    .setGprs(device.getGprs())
                    .setEdge(device.getEdge())
                    .setAnnounced(device.getAnnounced())
                    .setStatus(device.getStatus())
                    .setDimensions(device.getDimensions())
                    .setWeight(device.getWeight())
                    .setSim(device.getSim())
                    .setType(device.getType())
                    .setSize(device.getSize())
                    .setResolution(device.getResolution())
                    .setCardSlot(device.getCardSlot())
                    .setAlertTypes(device.getAlertTypes())
                    .setLoudspeaker(device.getLoudspeaker())
                    .setSoundC(device.getSoundC())
                    .setWlan(device.getWlan())
                    .setBluetooth(device.getBluetooth())
                    .setGps(device.getGps())
                    .setRadio(device.getRadio())
                    .setUsb(device.getUsb())
                    .setMessaging(device.getMessaging())
                    .setBrowser(device.getBrowser())
                    .setJava(device.getJava())
                    .setFeaturesC(device.getFeaturesC())
                    .setBatteryC(device.getBatteryC())
                    .setStandBy(device.getStandBy())
                    .setTalkTime(device.getTalkTime())
                    .setColors(device.getColors())
                    .setSensors(device.getSensors())
                    .setCpu(device.getCpu())
                    .setInternal(device.getInternal())
                    .setOs(device.getOs())
                    .setPrimary(device.getPrimary())
                    .setVideo(device.getVideo())
                    .setSecondary(device.getSecondary())
                    .setSpeed(device.getSpeed())
                    .setNetworkC(device.getNetworkC())
                    .setChipset(device.getChipset())
                    .setFeatures(device.getFeatures())
                    .setMusicPlay(device.getMusicPlay())
                    .setProtection(device.getProtection())
                    .setGpu(device.getGpu())
                    .setMultitouch(device.getMultitouch())
                    .setNfc(device.getNfc())
                    .setCamera(device.getCamera())
                    .setPerformance(device.getPerformance())
                    .set_2gBands(device.get_2gBands())
                    .set_35mmJack(device.get_35mmJack())
                    .set_3gBands(device.get_3gBands())
                    .set_4gBands(device.get_4gBands());

            return this;
        }

        public Importer with(ImageUrl imageUrl) {
            realmDevice.setImageUrl(ImageApiService.ENDPOINT + imageUrl.getImageUrl())
                    .setLargeIconUrl(ImageApiService.LARGE_IMAGE_ENDPOINT + imageUrl.getImageUrl())
                    .setSmallIconUrl(ImageApiService.SMALL_IMAGE_ENDPOINT + imageUrl.getImageUrl());

            return this;
        }

        public RealmDevice get() {
            return realmDevice;
        }
    }
}

