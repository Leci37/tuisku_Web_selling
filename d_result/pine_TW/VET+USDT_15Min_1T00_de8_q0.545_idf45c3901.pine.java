//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: VETUSDT_15Min_1T00_f45c3901 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_15Min_1T00_f45c3901", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_15Min_f45c3901(ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.000131 )
		if( ema3 <= 0.022985 )
			if( ema2 <= 0.022693 )
				if( ema13 <= -0.000207 )
					if( ema2 <= 0.021578 )
						if( ema1 <= 0.020516 )
							if( ema13 <= -0.000647 )
								if( ema1 <= 0.020399 )
									ret := 0.876923 // buy
								if( ema1 > 0.020399 )
									ret := -0.111111
							if( ema13 > -0.000647 )
								if( ema3 <= 0.020897 )
									ret := 0.272583
								if( ema3 > 0.020897 )
									ret := -0.437500
						if( ema1 > 0.020516 )
							if( ema1 <= 0.02055 )
								ret := 1.000000 // buy
							if( ema1 > 0.02055 )
								if( ema13 <= -0.000226 )
									ret := 0.706897 // buy
								if( ema13 > -0.000226 )
									ret := -0.090909
					if( ema2 > 0.021578 )
						if( ema3 <= 0.022158 )
							if( ema2 <= 0.021721 )
								if( ema1 <= 0.021354 )
									ret := 0.100000
								if( ema1 > 0.021354 )
									ret := -0.888889 // sell
							if( ema2 > 0.021721 )
								if( ema1 <= 0.021695 )
									ret := 0.173077
								if( ema1 > 0.021695 )
									ret := -0.818182 // sell
						if( ema3 > 0.022158 )
							if( ema3 <= 0.022257 )
								if( ema1 <= 0.021936 )
									ret := 0.933333 // buy
								if( ema1 > 0.021936 )
									ret := 0.714286 // buy
							if( ema3 > 0.022257 )
								if( ema1 <= 0.022419 )
									ret := 0.364896
								if( ema1 > 0.022419 )
									ret := -0.232143
				if( ema13 > -0.000207 )
					if( ema3 <= 0.019495 )
						ret := 0.250000
					if( ema3 > 0.019495 )
						if( ema12 <= -0.000135 )
							if( ema1 <= 0.021347 )
								ret := -1.000000 // sell
							if( ema1 > 0.021347 )
								if( ema1 <= 0.022414 )
									ret := -0.500000
								if( ema1 > 0.022414 )
									ret := -0.800000 // sell
						if( ema12 > -0.000135 )
							ret := -0.400000
			if( ema2 > 0.022693 )
				if( tema <= 0.022199 )
					ret := -0.300000
				if( tema > 0.022199 )
					if( ema3 <= 0.02287 )
						if( ema13 <= -0.000266 )
							ret := 0.800000 // buy
						if( ema13 > -0.000266 )
							ret := 1.000000 // buy
					if( ema3 > 0.02287 )
						if( ema3 <= 0.022962 )
							if( ema1 <= 0.022673 )
								if( ema2 <= 0.022803 )
									ret := 0.551724
								if( ema2 > 0.022803 )
									ret := 1.000000 // buy
							if( ema1 > 0.022673 )
								ret := 0.187500
						if( ema3 > 0.022962 )
							ret := 1.000000 // buy
		if( ema3 > 0.022985 )
			if( tema <= 0.047015 )
				if( ema12 <= -0.001164 )
					if( ema12 <= -0.001241 )
						if( ema1 <= 0.043345 )
							ret := 1.000000 // buy
						if( ema1 > 0.043345 )
							if( ema12 <= -0.001424 )
								ret := 1.000000 // buy
							if( ema12 > -0.001424 )
								ret := 0.800000 // buy
					if( ema12 > -0.001241 )
						ret := 0.750000 // buy
				if( ema12 > -0.001164 )
					if( ema13 <= -0.001338 )
						if( ema2 <= 0.04696 )
							if( ema3 <= 0.027635 )
								ret := 0.888889 // buy
							if( ema3 > 0.027635 )
								if( ema3 <= 0.030721 )
									ret := -1.000000 // sell
								if( ema3 > 0.030721 )
									ret := -0.574627
						if( ema2 > 0.04696 )
							ret := 0.950000 // buy
					if( ema13 > -0.001338 )
						if( ema12 <= -0.000348 )
							if( tema <= 0.024257 )
								if( ema2 <= 0.024061 )
									ret := 0.222222
								if( ema2 > 0.024061 )
									ret := -0.740741 // sell
							if( tema > 0.024257 )
								if( tema <= 0.039915 )
									ret := 0.379828
								if( tema > 0.039915 )
									ret := 0.164384
						if( ema12 > -0.000348 )
							if( tema <= 0.028552 )
								if( ema2 <= 0.028279 )
									ret := 0.106485
								if( ema2 > 0.028279 )
									ret := -0.590604
							if( tema > 0.028552 )
								if( tema <= 0.028851 )
									ret := 0.782609 // buy
								if( tema > 0.028851 )
									ret := 0.115568
			if( tema > 0.047015 )
				if( ema2 <= 0.051992 )
					if( ema12 <= -0.000801 )
						ret := -1.000000 // sell
					if( ema12 > -0.000801 )
						if( ema1 <= 0.051067 )
							if( ema13 <= -0.000984 )
								if( tema <= 0.047517 )
									ret := 1.000000 // buy
								if( tema > 0.047517 )
									ret := 0.555556
							if( ema13 > -0.000984 )
								if( tema <= 0.048615 )
									ret := -0.073477
								if( tema > 0.048615 )
									ret := -0.421456
						if( ema1 > 0.051067 )
							if( ema12 <= -0.000473 )
								ret := 0.181818
							if( ema12 > -0.000473 )
								if( ema13 <= -0.000284 )
									ret := 1.000000 // buy
								if( ema13 > -0.000284 )
									ret := 0.900000 // buy
				if( ema2 > 0.051992 )
					if( ema13 <= -0.000552 )
						if( tema <= 0.051723 )
							ret := -1.000000 // sell
						if( tema > 0.051723 )
							ret := 1.000000 // buy
					if( ema13 > -0.000552 )
						if( ema13 <= -0.000421 )
							ret := -1.000000 // sell
						if( ema13 > -0.000421 )
							if( ema13 <= -0.000286 )
								ret := -0.538462
							if( ema13 > -0.000286 )
								ret := -1.000000 // sell
	if( ema12 > -0.000131 )
		if( ema2 <= 0.022608 )
			if( ema3 <= 0.021646 )
				if( ema2 <= 0.021627 )
					if( ema2 <= 0.018851 )
						if( ema13 <= 0.0002 )
							if( ema2 <= 0.01877 )
								if( tema <= 0.014823 )
									ret := 0.419355
								if( tema > 0.014823 )
									ret := 0.023265
							if( ema2 > 0.01877 )
								if( ema12 <= 4.9e-05 )
									ret := 0.411894
								if( ema12 > 4.9e-05 )
									ret := -0.098361
						if( ema13 > 0.0002 )
							if( ema13 <= 0.000285 )
								if( ema12 <= 0.000144 )
									ret := 0.665848
								if( ema12 > 0.000144 )
									ret := 0.098039
							if( ema13 > 0.000285 )
								if( ema2 <= 0.018701 )
									ret := -0.418367
								if( ema2 > 0.018701 )
									ret := 0.620690
					if( ema2 > 0.018851 )
						if( tema <= 0.019929 )
							if( ema3 <= 0.019932 )
								if( ema3 <= 0.019662 )
									ret := -0.080381
								if( ema3 > 0.019662 )
									ret := 0.079460
							if( ema3 > 0.019932 )
								if( ema13 <= -0.000137 )
									ret := -0.753846 // sell
								if( ema13 > -0.000137 )
									ret := -0.441558
						if( tema > 0.019929 )
							if( ema1 <= 0.021371 )
								if( ema13 <= -0.00027 )
									ret := -0.880597 // sell
								if( ema13 > -0.00027 )
									ret := 0.084139
							if( ema1 > 0.021371 )
								if( ema2 <= 0.021431 )
									ret := -0.272917
								if( ema2 > 0.021431 )
									ret := 0.026055
				if( ema2 > 0.021627 )
					if( ema13 <= 0.000296 )
						if( ema12 <= -5.1e-05 )
							ret := 0.454545
						if( ema12 > -5.1e-05 )
							if( ema13 <= 7e-06 )
								if( tema <= 0.021582 )
									ret := -1.000000 // sell
								if( tema > 0.021582 )
									ret := -0.800000 // sell
							if( ema13 > 7e-06 )
								if( tema <= 0.021748 )
									ret := -0.228070
								if( tema > 0.021748 )
									ret := -0.707692 // sell
					if( ema13 > 0.000296 )
						if( ema2 <= 0.021738 )
							if( ema13 <= 0.000681 )
								if( tema <= 0.022326 )
									ret := 0.400000
								if( tema > 0.022326 )
									ret := 1.000000 // buy
							if( ema13 > 0.000681 )
								ret := -0.555556
						if( ema2 > 0.021738 )
							if( ema1 <= 0.022073 )
								ret := 0.363636
							if( ema1 > 0.022073 )
								ret := -0.733333 // sell
			if( ema3 > 0.021646 )
				if( ema13 <= -6.1e-05 )
					if( ema1 <= 0.02205 )
						if( ema3 <= 0.021675 )
							if( ema13 <= -9.9e-05 )
								if( tema <= 0.021405 )
									ret := 0.750000 // buy
								if( tema > 0.021405 )
									ret := 1.000000 // buy
							if( ema13 > -9.9e-05 )
								ret := 0.700000 // buy
						if( ema3 > 0.021675 )
							if( ema2 <= 0.021621 )
								ret := -0.812500 // sell
							if( ema2 > 0.021621 )
								if( ema2 <= 0.0217 )
									ret := 0.565217
								if( ema2 > 0.0217 )
									ret := 0.264901
					if( ema1 > 0.02205 )
						if( tema <= 0.022024 )
							if( ema3 <= 0.022283 )
								if( tema <= 0.021947 )
									ret := -0.529412
								if( tema > 0.021947 )
									ret := 0.275862
							if( ema3 > 0.022283 )
								if( ema2 <= 0.022181 )
									ret := 0.052632
								if( ema2 > 0.022181 )
									ret := 0.836364 // buy
						if( tema > 0.022024 )
							if( ema3 <= 0.022236 )
								if( tema <= 0.022123 )
									ret := -0.451613
								if( tema > 0.022123 )
									ret := 0.333333
							if( ema3 > 0.022236 )
								if( ema2 <= 0.022327 )
									ret := 0.291304
								if( ema2 > 0.022327 )
									ret := 0.057276
				if( ema13 > -6.1e-05 )
					if( ema13 <= 0.000369 )
						if( ema1 <= 0.021696 )
							if( ema13 <= -3.3e-05 )
								ret := 0.692308
							if( ema13 > -3.3e-05 )
								if( ema12 <= -2e-06 )
									ret := -0.205882
								if( ema12 > -2e-06 )
									ret := -0.745098 // sell
						if( ema1 > 0.021696 )
							if( ema1 <= 0.02176 )
								if( ema13 <= -3.9e-05 )
									ret := -0.210526
								if( ema13 > -3.9e-05 )
									ret := 0.582677
							if( ema1 > 0.02176 )
								if( ema3 <= 0.022512 )
									ret := 0.054949
								if( ema3 > 0.022512 )
									ret := 0.286290
					if( ema13 > 0.000369 )
						if( ema13 <= 0.000501 )
							if( tema <= 0.022566 )
								if( ema3 <= 0.021757 )
									ret := -1.000000 // sell
								if( ema3 > 0.021757 )
									ret := -0.846154 // sell
							if( tema > 0.022566 )
								if( tema <= 0.023013 )
									ret := 0.105263
								if( tema > 0.023013 )
									ret := -0.766667 // sell
						if( ema13 > 0.000501 )
							if( ema12 <= 0.000465 )
								if( ema13 <= 0.000731 )
									ret := -0.034483
								if( ema13 > 0.000731 )
									ret := 0.607143
							if( ema12 > 0.000465 )
								ret := -1.000000 // sell
		if( ema2 > 0.022608 )
			if( ema3 <= 0.049284 )
				if( ema3 <= 0.022687 )
					if( ema1 <= 0.022724 )
						if( ema3 <= 0.022645 )
							if( tema <= 0.022609 )
								if( ema2 <= 0.022658 )
									ret := 0.485981
								if( ema2 > 0.022658 )
									ret := -1.000000 // sell
							if( tema > 0.022609 )
								if( ema12 <= 3.6e-05 )
									ret := -0.122642
								if( ema12 > 3.6e-05 )
									ret := -0.494186
						if( ema3 > 0.022645 )
							if( ema3 <= 0.022666 )
								if( ema13 <= -6.7e-05 )
									ret := -0.923077 // sell
								if( ema13 > -6.7e-05 )
									ret := -0.621622
							if( ema3 > 0.022666 )
								if( ema2 <= 0.022624 )
									ret := 0.500000
								if( ema2 > 0.022624 )
									ret := -0.318584
					if( ema1 > 0.022724 )
						if( ema2 <= 0.022855 )
							if( ema13 <= 0.000352 )
								if( ema12 <= 0.000146 )
									ret := 0.039755
								if( ema12 > 0.000146 )
									ret := 0.885714 // buy
							if( ema13 > 0.000352 )
								if( ema1 <= 0.023074 )
									ret := -0.745098 // sell
								if( ema1 > 0.023074 )
									ret := 0.500000
						if( ema2 > 0.022855 )
							ret := 0.850000 // buy
				if( ema3 > 0.022687 )
					if( ema2 <= 0.022744 )
						if( tema <= 0.022752 )
							if( ema1 <= 0.022635 )
								if( tema <= 0.022581 )
									ret := 0.335443
								if( tema > 0.022581 )
									ret := -0.687500
							if( ema1 > 0.022635 )
								if( ema12 <= -6.8e-05 )
									ret := 0.062500
								if( ema12 > -6.8e-05 )
									ret := 0.550847
						if( tema > 0.022752 )
							if( ema3 <= 0.02269 )
								if( ema2 <= 0.022732 )
									ret := -0.545455
								if( ema2 > 0.022732 )
									ret := 1.000000 // buy
							if( ema3 > 0.02269 )
								if( ema3 <= 0.022736 )
									ret := -0.318681
								if( ema3 > 0.022736 )
									ret := 0.214286
					if( ema2 > 0.022744 )
						if( ema1 <= 0.022676 )
							if( ema2 <= 0.02277 )
								ret := 0.600000
							if( ema2 > 0.02277 )
								ret := 1.000000 // buy
						if( ema1 > 0.022676 )
							if( ema3 <= 0.022727 )
								if( ema13 <= 0.000124 )
									ret := 0.000000
								if( ema13 > 0.000124 )
									ret := 0.579545
							if( ema3 > 0.022727 )
								if( ema2 <= 0.048877 )
									ret := -0.038192
								if( ema2 > 0.048877 )
									ret := 0.221277
			if( ema3 > 0.049284 )
				if( ema3 <= 0.051209 )
					if( ema3 <= 0.050098 )
						if( tema <= 0.04971 )
							if( tema <= 0.049343 )
								if( tema <= 0.049275 )
									ret := 0.000000
								if( tema > 0.049275 )
									ret := -0.266667
							if( tema > 0.049343 )
								if( ema13 <= -3e-05 )
									ret := -0.928571 // sell
								if( ema13 > -3e-05 )
									ret := -0.733333 // sell
						if( tema > 0.04971 )
							if( ema3 <= 0.049515 )
								if( ema12 <= 0.000958 )
									ret := -0.666667
								if( ema12 > 0.000958 )
									ret := 0.090909
							if( ema3 > 0.049515 )
								if( tema <= 0.050201 )
									ret := 0.440000
								if( tema > 0.050201 )
									ret := -0.200000
					if( ema3 > 0.050098 )
						if( tema <= 0.050655 )
							if( ema1 <= 0.050301 )
								if( ema1 <= 0.050022 )
									ret := -1.000000 // sell
								if( ema1 > 0.050022 )
									ret := -0.785714 // sell
							if( ema1 > 0.050301 )
								if( tema <= 0.050447 )
									ret := 0.100000
								if( tema > 0.050447 )
									ret := -0.666667
						if( tema > 0.050655 )
							if( ema13 <= 0.0008 )
								if( ema1 <= 0.050869 )
									ret := -1.000000 // sell
								if( ema1 > 0.050869 )
									ret := -0.933333 // sell
							if( ema13 > 0.0008 )
								if( tema <= 0.053664 )
									ret := 0.000000
								if( tema > 0.053664 )
									ret := -1.000000 // sell
				if( ema3 > 0.051209 )
					if( ema3 <= 0.052072 )
						if( ema13 <= -6.7e-05 )
							if( ema12 <= -9.1e-05 )
								if( ema2 <= 0.051548 )
									ret := 0.583333
								if( ema2 > 0.051548 )
									ret := 1.000000 // buy
							if( ema12 > -9.1e-05 )
								if( ema2 <= 0.051776 )
									ret := -0.285714
								if( ema2 > 0.051776 )
									ret := 0.785714 // buy
						if( ema13 > -6.7e-05 )
							if( ema13 <= 9.3e-05 )
								if( tema <= 0.051963 )
									ret := -0.287879
								if( tema > 0.051963 )
									ret := -1.000000 // sell
							if( ema13 > 9.3e-05 )
								if( ema13 <= 0.000237 )
									ret := 0.458333
								if( ema13 > 0.000237 )
									ret := -0.063830
					if( ema3 > 0.052072 )
						if( ema13 <= 0.000652 )
							if( ema3 <= 0.053853 )
								if( ema13 <= 0.000158 )
									ret := -0.976190 // sell
								if( ema13 > 0.000158 )
									ret := -0.689655
							if( ema3 > 0.053853 )
								ret := -0.444444
						if( ema13 > 0.000652 )
							ret := 0.583333
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_VETUSDT_15Min_f45c3901(ema2, tema, ema12, ema3, ema1, ema13)

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


