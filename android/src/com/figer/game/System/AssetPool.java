package com.figer.game.System;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ObjectMap;

public class AssetPool {
    Texture cardBack;
    private TextureRegion cardBackRegion;

    Texture cards;
    private ObjectMap<String, TextureRegion> cardRegions;

    public AssetPool(){
        cardBack = new Texture("badlogic.jpg");
        cardBackRegion = new TextureRegion(cardBack);
        cardBackRegion.flip(false, true);

        cards = new Texture("badlogic.jpg");
        cardRegions.put("DankCard1", new TextureRegion(cards,0, 0, 128, 128));
        cardRegions.put("DankCard2", new TextureRegion(cards,0, 128, 128, 128));
        cardRegions.put("DankCard3", new TextureRegion(cards, 128, 0, 128, 128));
        cardRegions.put("DankCard4", new TextureRegion(cards,128, 128, 128, 128));
        for (TextureRegion region : cardRegions.values()) {
            region.flip(false, true);
        }
    }

    public void dispose(){
        cardBack.dispose();
    }

    public TextureRegion getCardBackRegion() {
        return cardBackRegion;
    }

    public TextureRegion getCardRegion(String name) {
        return cardRegions.get(name);
    }

}