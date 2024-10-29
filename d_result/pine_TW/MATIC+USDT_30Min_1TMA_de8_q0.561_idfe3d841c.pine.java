//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: TMA_Overlay
// ID_model: MATICUSDT_30Min_1TMA_fe3d841c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1TMA_fe3d841c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_fe3d841c(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema2 <= 0.372276 )
		if( smma2 <= 0.282446 )
			if( smma4 <= 0.013779 )
				if( ema2 <= 0.012357 )
					ret := 1.000000 // buy
				if( ema2 > 0.012357 )
					if( smma1 <= 0.012479 )
						ret := -0.500000
					if( smma1 > 0.012479 )
						if( smma1 <= 0.013144 )
							if( smma2 <= 0.012841 )
								if( ema2 <= 0.013548 )
									ret := 0.789474 // buy
								if( ema2 > 0.013548 )
									ret := 0.250000
							if( smma2 > 0.012841 )
								ret := -0.250000
						if( smma1 > 0.013144 )
							if( ema2 <= 0.015153 )
								if( ema2 <= 0.014399 )
									ret := 1.000000 // buy
								if( ema2 > 0.014399 )
									ret := 0.772727 // buy
							if( ema2 > 0.015153 )
								ret := 0.250000
			if( smma4 > 0.013779 )
				if( smma2 <= 0.27372 )
					if( smma4 <= 0.209189 )
						if( smma1 <= 0.207253 )
							if( smma4 <= 0.039633 )
								if( ema2 <= 0.042218 )
									ret := 0.092565
								if( ema2 > 0.042218 )
									ret := -0.456790
							if( smma4 > 0.039633 )
								if( smma1 <= 0.10256 )
									ret := 0.431148
								if( smma1 > 0.10256 )
									ret := 0.112074
						if( smma1 > 0.207253 )
							if( smma3 <= 0.220281 )
								if( ema2 <= 0.237618 )
									ret := -0.056962
								if( ema2 > 0.237618 )
									ret := -0.871795 // sell
							if( smma3 > 0.220281 )
								ret := -1.000000 // sell
					if( smma4 > 0.209189 )
						if( ema2 <= 0.323462 )
							if( ema2 <= 0.223507 )
								if( smma3 <= 0.213333 )
									ret := 0.818182 // buy
								if( smma3 > 0.213333 )
									ret := 0.967742 // buy
							if( ema2 > 0.223507 )
								if( smma2 <= 0.219271 )
									ret := -0.750000 // sell
								if( smma2 > 0.219271 )
									ret := 0.603774
						if( ema2 > 0.323462 )
							if( smma4 <= 0.225313 )
								ret := -1.000000 // sell
							if( smma4 > 0.225313 )
								ret := -0.800000 // sell
				if( smma2 > 0.27372 )
					if( ema2 <= 0.29996 )
						if( smma1 <= 0.304493 )
							ret := -0.500000
						if( smma1 > 0.304493 )
							ret := 0.400000
					if( ema2 > 0.29996 )
						ret := -1.000000 // sell
		if( smma2 > 0.282446 )
			if( ema2 <= 0.340331 )
				if( bullSigInt <= 0.5 )
					if( smma1 <= 0.356915 )
						if( smma4 <= 0.350766 )
							if( smma4 <= 0.24269 )
								if( ema2 <= 0.293687 )
									ret := 0.869565 // buy
								if( ema2 > 0.293687 )
									ret := -0.727273 // sell
							if( smma4 > 0.24269 )
								if( bearSigInt <= 0.5 )
									ret := 0.778571 // buy
								if( bearSigInt > 0.5 )
									ret := 0.300000
						if( smma4 > 0.350766 )
							if( smma3 <= 0.357006 )
								if( ema2 <= 0.325887 )
									ret := 0.384615
								if( ema2 > 0.325887 )
									ret := -0.765957 // sell
							if( smma3 > 0.357006 )
								if( smma4 <= 0.373536 )
									ret := 0.761905 // buy
								if( smma4 > 0.373536 )
									ret := 0.269565
					if( smma1 > 0.356915 )
						if( smma4 <= 0.382194 )
							if( smma3 <= 0.367784 )
								if( smma3 <= 0.366244 )
									ret := 0.750000 // buy
								if( smma3 > 0.366244 )
									ret := 1.000000 // buy
							if( smma3 > 0.367784 )
								if( smma1 <= 0.370383 )
									ret := 0.250000
								if( smma1 > 0.370383 )
									ret := 1.000000 // buy
						if( smma4 > 0.382194 )
							ret := 1.000000 // buy
				if( bullSigInt > 0.5 )
					if( smma2 <= 0.330542 )
						if( smma4 <= 0.340896 )
							ret := -0.571429
						if( smma4 > 0.340896 )
							ret := 0.750000 // buy
					if( smma2 > 0.330542 )
						if( smma3 <= 0.357214 )
							ret := -0.750000 // sell
						if( smma3 > 0.357214 )
							ret := -1.000000 // sell
			if( ema2 > 0.340331 )
				if( smma2 <= 0.362955 )
					if( smma2 <= 0.339347 )
						if( smma1 <= 0.341074 )
							if( smma3 <= 0.338515 )
								if( ema2 <= 0.342949 )
									ret := 0.000000
								if( ema2 > 0.342949 )
									ret := -0.772727 // sell
							if( smma3 > 0.338515 )
								if( ema2 <= 0.34285 )
									ret := 0.888889 // buy
								if( ema2 > 0.34285 )
									ret := -0.200000
						if( smma1 > 0.341074 )
							if( smma1 <= 0.341107 )
								ret := -0.750000 // sell
							if( smma1 > 0.341107 )
								ret := -1.000000 // sell
					if( smma2 > 0.339347 )
						if( smma4 <= 0.368435 )
							if( smma1 <= 0.360212 )
								if( smma4 <= 0.358833 )
									ret := 0.790909 // buy
								if( smma4 > 0.358833 )
									ret := 0.520231
							if( smma1 > 0.360212 )
								if( ema2 <= 0.35575 )
									ret := 0.785714 // buy
								if( ema2 > 0.35575 )
									ret := -0.048485
						if( smma4 > 0.368435 )
							if( smma3 <= 0.375389 )
								if( smma3 <= 0.357513 )
									ret := 1.000000 // buy
								if( smma3 > 0.357513 )
									ret := -0.330645
							if( smma3 > 0.375389 )
								if( smma4 <= 0.428766 )
									ret := 0.900000 // buy
								if( smma4 > 0.428766 )
									ret := 0.000000
				if( smma2 > 0.362955 )
					if( smma2 <= 0.382202 )
						if( smma2 <= 0.37369 )
							if( smma4 <= 0.388158 )
								if( smma1 <= 0.371734 )
									ret := -0.209302
								if( smma1 > 0.371734 )
									ret := 0.439394
							if( smma4 > 0.388158 )
								if( smma4 <= 0.42173 )
									ret := 0.585714
								if( smma4 > 0.42173 )
									ret := -0.250000
						if( smma2 > 0.37369 )
							if( smma2 <= 0.376899 )
								if( smma1 <= 0.364289 )
									ret := -0.913043 // sell
								if( smma1 > 0.364289 )
									ret := -0.530864
							if( smma2 > 0.376899 )
								if( smma3 <= 0.395681 )
									ret := 0.041667
								if( smma3 > 0.395681 )
									ret := -1.000000 // sell
					if( smma2 > 0.382202 )
						if( smma3 <= 0.401612 )
							if( bullishEngulfingInt <= 0.5 )
								if( smma4 <= 0.378016 )
									ret := 0.920000 // buy
								if( smma4 > 0.378016 )
									ret := 0.651163
							if( bullishEngulfingInt > 0.5 )
								ret := 0.000000
						if( smma3 > 0.401612 )
							if( smma1 <= 0.381279 )
								if( smma3 <= 0.406586 )
									ret := -1.000000 // sell
								if( smma3 > 0.406586 )
									ret := -0.750000 // sell
							if( smma1 > 0.381279 )
								if( smma1 <= 0.408099 )
									ret := 0.232877
								if( smma1 > 0.408099 )
									ret := -1.000000 // sell
	if( ema2 > 0.372276 )
		if( smma4 <= 0.372298 )
			if( smma1 <= 0.40111 )
				if( smma2 <= 0.370687 )
					if( smma1 <= 0.375828 )
						if( smma4 <= 0.367812 )
							if( smma3 <= 0.366069 )
								if( smma3 <= 0.360225 )
									ret := -0.330508
								if( smma3 > 0.360225 )
									ret := 0.122137
							if( smma3 > 0.366069 )
								if( ema2 <= 0.373871 )
									ret := -0.333333
								if( ema2 > 0.373871 )
									ret := -0.931034 // sell
						if( smma4 > 0.367812 )
							if( smma1 <= 0.359951 )
								ret := -0.833333 // sell
							if( smma1 > 0.359951 )
								if( smma1 <= 0.363326 )
									ret := 0.750000 // buy
								if( smma1 > 0.363326 )
									ret := 1.000000 // buy
					if( smma1 > 0.375828 )
						if( smma2 <= 0.36724 )
							if( smma2 <= 0.364534 )
								if( smma3 <= 0.354036 )
									ret := -0.533333
								if( smma3 > 0.354036 )
									ret := -1.000000 // sell
							if( smma2 > 0.364534 )
								if( smma1 <= 0.379189 )
									ret := 0.800000 // buy
								if( smma1 > 0.379189 )
									ret := 0.000000
						if( smma2 > 0.36724 )
							ret := -1.000000 // sell
				if( smma2 > 0.370687 )
					if( ema2 <= 0.380244 )
						if( smma4 <= 0.36459 )
							if( ema2 <= 0.376657 )
								if( smma1 <= 0.380761 )
									ret := 1.000000 // buy
								if( smma1 > 0.380761 )
									ret := -0.100000
							if( ema2 > 0.376657 )
								if( smma3 <= 0.370676 )
									ret := 0.000000
								if( smma3 > 0.370676 )
									ret := -0.777778 // sell
						if( smma4 > 0.36459 )
							ret := -1.000000 // sell
					if( ema2 > 0.380244 )
						if( smma4 <= 0.364507 )
							if( ema2 <= 0.400912 )
								if( smma1 <= 0.383443 )
									ret := -0.230769
								if( smma1 > 0.383443 )
									ret := 0.720000 // buy
							if( ema2 > 0.400912 )
								if( smma2 <= 0.400671 )
									ret := -0.707317 // sell
								if( smma2 > 0.400671 )
									ret := 0.272727
						if( smma4 > 0.364507 )
							if( ema2 <= 0.430986 )
								if( smma1 <= 0.399807 )
									ret := 0.827586 // buy
								if( smma1 > 0.399807 )
									ret := -0.500000
							if( ema2 > 0.430986 )
								if( smma4 <= 0.367547 )
									ret := -1.000000 // sell
								if( smma4 > 0.367547 )
									ret := 0.500000
			if( smma1 > 0.40111 )
				if( smma4 <= 0.321361 )
					if( ema2 <= 0.423869 )
						if( ema2 <= 0.420056 )
							ret := 1.000000 // buy
						if( ema2 > 0.420056 )
							if( smma2 <= 0.40341 )
								ret := 0.142857
							if( smma2 > 0.40341 )
								if( smma4 <= 0.311665 )
									ret := 1.000000 // buy
								if( smma4 > 0.311665 )
									ret := 0.600000
					if( ema2 > 0.423869 )
						if( bearishEngulfingInt <= 0.5 )
							if( smma2 <= 0.383373 )
								if( ema2 <= 0.449351 )
									ret := 0.777778 // buy
								if( ema2 > 0.449351 )
									ret := -0.782609 // sell
							if( smma2 > 0.383373 )
								if( smma2 <= 0.393712 )
									ret := -0.636364
								if( smma2 > 0.393712 )
									ret := -0.888889 // sell
						if( bearishEngulfingInt > 0.5 )
							if( smma2 <= 0.38508 )
								ret := 1.000000 // buy
							if( smma2 > 0.38508 )
								ret := -0.250000
				if( smma4 > 0.321361 )
					if( ema2 <= 0.38493 )
						ret := 1.000000 // buy
					if( ema2 > 0.38493 )
						if( ema2 <= 0.412 )
							if( smma3 <= 0.383979 )
								if( ema2 <= 0.391178 )
									ret := -0.461538
								if( ema2 > 0.391178 )
									ret := -0.880952 // sell
							if( smma3 > 0.383979 )
								if( smma2 <= 0.400886 )
									ret := 1.000000 // buy
								if( smma2 > 0.400886 )
									ret := -0.583333
						if( ema2 > 0.412 )
							if( smma2 <= 0.388062 )
								if( smma4 <= 0.368588 )
									ret := -0.857143 // sell
								if( smma4 > 0.368588 )
									ret := 0.000000
							if( smma2 > 0.388062 )
								if( smma4 <= 0.32362 )
									ret := -0.777778 // sell
								if( smma4 > 0.32362 )
									ret := -0.986842 // sell
		if( smma4 > 0.372298 )
			if( smma4 <= 0.856258 )
				if( smma4 <= 0.842631 )
					if( ema2 <= 0.911531 )
						if( smma3 <= 0.869523 )
							if( smma2 <= 0.871581 )
								if( smma1 <= 0.403897 )
									ret := 0.187279
								if( smma1 > 0.403897 )
									ret := 0.050480
							if( smma2 > 0.871581 )
								if( ema2 <= 0.831439 )
									ret := 1.000000 // buy
								if( ema2 > 0.831439 )
									ret := 0.309524
						if( smma3 > 0.869523 )
							if( smma2 <= 0.879215 )
								if( smma1 <= 0.87121 )
									ret := -1.000000 // sell
								if( smma1 > 0.87121 )
									ret := -0.888889 // sell
							if( smma2 > 0.879215 )
								if( ema2 <= 0.868066 )
									ret := 0.380952
								if( ema2 > 0.868066 )
									ret := -0.750000 // sell
					if( ema2 > 0.911531 )
						if( smma1 <= 0.928327 )
							if( smma4 <= 0.825776 )
								if( smma2 <= 0.881461 )
									ret := 0.044118
								if( smma2 > 0.881461 )
									ret := -0.812500 // sell
							if( smma4 > 0.825776 )
								if( ema2 <= 0.916388 )
									ret := -0.466667
								if( ema2 > 0.916388 )
									ret := 0.338710
						if( smma1 > 0.928327 )
							if( smma2 <= 0.915688 )
								if( smma3 <= 0.831261 )
									ret := 0.000000
								if( smma3 > 0.831261 )
									ret := -0.844660 // sell
							if( smma2 > 0.915688 )
								ret := 0.500000
				if( smma4 > 0.842631 )
					if( smma2 <= 0.800984 )
						if( smma2 <= 0.733091 )
							if( smma2 <= 0.68967 )
								ret := 0.666667
							if( smma2 > 0.68967 )
								if( smma3 <= 0.748616 )
									ret := -0.777778 // sell
								if( smma3 > 0.748616 )
									ret := -0.153846
						if( smma2 > 0.733091 )
							if( smma4 <= 0.844766 )
								if( smma3 <= 0.793275 )
									ret := -0.333333
								if( smma3 > 0.793275 )
									ret := 0.222222
							if( smma4 > 0.844766 )
								if( smma3 <= 0.820249 )
									ret := 0.814159 // buy
								if( smma3 > 0.820249 )
									ret := 0.200000
					if( smma2 > 0.800984 )
						if( ema2 <= 0.925392 )
							if( smma1 <= 0.838372 )
								if( ema2 <= 0.84925 )
									ret := 0.076104
								if( ema2 > 0.84925 )
									ret := 0.888889 // buy
							if( smma1 > 0.838372 )
								if( smma2 <= 0.866639 )
									ret := 0.500000
								if( smma2 > 0.866639 )
									ret := 0.268839
						if( ema2 > 0.925392 )
							if( ema2 <= 0.957771 )
								if( smma4 <= 0.854606 )
									ret := -0.654762
								if( smma4 > 0.854606 )
									ret := 0.480000
							if( ema2 > 0.957771 )
								if( smma3 <= 0.87022 )
									ret := -0.500000
								if( smma3 > 0.87022 )
									ret := 0.769231 // buy
			if( smma4 > 0.856258 )
				if( smma2 <= 0.888866 )
					if( smma3 <= 0.903547 )
						if( smma1 <= 0.671027 )
							if( smma1 <= 0.617361 )
								ret := 1.000000 // buy
							if( smma1 > 0.617361 )
								if( ema2 <= 0.708189 )
									ret := 0.452055
								if( ema2 > 0.708189 )
									ret := -0.875000 // sell
						if( smma1 > 0.671027 )
							if( ema2 <= 0.747802 )
								if( ema2 <= 0.664299 )
									ret := 0.038462
								if( ema2 > 0.664299 )
									ret := -0.853933 // sell
							if( ema2 > 0.747802 )
								if( smma1 <= 0.798709 )
									ret := 0.248555
								if( smma1 > 0.798709 )
									ret := -0.103073
					if( smma3 > 0.903547 )
						if( ema2 <= 0.852665 )
							if( smma1 <= 0.858069 )
								if( smma4 <= 0.965676 )
									ret := -0.529412
								if( smma4 > 0.965676 )
									ret := -0.958333 // sell
							if( smma1 > 0.858069 )
								if( smma3 <= 0.912159 )
									ret := -0.750000 // sell
								if( smma3 > 0.912159 )
									ret := 0.000000
						if( ema2 > 0.852665 )
							if( smma4 <= 0.930445 )
								if( smma3 <= 0.91052 )
									ret := -1.000000 // sell
								if( smma3 > 0.91052 )
									ret := -0.500000
							if( smma4 > 0.930445 )
								if( smma3 <= 0.916134 )
									ret := -0.047619
								if( smma3 > 0.916134 )
									ret := 0.500000
				if( smma2 > 0.888866 )
					if( smma4 <= 1.49389 )
						if( smma3 <= 1.53727 )
							if( smma1 <= 1.67141 )
								if( smma4 <= 1.42365 )
									ret := 0.028898
								if( smma4 > 1.42365 )
									ret := 0.153846
							if( smma1 > 1.67141 )
								if( smma4 <= 1.22735 )
									ret := -0.952381 // sell
								if( smma4 > 1.22735 )
									ret := -0.656250
						if( smma3 > 1.53727 )
							if( ema2 <= 1.6701 )
								if( smma2 <= 1.59654 )
									ret := 0.694444
								if( smma2 > 1.59654 )
									ret := -0.375000
							if( ema2 > 1.6701 )
								if( smma3 <= 1.59983 )
									ret := 0.974359 // buy
								if( smma3 > 1.59983 )
									ret := 0.620690
					if( smma4 > 1.49389 )
						if( smma4 <= 1.81252 )
							if( ema2 <= 1.99447 )
								if( smma2 <= 1.25646 )
									ret := 0.928571 // buy
								if( smma2 > 1.25646 )
									ret := -0.037377
							if( ema2 > 1.99447 )
								if( smma4 <= 1.60711 )
									ret := 0.132530
								if( smma4 > 1.60711 )
									ret := -0.442971
						if( smma4 > 1.81252 )
							if( smma2 <= 2.75971 )
								if( ema2 <= 1.90743 )
									ret := 0.175000
								if( ema2 > 1.90743 )
									ret := 0.018496
							if( smma2 > 2.75971 )
								if( smma1 <= 2.81243 )
									ret := -0.888889 // sell
								if( smma1 > 2.81243 )
									ret := -0.400000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator TMA_Overlay 
//@version=5
//indicator "TMA Overlay", shorttitle="TMA Overlay", overlay=true)

// ### Four Smoothed Moving Averages

len1 = 21
src1 = close
smma1 = 0.0
sma_1 = ta.sma(src1, len1)
smma1 := na(smma1[1]) ? sma_1 : (smma1[1] * (len1 - 1) + src1) / len1
plot(smma1, color=color.white, linewidth=2, title="21 SMMA")

len2 = 50
src2 = close
smma2 = 0.0
sma_2 = ta.sma(src2, len2)
smma2 := na(smma2[1]) ? sma_2 : (smma2[1] * (len2 - 1) + src2) / len2
plot(smma2, color=color.rgb(106, 255, 0), linewidth=2, title="50 SMMA")

h100 = input.bool(true, title="Show 100 Line", group="Smoothed MA Inputs")
len3 = 100
src3 = close
smma3 = 0.0
sma_3 = ta.sma(src3, len3)
smma3 := na(smma3[1]) ? sma_3 : (smma3[1] * (len3 - 1) + src3) / len3
sma3plot = plot(h100 ? smma3 : na, color=color.yellow, linewidth=2, title="100 SMMA")

len4 = 200
src4 = close
smma4 = 0.0
sma_4 = ta.sma(src4, len4)
smma4 := na(smma4[1]) ? sma_4 : (smma4[1] * (len4 - 1) + src4) / len4
sma4plot = plot(smma4, color=color.rgb(255, 5, 0), linewidth=2, title="200 SMMA")

// Trend Fill

trendFill = input.bool(true, title="Show Trend Fill", group="Smoothed MA Inputs")
ema2 = ta.ema(close, 2)
ema2plot = plot(ema2, color=color.new(color.rgb(46, 204, 113), 100), style=plot.style_line, linewidth=1, title="EMA(2)", editable=false)

fill(ema2plot, sma4plot, color=ema2 > smma4 and trendFill ? color.green : ema2 < smma4 and trendFill ? color.red : na, title="Trend Fill")

// End ###

// ### 3 Line Strike

bearS = input.bool(true, title="Show Bearish 3 Line Strike", group="3 Line Strike")
bullS = input.bool(true, title="Show Bullish 3 Line Strike", group="3 Line Strike")

bearSig = close[3] > open[3] and close[2] > open[2] and close[1] > open[1] and close < open[1]
bullSig = close[3] < open[3] and close[2] < open[2] and close[1] < open[1] and close > open[1]

plotshape(bullS ? bullSig : na, style=shape.triangleup, color=color.green, location=location.belowbar, size=size.small, text="3s-Bull", title="3 Line Strike Up")
plotshape(bearS ? bearSig : na, style=shape.triangledown, color=color.red, location=location.abovebar, size=size.small, text="3s-Bear", title="3 Line Strike Down")

// End ###

// ### Engulfing Candles

bearE = input.bool(true, title="Show Bearish Big A$$ Candles", group="Big A$$ Candles")
bullE = input.bool(true, title="Show Bullish Big A$$ Candles", group="Big A$$ Candles")

openBarPrevious = open[1]
closeBarPrevious = close[1]
openBarCurrent = open
closeBarCurrent = close

bullishEngulfing = openBarCurrent <= closeBarPrevious and openBarCurrent < openBarPrevious and closeBarCurrent > openBarPrevious
bearishEngulfing = openBarCurrent >= closeBarPrevious and openBarCurrent > openBarPrevious and closeBarCurrent < openBarPrevious

plotshape(bullE ? bullishEngulfing : na, style=shape.triangleup, location=location.belowbar, color=color.green, size=size.tiny, title="Big Ass Candle Up")
plotshape(bearE ? bearishEngulfing : na, style=shape.triangledown, location=location.abovebar, color=color.red, size=size.tiny, title="Big Ass Candle Down")

alertcondition(bullishEngulfing, title="Bullish Engulfing", message="[CurrencyPair] [TimeFrame], Bullish candle engulfing previous candle")
alertcondition(bearishEngulfing, title="Bearish Engulfing", message="[CurrencyPair] [TimeFrame], Bearish candle engulfing previous candle")

// End ###

// ### Trading Session

ts = input.bool(true, title="Show Trade Session", group="Trade Session")

tz = input.string(defval="America/Chicago", title="Timezone", options=["Asia/Sydney", "Asia/Tokyo", "Europe/Frankfurt", "Europe/London", "UTC", "America/New_York", "America/Chicago"], group="Trade Session")
label = input.string(defval="CME Open", title="Label", tooltip="For easy identification", group="Trade Session")

startHour = input.int(defval=7, minval=0, maxval=23, title="analysis Start hour", group="Trade Session")
startMinute = input.int(defval=0, minval=0, maxval=59, title="analysis Start minute", group="Trade Session")

startHour2 = input.int(defval=8, minval=0, maxval=23, title="Session Start hour", group="Trade Session")
startMinute2 = input.int(defval=30, minval=0, maxval=59, title="Session Start minute", group="Trade Session")
endHour2 = input.int(defval=12, minval=0, maxval=23, title="Session End hour", group="Trade Session")
endMinute2 = input.int(defval=0, minval=0, maxval=59, title="Session End minute", group="Trade Session")

rangeColor = input.color(defval=color.new(color.rgb(25, 118, 210), 31), title="Color", group="Trade Session")
showMon = input.bool(true, title="Monday", group="Trade Session")
showTue = input.bool(true, title="Tuesday", group="Trade Session")
showWed = input.bool(true, title="Wednesday", group="Trade Session")
showThu = input.bool(true, title="Thursday", group="Trade Session")
showFri = input.bool(true, title="Friday", group="Trade Session")
showSat = input.bool(false, title="Saturday", group="Trade Session")
showSun = input.bool(false, title="Sunday", group="Trade Session")

tzYear = year(time(tz))
tzMonth = month(time(tz))
tzDay = dayofmonth(time(tz))
tzDayOfWeek = dayofweek(time(tz))
startTime = timestamp(tz, tzYear, tzMonth, tzDay, startHour, startMinute)
endTime = timestamp(tz, tzYear, tzMonth, tzDay, endHour2, endMinute2)

active = if startTime <= time and time <= endTime and ts
    if tzDayOfWeek == dayofweek.monday and showMon
        true
    else if tzDayOfWeek == dayofweek.tuesday and showTue
        true
    else if tzDayOfWeek == dayofweek.wednesday and showWed
        true
    else if tzDayOfWeek == dayofweek.thursday and showThu
        true
    else if tzDayOfWeek == dayofweek.friday and showFri
        true
    else if tzDayOfWeek == dayofweek.saturday and showSat
        true
    else if tzDayOfWeek == dayofweek.sunday and showSun
        true
    else
        false
else
    false

bgcolor(color=active ? rangeColor : na, title="Session Background")

startTime2 = timestamp(tz, tzYear, tzMonth, tzDay, startHour2, startMinute2)
endTime2 = timestamp(tz, tzYear, tzMonth, tzDay, endHour2, endMinute2)

active2 = if startTime2 <= time and time <= endTime2 and ts
    if tzDayOfWeek == dayofweek.monday and showMon
        true
    else if tzDayOfWeek == dayofweek.tuesday and showTue
        true
    else if tzDayOfWeek == dayofweek.wednesday and showWed
        true
    else if tzDayOfWeek == dayofweek.thursday and showThu
        true
    else if tzDayOfWeek == dayofweek.friday and showFri
        true
    else if tzDayOfWeek == dayofweek.saturday and showSat
        true
    else if tzDayOfWeek == dayofweek.sunday and showSun
        true
    else
        false
else
    false

bgcolor(color=active2 ? rangeColor : na, title="Session Background")

bullSigInt = bullSig ? 1: 0   //Bool to int
bearSigInt = bearSig ? 1: 0   //Bool to int
bullishEngulfingInt = bullishEngulfing ? 1: 0   //Bool to int
bearishEngulfingInt = bearishEngulfing ? 1: 0   //Bool to int


// End ###

// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MATICUSDT_30Min_fe3d841c(bullishEngulfingInt, smma4, bullSigInt, smma2, ema2, bearSigInt, bearishEngulfingInt, smma3, smma1)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


