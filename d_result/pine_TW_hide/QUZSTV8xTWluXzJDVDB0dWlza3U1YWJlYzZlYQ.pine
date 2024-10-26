//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: AFRM_1Min_2CT0_5abec6ea Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2CT0_5abec6ea", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_5abec6ea(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.007731 )
		if( ad_mf <= 0.729866 )
			if( ad <= -829.799 )
				if( ema1 <= 30.5663 )
					if( ad_mf <= -29618.2 )
						if( ema2 <= 30.494 )
							if( ad_mf <= -129611 )
								ret := -0.615385
							if( ad_mf > -129611 )
								if( mf <= -0.17514 )
									ret := 0.534247
								if( mf > -0.17514 )
									ret := 0.294737
						if( ema2 > 30.494 )
							if( mf <= -0.179465 )
								ret := 0.913043 // buy
							if( mf > -0.179465 )
								ret := 0.500000
					if( ad_mf > -29618.2 )
						if( ad_mf <= -21747.2 )
							if( ema13 <= 0.017095 )
								if( ad_mf <= -23371.6 )
									ret := -0.150602
								if( ad_mf > -23371.6 )
									ret := -0.695652
							if( ema13 > 0.017095 )
								ret := 0.400000
						if( ad_mf > -21747.2 )
							if( ema1 <= 30.5423 )
								if( ema12 <= -0.160308 )
									ret := 0.435897
								if( ema12 > -0.160308 )
									ret := 0.053627
							if( ema1 > 30.5423 )
								if( ema3 <= 30.6316 )
									ret := 0.333333
								if( ema3 > 30.6316 )
									ret := 0.727273 // buy
				if( ema1 > 30.5663 )
					if( ema12 <= -0.434818 )
						if( ema12 <= -0.559675 )
							ret := -0.600000
						if( ema12 > -0.559675 )
							if( ema12 <= -0.472252 )
								ret := -1.000000 // sell
							if( ema12 > -0.472252 )
								ret := -0.909091 // sell
					if( ema12 > -0.434818 )
						if( ema3 <= 42.285 )
							if( tema <= 40.4689 )
								if( ad_mf <= -838.326 )
									ret := -0.011814
								if( ad_mf > -838.326 )
									ret := -0.888889 // sell
							if( tema > 40.4689 )
								if( ema12 <= -0.134334 )
									ret := 0.428571
								if( ema12 > -0.134334 )
									ret := -0.164995
						if( ema3 > 42.285 )
							if( mf <= -0.221056 )
								if( ema2 <= 43.456 )
									ret := 0.434483
								if( ema2 > 43.456 )
									ret := 0.149206
							if( mf > -0.221056 )
								if( ema1 <= 48.1032 )
									ret := 0.026283
								if( ema1 > 48.1032 )
									ret := 0.451613
			if( ad > -829.799 )
				if( ema1 <= 24.0365 )
					if( ema1 <= 23.9683 )
						if( ema3 <= 22.5676 )
							if( ema1 <= 22.0528 )
								ret := -0.272727
							if( ema1 > 22.0528 )
								if( ema2 <= 22.2779 )
									ret := -1.000000 // sell
								if( ema2 > 22.2779 )
									ret := -0.583333
						if( ema3 > 22.5676 )
							if( ad_mf <= -0.03956 )
								if( ema2 <= 23.0295 )
									ret := -0.200000
								if( ema2 > 23.0295 )
									ret := -0.666667
							if( ad_mf > -0.03956 )
								if( ad_mf <= 0.192167 )
									ret := 0.916667 // buy
								if( ad_mf > 0.192167 )
									ret := 0.416667
					if( ema1 > 23.9683 )
						ret := -1.000000 // sell
				if( ema1 > 24.0365 )
					if( ema1 <= 28.5619 )
						if( ad_mf <= 0.09135 )
							if( mf <= 0.145045 )
								if( tema <= 26.098 )
									ret := -0.116667
								if( tema > 26.098 )
									ret := 0.217153
							if( mf > 0.145045 )
								if( ema1 <= 26.4739 )
									ret := 0.308370
								if( ema1 > 26.4739 )
									ret := 0.571930
						if( ad_mf > 0.09135 )
							if( ema3 <= 26.2281 )
								if( ema2 <= 25.6896 )
									ret := 0.427746
								if( ema2 > 25.6896 )
									ret := -0.560000
							if( ema3 > 26.2281 )
								if( ema12 <= -0.02299 )
									ret := 0.788462 // buy
								if( ema12 > -0.02299 )
									ret := 0.482143
					if( ema1 > 28.5619 )
						if( ema2 <= 44.5316 )
							if( ema2 <= 29.6611 )
								if( ad <= -105.896 )
									ret := 0.375000
								if( ad > -105.896 )
									ret := -0.085714
							if( ema2 > 29.6611 )
								if( ema1 <= 30.9241 )
									ret := 0.219134
								if( ema1 > 30.9241 )
									ret := 0.093507
						if( ema2 > 44.5316 )
							if( ema12 <= 0.005795 )
								if( ema3 <= 44.8039 )
									ret := 0.608333
								if( ema3 > 44.8039 )
									ret := 0.292517
							if( ema12 > 0.005795 )
								ret := -0.350000
		if( ad_mf > 0.729866 )
			if( mf <= -0.394024 )
				if( tema <= 31.5089 )
					if( ad <= 5287.63 )
						if( ema1 <= 25.0617 )
							ret := -0.944444 // sell
						if( ema1 > 25.0617 )
							if( ad_mf <= 384.114 )
								if( ema1 <= 29.1587 )
									ret := 0.333333
								if( ema1 > 29.1587 )
									ret := 0.000000
							if( ad_mf > 384.114 )
								if( ema13 <= -0.088344 )
									ret := -0.161290
								if( ema13 > -0.088344 )
									ret := -0.430556
					if( ad > 5287.63 )
						if( ema1 <= 28.3955 )
							if( ema3 <= 27.6727 )
								ret := 0.555556
							if( ema3 > 27.6727 )
								ret := 1.000000 // buy
						if( ema1 > 28.3955 )
							if( ema12 <= -0.029503 )
								ret := -0.500000
							if( ema12 > -0.029503 )
								ret := 0.846154 // buy
				if( tema > 31.5089 )
					if( ema3 <= 35.6789 )
						if( ema12 <= -0.018813 )
							if( ad_mf <= 873.062 )
								if( ema3 <= 34.2132 )
									ret := -1.000000 // sell
								if( ema3 > 34.2132 )
									ret := -0.800000 // sell
							if( ad_mf > 873.062 )
								if( ad <= 5448.29 )
									ret := -0.176471
								if( ad > 5448.29 )
									ret := -0.888889 // sell
						if( ema12 > -0.018813 )
							ret := -0.136364
					if( ema3 > 35.6789 )
						if( ad_mf <= 9274.77 )
							if( ad_mf <= 1166.55 )
								if( mf <= -0.58521 )
									ret := 0.120000
								if( mf > -0.58521 )
									ret := -0.534884
							if( ad_mf > 1166.55 )
								if( ad <= 1417 )
									ret := 0.666667
								if( ad > 1417 )
									ret := -0.033333
						if( ad_mf > 9274.77 )
							if( ad_mf <= 15473.9 )
								ret := -1.000000 // sell
							if( ad_mf > 15473.9 )
								ret := -0.428571
			if( mf > -0.394024 )
				if( ema13 <= -0.097017 )
					if( ad <= 896.414 )
						if( mf <= -0.326531 )
							ret := -0.625000
						if( mf > -0.326531 )
							if( ad <= 859.119 )
								if( ema12 <= -0.104092 )
									ret := 0.686275
								if( ema12 > -0.104092 )
									ret := 0.240000
							if( ad > 859.119 )
								if( ad_mf <= 868.666 )
									ret := 1.000000 // buy
								if( ad_mf > 868.666 )
									ret := 0.500000
					if( ad > 896.414 )
						if( ema1 <= 46.2994 )
							if( ema3 <= 30.8113 )
								if( ema12 <= -0.113736 )
									ret := 0.345238
								if( ema12 > -0.113736 )
									ret := 0.113759
							if( ema3 > 30.8113 )
								if( ad <= 105213 )
									ret := 0.007485
								if( ad > 105213 )
									ret := 0.632653
						if( ema1 > 46.2994 )
							if( ema12 <= -0.133691 )
								ret := -0.043478
							if( ema12 > -0.133691 )
								if( ema3 <= 47.5649 )
									ret := -0.875000 // sell
								if( ema3 > 47.5649 )
									ret := -0.250000
				if( ema13 > -0.097017 )
					if( tema <= 44.3575 )
						if( mf <= 0.399231 )
							if( ad_mf <= 2053.87 )
								if( ad_mf <= 2016.24 )
									ret := -0.123266
								if( ad_mf > 2016.24 )
									ret := -0.698630
							if( ad_mf > 2053.87 )
								if( ema12 <= -0.008621 )
									ret := -0.028537
								if( ema12 > -0.008621 )
									ret := 0.055812
						if( mf > 0.399231 )
							if( tema <= 26.9193 )
								ret := 0.214286
							if( tema > 26.9193 )
								if( ad <= 1136.51 )
									ret := -0.581395
								if( ad > 1136.51 )
									ret := -0.307229
					if( tema > 44.3575 )
						if( ad <= 17175.5 )
							if( ema13 <= -0.024568 )
								if( tema <= 46.2149 )
									ret := -0.280702
								if( tema > 46.2149 )
									ret := 0.150943
							if( ema13 > -0.024568 )
								if( ad <= 5119.08 )
									ret := 0.222222
								if( ad > 5119.08 )
									ret := -0.086957
						if( ad > 17175.5 )
							if( ema1 <= 48.676 )
								if( ad <= 33854 )
									ret := 0.781250 // buy
								if( ad > 33854 )
									ret := 0.428571
							if( ema1 > 48.676 )
								ret := 0.000000
	if( ema12 > 0.007731 )
		if( ema3 <= 24.0652 )
			if( ema13 <= 0.128824 )
				if( ema2 <= 23.9916 )
					if( ad <= 885.897 )
						if( ema12 <= 0.042028 )
							if( ema12 <= 0.023899 )
								ret := 0.500000
							if( ema12 > 0.023899 )
								if( ad_mf <= -0.021793 )
									ret := 0.750000 // buy
								if( ad_mf > -0.021793 )
									ret := 1.000000 // buy
						if( ema12 > 0.042028 )
							if( tema <= 22.5426 )
								ret := 0.650000
							if( tema > 22.5426 )
								ret := -0.230769
					if( ad > 885.897 )
						ret := 0.076923
				if( ema2 > 23.9916 )
					ret := 1.000000 // buy
			if( ema13 > 0.128824 )
				if( ema12 <= 0.11495 )
					if( tema <= 23.4559 )
						ret := -1.000000 // sell
					if( tema > 23.4559 )
						ret := 0.083333
				if( ema12 > 0.11495 )
					if( tema <= 24.2999 )
						if( ad_mf <= 13676.2 )
							ret := 0.700000 // buy
						if( ad_mf > 13676.2 )
							ret := 0.875000 // buy
					if( tema > 24.2999 )
						ret := -0.153846
		if( ema3 > 24.0652 )
			if( tema <= 31.3046 )
				if( ad_mf <= -0.328377 )
					if( ema3 <= 30.4968 )
						if( tema <= 30.4766 )
							if( mf <= -0.227291 )
								if( ema12 <= 0.049531 )
									ret := 0.143939
								if( ema12 > 0.049531 )
									ret := 0.634615
							if( mf > -0.227291 )
								if( ad_mf <= -0.385784 )
									ret := -0.021475
								if( ad_mf > -0.385784 )
									ret := 0.438462
						if( tema > 30.4766 )
							if( ema2 <= 30.4803 )
								if( ema13 <= 0.062254 )
									ret := -0.656716
								if( ema13 > 0.062254 )
									ret := -0.200000
							if( ema2 > 30.4803 )
								if( ad_mf <= -2426.22 )
									ret := -0.333333
								if( ad_mf > -2426.22 )
									ret := 0.640000
					if( ema3 > 30.4968 )
						if( mf <= 0.053908 )
							if( mf <= 0.036261 )
								if( ad <= -464.795 )
									ret := 0.049724
								if( ad > -464.795 )
									ret := -0.636364
							if( mf > 0.036261 )
								if( ema1 <= 30.9256 )
									ret := -0.760000 // sell
								if( ema1 > 30.9256 )
									ret := -0.333333
						if( mf > 0.053908 )
							if( ema3 <= 30.7775 )
								if( ad <= -20349.1 )
									ret := -0.130435
								if( ad > -20349.1 )
									ret := 0.403315
							if( ema3 > 30.7775 )
								if( ema1 <= 31.214 )
									ret := 0.039755
								if( ema1 > 31.214 )
									ret := 0.583333
				if( ad_mf > -0.328377 )
					if( ad_mf <= 2351.55 )
						if( ema3 <= 29.7055 )
							if( tema <= 24.3126 )
								if( ema13 <= 0.063074 )
									ret := -0.631579
								if( ema13 > 0.063074 )
									ret := -1.000000 // sell
							if( tema > 24.3126 )
								if( ad_mf <= -0.18195 )
									ret := -0.326816
								if( ad_mf > -0.18195 )
									ret := -0.092507
						if( ema3 > 29.7055 )
							if( ema12 <= 0.208482 )
								if( mf <= 0.098939 )
									ret := -0.462032
								if( mf > 0.098939 )
									ret := -0.238014
							if( ema12 > 0.208482 )
								ret := 1.000000 // buy
					if( ad_mf > 2351.55 )
						if( ema12 <= 0.073481 )
							if( ad <= 5412.42 )
								if( ad <= 5153.86 )
									ret := -0.071975
								if( ad > 5153.86 )
									ret := -0.495868
							if( ad > 5412.42 )
								if( ad_mf <= 6341.01 )
									ret := 0.285714
								if( ad_mf > 6341.01 )
									ret := -0.027060
						if( ema12 > 0.073481 )
							if( ema12 <= 0.116098 )
								if( ema1 <= 27.7169 )
									ret := -0.598485
								if( ema1 > 27.7169 )
									ret := -0.192708
							if( ema12 > 0.116098 )
								if( mf <= 0.561081 )
									ret := 0.084337
								if( mf > 0.561081 )
									ret := -0.846154 // sell
			if( tema > 31.3046 )
				if( ad_mf <= -722.564 )
					if( ema12 <= 0.196034 )
						if( ad_mf <= -863.925 )
							if( ema2 <= 31.2171 )
								if( ema12 <= 0.108216 )
									ret := 0.636364
								if( ema12 > 0.108216 )
									ret := 0.250000
							if( ema2 > 31.2171 )
								if( mf <= -0.024908 )
									ret := 0.084513
								if( mf > -0.024908 )
									ret := 0.015080
						if( ad_mf > -863.925 )
							if( ema2 <= 38.0953 )
								if( ema2 <= 31.8243 )
									ret := 0.961538 // buy
								if( ema2 > 31.8243 )
									ret := 0.594595
							if( ema2 > 38.0953 )
								if( tema <= 41.9387 )
									ret := 0.043478
								if( tema > 41.9387 )
									ret := 0.458333
					if( ema12 > 0.196034 )
						if( ema3 <= 34.6582 )
							if( ema13 <= 0.693066 )
								if( ema13 <= 0.360037 )
									ret := 0.413793
								if( ema13 > 0.360037 )
									ret := 0.906977 // buy
							if( ema13 > 0.693066 )
								if( ema3 <= 31.3611 )
									ret := -0.466667
								if( ema3 > 31.3611 )
									ret := 0.733333 // buy
						if( ema3 > 34.6582 )
							if( mf <= 0.038044 )
								if( ema3 <= 39.2315 )
									ret := 0.777778 // buy
								if( ema3 > 39.2315 )
									ret := -0.111111
							if( mf > 0.038044 )
								if( ema12 <= 0.640645 )
									ret := -0.053333
								if( ema12 > 0.640645 )
									ret := -0.600000
				if( ad_mf > -722.564 )
					if( ema3 <= 32.9172 )
						if( ema12 <= 0.132397 )
							if( ad <= 1521.44 )
								if( tema <= 32.1796 )
									ret := -0.314506
								if( tema > 32.1796 )
									ret := 0.068913
							if( ad > 1521.44 )
								if( ad <= 3275.44 )
									ret := 0.178782
								if( ad > 3275.44 )
									ret := -0.040311
						if( ema12 > 0.132397 )
							if( ad <= 35997.3 )
								if( ad_mf <= 16333.6 )
									ret := 0.308036
								if( ad_mf > 16333.6 )
									ret := 0.859155 // buy
							if( ad > 35997.3 )
								if( ema12 <= 0.310343 )
									ret := -0.506329
								if( ema12 > 0.310343 )
									ret := 0.173913
					if( ema3 > 32.9172 )
						if( ema3 <= 35.9355 )
							if( ema13 <= 0.058395 )
								if( ad <= 54774.9 )
									ret := -0.105535
								if( ad > 54774.9 )
									ret := 0.500000
							if( ema13 > 0.058395 )
								if( mf <= 0.0634 )
									ret := -0.432000
								if( mf > 0.0634 )
									ret := -0.154815
						if( ema3 > 35.9355 )
							if( ad_mf <= 5257.92 )
								if( ema3 <= 39.6612 )
									ret := -0.017625
								if( ema3 > 39.6612 )
									ret := -0.155924
							if( ad_mf > 5257.92 )
								if( ema13 <= -0.049316 )
									ret := 1.000000 // buy
								if( ema13 > -0.049316 )
									ret := 0.001845
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_5abec6ea(ad, mf, ad_mf, ema3, tema, ema2, ema12, ema13, ema1)

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


