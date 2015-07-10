package testo.pl.autocompleteplaces;

/**
 * Created by Lukasz Marczak on 2015-07-09.
 */
public class PlaceAutocomplete {
    public String placeId;
    public String description;

    public PlaceAutocomplete(String placeId, String description) {
        this.placeId = placeId;
        this.description = description;
    }

    public String getPlaceId() {
        return placeId;
    }

    public String getDescription() {
        return description;
    }
}
