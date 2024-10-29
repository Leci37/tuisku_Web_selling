//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: MSFT_5Min_2CT0_ddfc76ee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_5Min_2CT0_ddfc76ee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_5Min_ddfc76ee(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= 1220.88 )
		if( ad <= 1069.85 )
			if( ema13 <= 0.28357 )
				if( ema2 <= 329.925 )
					if( ema12 <= -0.264979 )
						if( ema2 <= 317.088 )
							if( ema13 <= -0.596113 )
								if( ad_mf <= -12352 )
									ret := 0.482759
								if( ad_mf > -12352 )
									ret := 0.752577 // buy
							if( ema13 > -0.596113 )
								if( ema1 <= 312.146 )
									ret := 0.263158
								if( ema1 > 312.146 )
									ret := 0.548387
						if( ema2 > 317.088 )
							if( tema <= 328.573 )
								if( ad_mf <= 0.271338 )
									ret := 0.216774
								if( ad_mf > 0.271338 )
									ret := -0.253968
							if( tema > 328.573 )
								if( ad <= -173580 )
									ret := 0.100000
								if( ad > -173580 )
									ret := -0.666667
					if( ema12 > -0.264979 )
						if( ema2 <= 295.031 )
							if( tema <= 281.883 )
								if( ema3 <= 280.024 )
									ret := -0.666667
								if( ema3 > 280.024 )
									ret := -0.180328
							if( tema > 281.883 )
								if( ad <= -223761 )
									ret := -0.380952
								if( ad > -223761 )
									ret := -0.888889 // sell
						if( ema2 > 295.031 )
							if( ema1 <= 306.671 )
								if( ema3 <= 306.094 )
									ret := 0.233236
								if( ema3 > 306.094 )
									ret := 0.670455
							if( ema1 > 306.671 )
								if( mf <= -0.552153 )
									ret := 0.310811
								if( mf > -0.552153 )
									ret := 0.044357
				if( ema2 > 329.925 )
					if( ad_mf <= -9970.8 )
						if( ad <= -10368.6 )
							if( ema13 <= -0.397106 )
								if( ema13 <= -3.2758 )
									ret := 0.491071
								if( ema13 > -3.2758 )
									ret := -0.062161
							if( ema13 > -0.397106 )
								if( ad_mf <= -59363.2 )
									ret := 0.071865
								if( ad_mf > -59363.2 )
									ret := -0.011045
						if( ad > -10368.6 )
							if( ema13 <= 0.061778 )
								if( mf <= -0.274304 )
									ret := -0.400000
								if( mf > -0.274304 )
									ret := -0.823529 // sell
							if( ema13 > 0.061778 )
								ret := 0.000000
					if( ad_mf > -9970.8 )
						if( ad <= -8522.46 )
							if( ema12 <= -0.604467 )
								if( ema2 <= 424.221 )
									ret := -0.875000 // sell
								if( ema2 > 424.221 )
									ret := 0.818182 // buy
							if( ema12 > -0.604467 )
								if( ema12 <= -0.36554 )
									ret := 0.708333 // buy
								if( ema12 > -0.36554 )
									ret := 0.313208
						if( ad > -8522.46 )
							if( ad <= 1051.75 )
								if( ema13 <= -0.27276 )
									ret := 0.122346
								if( ema13 > -0.27276 )
									ret := 0.021109
							if( ad > 1051.75 )
								if( mf <= 0.007043 )
									ret := -0.621622
								if( mf > 0.007043 )
									ret := 0.333333
			if( ema13 > 0.28357 )
				if( ad <= -967 )
					if( ad <= -274607 )
						if( ad_mf <= -700343 )
							if( ema2 <= 409.993 )
								if( mf <= -0.176299 )
									ret := -0.076923
								if( mf > -0.176299 )
									ret := -0.813333 // sell
							if( ema2 > 409.993 )
								if( ema12 <= 0.268691 )
									ret := -0.076923
								if( ema12 > 0.268691 )
									ret := 0.166667
						if( ad_mf > -700343 )
							if( ad_mf <= -303802 )
								if( ema12 <= 1.44423 )
									ret := -0.103896
								if( ema12 > 1.44423 )
									ret := 0.904762 // buy
							if( ad_mf > -303802 )
								if( ema12 <= 0.598945 )
									ret := -0.146341
								if( ema12 > 0.598945 )
									ret := -0.872727 // sell
					if( ad > -274607 )
						if( ad_mf <= -73639.1 )
							if( ad_mf <= -98776.4 )
								if( ema3 <= 397.813 )
									ret := 0.108488
								if( ema3 > 397.813 )
									ret := -0.094072
							if( ad_mf > -98776.4 )
								if( ad <= -96800.4 )
									ret := 0.869565 // buy
								if( ad > -96800.4 )
									ret := 0.202703
						if( ad_mf > -73639.1 )
							if( ad <= -58919.5 )
								if( ema1 <= 403.462 )
									ret := -0.379538
								if( ema1 > 403.462 )
									ret := -0.100437
							if( ad > -58919.5 )
								if( ema3 <= 427.203 )
									ret := 0.046089
								if( ema3 > 427.203 )
									ret := -0.098940
				if( ad > -967 )
					if( ema3 <= 333.647 )
						if( ad <= 972.755 )
							if( ad_mf <= -0.087661 )
								if( mf <= 0.165038 )
									ret := -0.042169
								if( mf > 0.165038 )
									ret := -0.316872
							if( ad_mf > -0.087661 )
								if( ema12 <= 0.410453 )
									ret := -0.359375
								if( ema12 > 0.410453 )
									ret := -0.766667 // sell
						if( ad > 972.755 )
							if( ema13 <= 0.469458 )
								ret := 0.142857
							if( ema13 > 0.469458 )
								ret := 0.800000 // buy
					if( ema3 > 333.647 )
						if( ema12 <= 0.856141 )
							if( tema <= 406.329 )
								if( ema2 <= 389.767 )
									ret := -0.118136
								if( ema2 > 389.767 )
									ret := 0.073232
							if( tema > 406.329 )
								if( tema <= 415.715 )
									ret := -0.339468
								if( tema > 415.715 )
									ret := -0.127642
						if( ema12 > 0.856141 )
							if( ema2 <= 433.737 )
								if( ema12 <= 0.934433 )
									ret := 0.666667
								if( ema12 > 0.934433 )
									ret := 0.263158
							if( ema2 > 433.737 )
								if( ema3 <= 434.765 )
									ret := 1.000000 // buy
								if( ema3 > 434.765 )
									ret := 0.400000
		if( ad > 1069.85 )
			if( ad <= 1202.06 )
				if( ad <= 1090.2 )
					if( ema12 <= -0.374231 )
						ret := 1.000000 // buy
					if( ema12 > -0.374231 )
						if( ema3 <= 341.541 )
							if( ad_mf <= 1075.16 )
								ret := 0.333333
							if( ad_mf > 1075.16 )
								ret := 0.777778 // buy
						if( ema3 > 341.541 )
							if( ad_mf <= 1079.02 )
								if( ema3 <= 407.593 )
									ret := 0.117647
								if( ema3 > 407.593 )
									ret := 0.833333 // buy
							if( ad_mf > 1079.02 )
								ret := -0.052632
				if( ad > 1090.2 )
					if( ema13 <= 0.165882 )
						if( tema <= 327.082 )
							if( ema13 <= -0.119888 )
								ret := 0.687500
							if( ema13 > -0.119888 )
								if( ema2 <= 320.335 )
									ret := -0.058824
								if( ema2 > 320.335 )
									ret := -0.769231 // sell
						if( tema > 327.082 )
							if( mf <= 0.159672 )
								if( mf <= -0.080544 )
									ret := 0.319328
								if( mf > -0.080544 )
									ret := 0.680412
							if( mf > 0.159672 )
								if( ema2 <= 343.301 )
									ret := 0.533333
								if( ema2 > 343.301 )
									ret := -0.108108
					if( ema13 > 0.165882 )
						if( mf <= 0.183876 )
							if( ema12 <= 0.11828 )
								if( ema3 <= 415.193 )
									ret := -0.166667
								if( ema3 > 415.193 )
									ret := 0.230769
							if( ema12 > 0.11828 )
								if( ema12 <= 0.16652 )
									ret := -0.956522 // sell
								if( ema12 > 0.16652 )
									ret := -0.301587
						if( mf > 0.183876 )
							if( ema2 <= 329.309 )
								ret := -0.583333
							if( ema2 > 329.309 )
								if( ema12 <= 0.143817 )
									ret := 0.777778 // buy
								if( ema12 > 0.143817 )
									ret := 0.098361
			if( ad > 1202.06 )
				if( ema2 <= 336.731 )
					if( tema <= 328.827 )
						ret := 0.500000
					if( tema > 328.827 )
						ret := -0.400000
				if( ema2 > 336.731 )
					if( mf <= -0.138701 )
						ret := 0.000000
					if( mf > -0.138701 )
						if( mf <= 0.266915 )
							if( ad_mf <= 1206.97 )
								ret := 0.500000
							if( ad_mf > 1206.97 )
								if( ema12 <= 0.094207 )
									ret := 0.975610 // buy
								if( ema12 > 0.094207 )
									ret := 0.833333 // buy
						if( mf > 0.266915 )
							ret := 0.230769
	if( ad > 1220.88 )
		if( mf <= 0.301993 )
			if( ema12 <= 0.053309 )
				if( ad_mf <= 435590 )
					if( ema3 <= 429.816 )
						if( ema13 <= -2.41266 )
							if( ema13 <= -5.91498 )
								ret := -0.733333 // sell
							if( ema13 > -5.91498 )
								if( ema3 <= 404.763 )
									ret := 0.625000
								if( ema3 > 404.763 )
									ret := 0.095238
						if( ema13 > -2.41266 )
							if( ema12 <= -1.16864 )
								if( ema1 <= 423.634 )
									ret := -0.205607
								if( ema1 > 423.634 )
									ret := -0.882353 // sell
							if( ema12 > -1.16864 )
								if( ad_mf <= 357746 )
									ret := -0.009129
								if( ad_mf > 357746 )
									ret := 0.316384
					if( ema3 > 429.816 )
						if( ad <= 308778 )
							if( ema13 <= -3.12404 )
								if( mf <= -0.019252 )
									ret := -0.555556
								if( mf > -0.019252 )
									ret := -1.000000 // sell
							if( ema13 > -3.12404 )
								if( ema2 <= 452.422 )
									ret := 0.157009
								if( ema2 > 452.422 )
									ret := -0.102362
						if( ad > 308778 )
							ret := -0.736842 // sell
				if( ad_mf > 435590 )
					if( ema2 <= 296.677 )
						ret := 0.800000 // buy
					if( ema2 > 296.677 )
						if( ad <= 447329 )
							if( ema13 <= -1.18899 )
								ret := -1.000000 // sell
							if( ema13 > -1.18899 )
								ret := -0.700000 // sell
						if( ad > 447329 )
							if( ad <= 470379 )
								if( ad_mf <= 459069 )
									ret := -0.416667
								if( ad_mf > 459069 )
									ret := 0.944444 // buy
							if( ad > 470379 )
								if( ema12 <= -1.51812 )
									ret := 0.833333 // buy
								if( ema12 > -1.51812 )
									ret := -0.266289
			if( ema12 > 0.053309 )
				if( ema13 <= 2.39942 )
					if( mf <= 0.229973 )
						if( ad <= 1282.28 )
							if( ema1 <= 443.6 )
								if( ema2 <= 327.028 )
									ret := -0.772727 // sell
								if( ema2 > 327.028 )
									ret := -0.063830
							if( ema1 > 443.6 )
								ret := -1.000000 // sell
						if( ad > 1282.28 )
							if( ad_mf <= 1891.7 )
								if( ema2 <= 327.105 )
									ret := -0.390625
								if( ema2 > 327.105 )
									ret := 0.131970
							if( ad_mf > 1891.7 )
								if( ema13 <= 0.643257 )
									ret := -0.055262
								if( ema13 > 0.643257 )
									ret := -0.148368
					if( mf > 0.229973 )
						if( ad_mf <= 6866.44 )
							if( tema <= 338.643 )
								if( ema1 <= 328.222 )
									ret := 0.166667
								if( ema1 > 328.222 )
									ret := -0.671429
							if( tema > 338.643 )
								if( ema1 <= 406.591 )
									ret := 0.211268
								if( ema1 > 406.591 )
									ret := -0.269737
						if( ad_mf > 6866.44 )
							if( tema <= 304.293 )
								ret := 0.785714 // buy
							if( tema > 304.293 )
								if( ad <= 8334.32 )
									ret := 0.435484
								if( ad > 8334.32 )
									ret := 0.033582
				if( ema13 > 2.39942 )
					if( ad <= 34761.1 )
						if( ema13 <= 4.1647 )
							if( ema2 <= 389.11 )
								ret := -0.894737 // sell
							if( ema2 > 389.11 )
								ret := 0.153846
						if( ema13 > 4.1647 )
							ret := 0.500000
					if( ad > 34761.1 )
						if( tema <= 411.209 )
							if( ema3 <= 358.53 )
								ret := -1.000000 // sell
							if( ema3 > 358.53 )
								ret := -0.857143 // sell
						if( tema > 411.209 )
							ret := -0.642857
		if( mf > 0.301993 )
			if( ad_mf <= 11370.6 )
				if( tema <= 398.451 )
					if( ema13 <= -0.078491 )
						if( ema13 <= -0.221004 )
							if( ema1 <= 328.787 )
								if( ema3 <= 318.562 )
									ret := -0.181818
								if( ema3 > 318.562 )
									ret := 0.692308
							if( ema1 > 328.787 )
								if( ad_mf <= 5718.3 )
									ret := -0.413793
								if( ad_mf > 5718.3 )
									ret := -1.000000 // sell
						if( ema13 > -0.221004 )
							if( ema12 <= 0.045583 )
								if( tema <= 332.796 )
									ret := -0.396226
								if( tema > 332.796 )
									ret := -0.761905 // sell
							if( ema12 > 0.045583 )
								ret := -1.000000 // sell
					if( ema13 > -0.078491 )
						if( ema2 <= 327.829 )
							if( ad <= 5867.37 )
								if( ad_mf <= 3277.89 )
									ret := -0.112676
								if( ad_mf > 3277.89 )
									ret := 0.369231
							if( ad > 5867.37 )
								if( tema <= 321.059 )
									ret := -0.913043 // sell
								if( tema > 321.059 )
									ret := -0.176471
						if( ema2 > 327.829 )
							if( mf <= 0.843821 )
								if( ad_mf <= 3742.33 )
									ret := -0.211480
								if( ad_mf > 3742.33 )
									ret := -0.489362
							if( mf > 0.843821 )
								ret := 0.411765
				if( tema > 398.451 )
					if( ema2 <= 406.556 )
						if( ema2 <= 402.507 )
							if( ema12 <= 0.381899 )
								if( ema13 <= 0.12848 )
									ret := -0.357143
								if( ema13 > 0.12848 )
									ret := 0.750000 // buy
							if( ema12 > 0.381899 )
								if( ema1 <= 401.65 )
									ret := -0.800000 // sell
								if( ema1 > 401.65 )
									ret := -0.545455
						if( ema2 > 402.507 )
							if( ema2 <= 403.354 )
								if( ema13 <= 0.513048 )
									ret := 0.833333 // buy
								if( ema13 > 0.513048 )
									ret := 0.500000
							if( ema2 > 403.354 )
								if( ema12 <= 0.513429 )
									ret := 0.194444
								if( ema12 > 0.513429 )
									ret := 0.777778 // buy
					if( ema2 > 406.556 )
						if( ema12 <= -0.190071 )
							if( ema12 <= -0.297197 )
								if( ema13 <= -0.767843 )
									ret := -0.222222
								if( ema13 > -0.767843 )
									ret := 0.000000
							if( ema12 > -0.297197 )
								ret := 0.464286
						if( ema12 > -0.190071 )
							if( ad_mf <= 2105.04 )
								if( ad_mf <= 2060.43 )
									ret := -0.168421
								if( ad_mf > 2060.43 )
									ret := 0.944444 // buy
							if( ad_mf > 2105.04 )
								if( ad <= 5614 )
									ret := -0.324723
								if( ad > 5614 )
									ret := -0.102564
			if( ad_mf > 11370.6 )
				if( ema2 <= 309.426 )
					if( ad <= 26504.6 )
						ret := 0.083333
					if( ad > 26504.6 )
						if( ema1 <= 290.007 )
							ret := 0.142857
						if( ema1 > 290.007 )
							if( tema <= 302.393 )
								ret := 1.000000 // buy
							if( tema > 302.393 )
								if( ema2 <= 306.161 )
									ret := 0.100000
								if( ema2 > 306.161 )
									ret := 0.705882 // buy
				if( ema2 > 309.426 )
					if( ad_mf <= 12618.9 )
						if( ema1 <= 374.257 )
							ret := 0.850000 // buy
						if( ema1 > 374.257 )
							ret := 0.437500
					if( ad_mf > 12618.9 )
						if( ad <= 3.25799e+06 )
							if( ad <= 1.59839e+06 )
								if( ema12 <= -0.1208 )
									ret := 0.250000
								if( ema12 > -0.1208 )
									ret := -0.112626
							if( ad > 1.59839e+06 )
								if( ad <= 2.50561e+06 )
									ret := 0.796296 // buy
								if( ad > 2.50561e+06 )
									ret := -0.161290
						if( ad > 3.25799e+06 )
							if( mf <= 0.588517 )
								if( ema13 <= 0.248913 )
									ret := -0.181818
								if( ema13 > 0.248913 )
									ret := -0.892857 // sell
							if( mf > 0.588517 )
								ret := -0.300000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_MSFT_5Min_ddfc76ee(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


