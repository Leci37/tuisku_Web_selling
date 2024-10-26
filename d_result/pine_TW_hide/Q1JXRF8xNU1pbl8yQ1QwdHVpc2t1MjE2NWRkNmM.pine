//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: CRWD_15Min_2CT0_2165dd6c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_15Min_2CT0_2165dd6c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_15Min_2165dd6c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 600.971 )
		if( ad <= -6732.05 )
			if( ad_mf <= -115802 )
				if( ema1 <= 303.481 )
					if( ad <= -208196 )
						if( ad_mf <= -246046 )
							if( ema13 <= -1.69179 )
								if( ema3 <= 246.807 )
									ret := 0.280374
								if( ema3 > 246.807 )
									ret := -0.205607
							if( ema13 > -1.69179 )
								if( ad_mf <= -364355 )
									ret := 0.091181
								if( ad_mf > -364355 )
									ret := -0.076613
						if( ad_mf > -246046 )
							if( tema <= 190.2 )
								if( ad_mf <= -215190 )
									ret := -0.428954
								if( ad_mf > -215190 )
									ret := 0.121622
							if( tema > 190.2 )
								if( ad <= -224256 )
									ret := 0.250000
								if( ad > -224256 )
									ret := -0.283333
					if( ad > -208196 )
						if( ema3 <= 191.1 )
							if( ema2 <= 188.762 )
								if( ema3 <= 40.923 )
									ret := -0.285714
								if( ema3 > 40.923 )
									ret := 0.186335
							if( ema2 > 188.762 )
								if( tema <= 192.697 )
									ret := 0.861111 // buy
								if( tema > 192.697 )
									ret := 0.100000
						if( ema3 > 191.1 )
							if( ad_mf <= -116634 )
								if( ema12 <= 0.228616 )
									ret := 0.125796
								if( ema12 > 0.228616 )
									ret := -0.050157
							if( ad_mf > -116634 )
								ret := -0.880000 // sell
				if( ema1 > 303.481 )
					if( ad <= -847319 )
						ret := 0.352941
					if( ad > -847319 )
						if( ad_mf <= -170602 )
							if( ad <= -188098 )
								if( tema <= 377.371 )
									ret := -0.377049
								if( tema > 377.371 )
									ret := 0.055556
							if( ad > -188098 )
								if( ad_mf <= -176063 )
									ret := -1.000000 // sell
								if( ad_mf > -176063 )
									ret := -0.600000
						if( ad_mf > -170602 )
							if( ema13 <= -3.99448 )
								ret := 0.500000
							if( ema13 > -3.99448 )
								if( ema13 <= -2.43764 )
									ret := -0.714286 // sell
								if( ema13 > -2.43764 )
									ret := -0.152542
			if( ad_mf > -115802 )
				if( ema2 <= 150.846 )
					if( ad <= -7716.23 )
						if( ad_mf <= -10622.2 )
							if( ema3 <= 45.5505 )
								if( ad <= -73787.9 )
									ret := 0.095238
								if( ad > -73787.9 )
									ret := 0.724138 // buy
							if( ema3 > 45.5505 )
								if( ad <= -10847.6 )
									ret := 0.011636
								if( ad > -10847.6 )
									ret := -0.854545 // sell
						if( ad_mf > -10622.2 )
							if( ad <= -9945.93 )
								if( mf <= -0.095392 )
									ret := 0.780000 // buy
								if( mf > -0.095392 )
									ret := 0.348485
							if( ad > -9945.93 )
								if( mf <= -0.368437 )
									ret := 0.809524 // buy
								if( mf > -0.368437 )
									ret := 0.020253
					if( ad > -7716.23 )
						if( ema3 <= 135.505 )
							if( ema12 <= -0.26026 )
								if( ema2 <= 96.0722 )
									ret := -0.810127 // sell
								if( ema2 > 96.0722 )
									ret := 0.000000
							if( ema12 > -0.26026 )
								if( ema3 <= 65.318 )
									ret := 0.013514
								if( ema3 > 65.318 )
									ret := -0.451220
						if( ema3 > 135.505 )
							if( ema12 <= 0.08338 )
								if( ema12 <= -0.05217 )
									ret := 0.555556
								if( ema12 > -0.05217 )
									ret := 1.000000 // buy
							if( ema12 > 0.08338 )
								ret := -0.071429
				if( ema2 > 150.846 )
					if( ema12 <= -0.811897 )
						if( ema3 <= 295.176 )
							if( ad_mf <= -8195.5 )
								if( ad_mf <= -81056.4 )
									ret := -0.339332
								if( ad_mf > -81056.4 )
									ret := -0.136921
							if( ad_mf > -8195.5 )
								if( mf <= -0.062994 )
									ret := -0.891304 // sell
								if( mf > -0.062994 )
									ret := 0.000000
						if( ema3 > 295.176 )
							if( ema2 <= 333.982 )
								if( ad <= -54882.4 )
									ret := 0.287129
								if( ad > -54882.4 )
									ret := 0.005780
							if( ema2 > 333.982 )
								if( ema1 <= 340.938 )
									ret := -0.666667
								if( ema1 > 340.938 )
									ret := 0.000000
					if( ema12 > -0.811897 )
						if( ema13 <= 1.80916 )
							if( ema1 <= 301.037 )
								if( mf <= -0.213368 )
									ret := -0.204604
								if( mf > -0.213368 )
									ret := 0.004643
							if( ema1 > 301.037 )
								if( ad_mf <= -98568 )
									ret := -0.656250
								if( ad_mf > -98568 )
									ret := -0.140036
						if( ema13 > 1.80916 )
							if( ema12 <= 2.41145 )
								if( mf <= 0.345529 )
									ret := -0.181215
								if( mf > 0.345529 )
									ret := 0.104938
							if( ema12 > 2.41145 )
								if( ema2 <= 265.347 )
									ret := -0.322581
								if( ema2 > 265.347 )
									ret := -0.693878
		if( ad > -6732.05 )
			if( ema12 <= 0.003885 )
				if( tema <= 90.3153 )
					if( ema2 <= 70.4978 )
						if( mf <= 0.162347 )
							if( ad <= -4520.65 )
								if( ema3 <= 61.4304 )
									ret := 0.882353 // buy
								if( ema3 > 61.4304 )
									ret := 0.470588
							if( ad > -4520.65 )
								if( mf <= -0.467663 )
									ret := 0.587629
								if( mf > -0.467663 )
									ret := 0.186212
						if( mf > 0.162347 )
							if( ad_mf <= -2262.13 )
								if( ad <= -2902.59 )
									ret := 0.169811
								if( ad > -2902.59 )
									ret := 0.969697 // buy
							if( ad_mf > -2262.13 )
								if( ema13 <= -0.112171 )
									ret := -0.259843
								if( ema13 > -0.112171 )
									ret := -0.595238
					if( ema2 > 70.4978 )
						if( tema <= 78.5711 )
							if( ad_mf <= -1027.14 )
								if( ema1 <= 72.1842 )
									ret := 0.772727 // buy
								if( ema1 > 72.1842 )
									ret := 0.172043
							if( ad_mf > -1027.14 )
								if( ema13 <= 0.005017 )
									ret := 0.801136 // buy
								if( ema13 > 0.005017 )
									ret := 0.392857
						if( tema > 78.5711 )
							if( mf <= 0.006505 )
								if( ema3 <= 88.0341 )
									ret := 0.356436
								if( ema3 > 88.0341 )
									ret := -0.126761
							if( mf > 0.006505 )
								if( ema13 <= -0.08896 )
									ret := 0.661417
								if( ema13 > -0.08896 )
									ret := -0.095238
				if( tema > 90.3153 )
					if( ema12 <= -0.648019 )
						if( mf <= -0.034094 )
							if( ema3 <= 186.814 )
								if( mf <= -0.189458 )
									ret := 0.352018
								if( mf > -0.189458 )
									ret := 0.580913
							if( ema3 > 186.814 )
								if( ema3 <= 255.534 )
									ret := 0.245833
								if( ema3 > 255.534 )
									ret := 0.071633
						if( mf > -0.034094 )
							if( ema2 <= 158.106 )
								if( ema3 <= 118.818 )
									ret := 0.181818
								if( ema3 > 118.818 )
									ret := -0.463158
							if( ema2 > 158.106 )
								if( ema13 <= -1.51071 )
									ret := 0.061576
								if( ema13 > -1.51071 )
									ret := 0.381481
					if( ema12 > -0.648019 )
						if( ema13 <= -1.3351 )
							if( ema2 <= 200.83 )
								if( ema13 <= -1.39838 )
									ret := -0.629032
								if( ema13 > -1.39838 )
									ret := -0.259259
							if( ema2 > 200.83 )
								if( tema <= 318.453 )
									ret := 0.000000
								if( tema > 318.453 )
									ret := -0.466667
						if( ema13 > -1.3351 )
							if( ema2 <= 138.921 )
								if( ema2 <= 135.821 )
									ret := 0.075989
								if( ema2 > 135.821 )
									ret := -0.283422
							if( ema2 > 138.921 )
								if( ema3 <= 145.751 )
									ret := 0.408867
								if( ema3 > 145.751 )
									ret := 0.136979
			if( ema12 > 0.003885 )
				if( ema12 <= 1.22308 )
					if( mf <= 0.56492 )
						if( ema3 <= 45.547 )
							if( mf <= -0.711099 )
								ret := 0.894737 // buy
							if( mf > -0.711099 )
								if( mf <= 0.199108 )
									ret := -0.384615
								if( mf > 0.199108 )
									ret := -1.000000 // sell
						if( ema3 > 45.547 )
							if( ema13 <= -0.004786 )
								if( ema2 <= 65.2163 )
									ret := -0.578947
								if( ema2 > 65.2163 )
									ret := -0.132107
							if( ema13 > -0.004786 )
								if( ad_mf <= -453.977 )
									ret := 0.068141
								if( ad_mf > -453.977 )
									ret := -0.091766
					if( mf > 0.56492 )
						if( ema3 <= 240.282 )
							if( ema3 <= 236.319 )
								if( ema1 <= 106.242 )
									ret := 0.567901
								if( ema1 > 106.242 )
									ret := 0.189542
							if( ema3 > 236.319 )
								if( mf <= 0.810919 )
									ret := 0.823529 // buy
								if( mf > 0.810919 )
									ret := 1.000000 // buy
						if( ema3 > 240.282 )
							if( ema2 <= 242.512 )
								ret := -0.882353 // sell
							if( ema2 > 242.512 )
								if( mf <= 0.768009 )
									ret := 0.000000
								if( mf > 0.768009 )
									ret := 0.375000
				if( ema12 > 1.22308 )
					if( ema2 <= 87.5346 )
						ret := 0.764706 // buy
					if( ema2 > 87.5346 )
						if( ema13 <= 2.25491 )
							if( ad <= -60.1832 )
								if( ema12 <= 1.32025 )
									ret := -0.300000
								if( ema12 > 1.32025 )
									ret := 0.076923
							if( ad > -60.1832 )
								if( mf <= 0.257796 )
									ret := -0.770833 // sell
								if( mf > 0.257796 )
									ret := -0.437500
						if( ema13 > 2.25491 )
							if( mf <= 0.443344 )
								if( ema2 <= 159.582 )
									ret := -0.745098 // sell
								if( ema2 > 159.582 )
									ret := -0.179931
							if( mf > 0.443344 )
								if( ema2 <= 173.525 )
									ret := 0.535714
								if( ema2 > 173.525 )
									ret := -0.025641
	if( ad > 600.971 )
		if( tema <= 46.9233 )
			if( ad <= 209122 )
				if( ad <= 3539.5 )
					if( ema13 <= 0.098678 )
						if( ema12 <= -0.085141 )
							ret := 0.200000
						if( ema12 > -0.085141 )
							ret := -0.937500 // sell
					if( ema13 > 0.098678 )
						ret := 0.550000
				if( ad > 3539.5 )
					if( ema13 <= -0.434977 )
						if( ema13 <= -0.905927 )
							if( ad_mf <= 37235.9 )
								ret := 0.000000
							if( ad_mf > 37235.9 )
								if( ema12 <= -0.754642 )
									ret := 0.916667 // buy
								if( ema12 > -0.754642 )
									ret := 0.454545
						if( ema13 > -0.905927 )
							if( ema12 <= -0.266606 )
								ret := 1.000000 // buy
							if( ema12 > -0.266606 )
								ret := 0.555556
					if( ema13 > -0.434977 )
						if( ema1 <= 39.4725 )
							if( ema2 <= 38.1755 )
								ret := 0.285714
							if( ema2 > 38.1755 )
								ret := -0.692308
						if( ema1 > 39.4725 )
							if( ad <= 119223 )
								if( ema1 <= 45.9285 )
									ret := 0.800000 // buy
								if( ema1 > 45.9285 )
									ret := 0.047619
							if( ad > 119223 )
								if( ema2 <= 41.6052 )
									ret := 0.200000
								if( ema2 > 41.6052 )
									ret := -0.200000
			if( ad > 209122 )
				if( ema12 <= 0.04505 )
					ret := 0.416667
				if( ema12 > 0.04505 )
					ret := -0.769231 // sell
		if( tema > 46.9233 )
			if( ad <= 1632.34 )
				if( tema <= 89.5053 )
					if( ema12 <= -0.005895 )
						if( ema13 <= -0.990393 )
							ret := -0.352941
						if( ema13 > -0.990393 )
							if( ema13 <= -0.042732 )
								if( ema13 <= -0.359635 )
									ret := 0.656716
								if( ema13 > -0.359635 )
									ret := 0.349515
							if( ema13 > -0.042732 )
								ret := -0.277778
					if( ema12 > -0.005895 )
						if( ad <= 700.193 )
							if( ema12 <= 0.418533 )
								if( mf <= 0.169713 )
									ret := 0.043478
								if( mf > 0.169713 )
									ret := 0.538462
							if( ema12 > 0.418533 )
								ret := -0.600000
						if( ad > 700.193 )
							if( mf <= -0.404542 )
								ret := 0.083333
							if( mf > -0.404542 )
								if( ema3 <= 49.5433 )
									ret := 0.043478
								if( ema3 > 49.5433 )
									ret := -0.640827
				if( tema > 89.5053 )
					if( ema2 <= 91.2612 )
						ret := 1.000000 // buy
					if( ema2 > 91.2612 )
						if( ad <= 1062.57 )
							if( ad_mf <= 670.951 )
								if( tema <= 198.072 )
									ret := -0.441315
								if( tema > 198.072 )
									ret := -0.042373
							if( ad_mf > 670.951 )
								if( ema12 <= 0.888278 )
									ret := 0.080257
								if( ema12 > 0.888278 )
									ret := -0.189394
						if( ad > 1062.57 )
							if( ema1 <= 155.891 )
								if( ema13 <= 0.56335 )
									ret := -0.384211
								if( ema13 > 0.56335 )
									ret := -0.052980
							if( ema1 > 155.891 )
								if( tema <= 166.385 )
									ret := 0.136842
								if( tema > 166.385 )
									ret := -0.165119
			if( ad > 1632.34 )
				if( ema12 <= -0.722265 )
					if( ema13 <= -15.1348 )
						ret := 1.000000 // buy
					if( ema13 > -15.1348 )
						if( ema1 <= 142.312 )
							if( ema2 <= 142.856 )
								if( ema13 <= -6.61358 )
									ret := -0.600000
								if( ema13 > -6.61358 )
									ret := 0.155738
							if( ema2 > 142.856 )
								ret := 0.894737 // buy
						if( ema1 > 142.312 )
							if( tema <= 141.481 )
								ret := -0.769231 // sell
							if( tema > 141.481 )
								if( ema12 <= -5.32373 )
									ret := -0.652174
								if( ema12 > -5.32373 )
									ret := 0.037025
				if( ema12 > -0.722265 )
					if( ema2 <= 172.649 )
						if( ema13 <= 0.008856 )
							if( mf <= -0.271269 )
								if( ema2 <= 60.0588 )
									ret := 0.260274
								if( ema2 > 60.0588 )
									ret := -0.247396
							if( mf > -0.271269 )
								if( tema <= 58.5801 )
									ret := -0.083665
								if( tema > 58.5801 )
									ret := 0.066472
						if( ema13 > 0.008856 )
							if( ema13 <= 0.02063 )
								if( ad <= 138479 )
									ret := -0.340000
								if( ad > 138479 )
									ret := -0.750000 // sell
							if( ema13 > 0.02063 )
								if( ad <= 284199 )
									ret := -0.030480
								if( ad > 284199 )
									ret := -0.157823
					if( ema2 > 172.649 )
						if( ema12 <= -0.332785 )
							if( ad_mf <= 119402 )
								if( mf <= -0.61377 )
									ret := 0.687500
								if( mf > -0.61377 )
									ret := -0.186946
							if( ad_mf > 119402 )
								if( ema1 <= 258.125 )
									ret := -0.474359
								if( ema1 > 258.125 )
									ret := 0.178571
						if( ema12 > -0.332785 )
							if( ema2 <= 179.969 )
								if( mf <= -0.566422 )
									ret := -1.000000 // sell
								if( mf > -0.566422 )
									ret := -0.188746
							if( ema2 > 179.969 )
								if( ema2 <= 271.496 )
									ret := -0.065821
								if( ema2 > 271.496 )
									ret := 0.023017
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_CRWD_15Min_2165dd6c(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


