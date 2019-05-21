package com.elypia.elypiai.yugioh;

import com.elypia.elypiai.common.RestAction;
import com.elypia.elypiai.yugioh.impl.TradingCard;
import com.elypia.elypiai.yugioh.impl.YuGiOhService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class YuGiOh {

	/**
	 * The default URL we call too. <br>
	 * Should never throw {@link MalformedURLException} as this
	 * is a manually hardcoded URL.
	 */
    private static URL BASE_URL;

	static {
		try {
			BASE_URL = new URL("http://yugiohprices.com/api/");
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		}
	}

	private YuGiOhService service;

	public YuGiOh() {
		this(BASE_URL);
    }

    public YuGiOh(URL url) {
		Retrofit.Builder retrofitBuilder = new Retrofit.Builder().baseUrl(url.toString());
		retrofitBuilder.addConverterFactory(GsonConverterFactory.create());

		service = retrofitBuilder.build().create(YuGiOhService.class);
    }

	/**
	 * Search the YuGiOh prices API for the YuGiOh card requested.
	 * This only returns a single card and the spelling of the card
	 * must be exact, including hythens (-) and spacing.
	 * Can return a monster or spell/trap card.
	 *
	 * @param name The YuGiOh card to search up, must match card name exactly.
	 */
    public RestAction<? extends TradingCard> getCard(String name) {
		Call<? extends TradingCard> call = service.getCard(name);
		return new RestAction<>(call);
	}
}
