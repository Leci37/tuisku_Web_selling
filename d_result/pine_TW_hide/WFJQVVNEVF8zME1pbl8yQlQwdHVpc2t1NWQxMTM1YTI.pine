//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: XRPUSDT_30Min_2BT0_5d1135a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2BT0_5d1135a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_5d1135a2(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.011204 )
		if( tema <= 0.595856 )
			if( ema13 <= -0.00479 )
				if( ema1 <= 0.40105 )
					if( ema12 <= -0.01758 )
						if( ema1 <= 0.354903 )
							ret := 1.000000 // buy
						if( ema1 > 0.354903 )
							if( ema2 <= 0.397505 )
								ret := -0.818182 // sell
							if( ema2 > 0.397505 )
								ret := -1.000000 // sell
					if( ema12 > -0.01758 )
						if( tema <= 0.304687 )
							if( bullPower <= -0.005958 )
								if( tema <= 0.264165 )
									ret := -0.291139
								if( tema > 0.264165 )
									ret := 0.875000 // buy
							if( bullPower > -0.005958 )
								if( bbp <= -0.013701 )
									ret := 0.727273 // buy
								if( bbp > -0.013701 )
									ret := 0.382716
						if( tema > 0.304687 )
							if( bullPower <= -0.007595 )
								if( ema3 <= 0.40626 )
									ret := 0.621622
								if( ema3 > 0.40626 )
									ret := -0.166667
							if( bullPower > -0.007595 )
								if( bbp <= -0.013778 )
									ret := -0.284946
								if( bbp > -0.013778 )
									ret := 0.221053
				if( ema1 > 0.40105 )
					if( bearPower <= -0.03309 )
						if( bbp <= -0.126239 )
							ret := -0.384615
						if( bbp > -0.126239 )
							if( ema2 <= 0.594943 )
								if( ema3 <= 0.537427 )
									ret := 0.511364
								if( ema3 > 0.537427 )
									ret := 0.914286 // buy
							if( ema2 > 0.594943 )
								if( ema2 <= 0.616925 )
									ret := -0.642857
								if( ema2 > 0.616925 )
									ret := 0.703704 // buy
					if( bearPower > -0.03309 )
						if( ema1 <= 0.582371 )
							if( ema3 <= 0.529858 )
								if( ema2 <= 0.414589 )
									ret := 0.943396 // buy
								if( ema2 > 0.414589 )
									ret := 0.286439
							if( ema3 > 0.529858 )
								if( bearPower <= -0.011955 )
									ret := 0.160934
								if( bearPower > -0.011955 )
									ret := -0.226950
						if( ema1 > 0.582371 )
							if( bearPower <= -0.02894 )
								if( bearPower <= -0.030489 )
									ret := -0.052632
								if( bearPower > -0.030489 )
									ret := -1.000000 // sell
							if( bearPower > -0.02894 )
								if( ema1 <= 0.590294 )
									ret := 0.759777 // buy
								if( ema1 > 0.590294 )
									ret := 0.357683
			if( ema13 > -0.00479 )
				if( ema3 <= 0.569138 )
					if( ema12 <= -0.003476 )
						if( ema12 <= -0.003678 )
							if( ema3 <= 0.508691 )
								if( tema <= 0.354809 )
									ret := 1.000000 // buy
								if( tema > 0.354809 )
									ret := 0.611111
							if( ema3 > 0.508691 )
								ret := -0.285714
						if( ema12 > -0.003678 )
							if( bbp <= -0.015662 )
								ret := 1.000000 // buy
							if( bbp > -0.015662 )
								ret := 0.923077 // buy
					if( ema12 > -0.003476 )
						if( ema13 <= 0.009152 )
							if( bearPower <= -0.019055 )
								if( ema2 <= 0.507756 )
									ret := 0.823529 // buy
								if( ema2 > 0.507756 )
									ret := 0.368421
							if( bearPower > -0.019055 )
								if( ema13 <= 0.000859 )
									ret := 0.009174
								if( ema13 > 0.000859 )
									ret := -0.529412
						if( ema13 > 0.009152 )
							if( bearPower <= -0.027616 )
								ret := 0.857143 // buy
							if( bearPower > -0.027616 )
								ret := 0.555556
				if( ema3 > 0.569138 )
					if( bullPower <= -0.001293 )
						if( bbm <= 0.005381 )
							ret := 0.352941
						if( bbm > 0.005381 )
							if( bbm <= 0.007203 )
								if( ema3 <= 0.589926 )
									ret := 0.250000
								if( ema3 > 0.589926 )
									ret := -0.875000 // sell
							if( bbm > 0.007203 )
								if( bullPower <= -0.002034 )
									ret := -0.846154 // sell
								if( bullPower > -0.002034 )
									ret := -0.466667
					if( bullPower > -0.001293 )
						if( bbp <= -0.01247 )
							if( ema1 <= 0.58614 )
								ret := 0.555556
							if( ema1 > 0.58614 )
								ret := -0.500000
						if( bbp > -0.01247 )
							ret := 0.923077 // buy
		if( tema > 0.595856 )
			if( bbp <= -0.030577 )
				if( tema <= 1.39508 )
					if( ema2 <= 0.844347 )
						if( ema12 <= -0.014993 )
							if( bullPower <= -0.032401 )
								if( tema <= 0.705093 )
									ret := 1.000000 // buy
								if( tema > 0.705093 )
									ret := 0.800000 // buy
							if( bullPower > -0.032401 )
								if( bbp <= -0.057189 )
									ret := 0.397059
								if( bbp > -0.057189 )
									ret := 0.745763 // buy
						if( ema12 > -0.014993 )
							if( tema <= 0.739614 )
								if( ema2 <= 0.754939 )
									ret := 0.271875
								if( ema2 > 0.754939 )
									ret := -1.000000 // sell
							if( tema > 0.739614 )
								if( bullPower <= -0.010839 )
									ret := 0.196970
								if( bullPower > -0.010839 )
									ret := 0.750000 // buy
					if( ema2 > 0.844347 )
						if( bullPower <= -0.002928 )
							if( ema2 <= 0.869203 )
								if( tema <= 0.821926 )
									ret := -0.300000
								if( tema > 0.821926 )
									ret := -0.813953 // sell
							if( ema2 > 0.869203 )
								if( ema13 <= -0.071692 )
									ret := -0.341615
								if( ema13 > -0.071692 )
									ret := 0.305574
						if( bullPower > -0.002928 )
							if( ema13 <= -0.020936 )
								if( ema1 <= 1.38766 )
									ret := -0.785714 // sell
								if( ema1 > 1.38766 )
									ret := -0.200000
							if( ema13 > -0.020936 )
								if( ema3 <= 1.28139 )
									ret := 0.205128
								if( ema3 > 1.28139 )
									ret := -0.297297
				if( tema > 1.39508 )
					if( ema13 <= -0.00616 )
						if( bbm <= 0.042388 )
							if( bbm <= 0.022883 )
								if( ema1 <= 1.5761 )
									ret := 0.464286
								if( ema1 > 1.5761 )
									ret := -0.571429
							if( bbm > 0.022883 )
								if( bearPower <= -0.056246 )
									ret := 0.032258
								if( bearPower > -0.056246 )
									ret := -0.712766 // sell
						if( bbm > 0.042388 )
							if( ema3 <= 1.51428 )
								if( ema1 <= 1.43967 )
									ret := -0.727273 // sell
								if( ema1 > 1.43967 )
									ret := -1.000000 // sell
							if( ema3 > 1.51428 )
								if( tema <= 1.75709 )
									ret := 0.486631
								if( tema > 1.75709 )
									ret := -0.944444 // sell
					if( ema13 > -0.00616 )
						if( ema2 <= 1.48017 )
							if( ema12 <= -0.003543 )
								ret := -1.000000 // sell
							if( ema12 > -0.003543 )
								ret := 0.823529 // buy
						if( ema2 > 1.48017 )
							if( bearPower <= -0.040242 )
								if( ema12 <= -0.005839 )
									ret := 0.944444 // buy
								if( ema12 > -0.005839 )
									ret := 0.666667
							if( bearPower > -0.040242 )
								ret := 0.153846
			if( bbp > -0.030577 )
				if( ema12 <= -0.008519 )
					if( ema2 <= 1.42754 )
						if( bbm <= 0.009028 )
							if( ema3 <= 0.721478 )
								if( ema12 <= -0.011442 )
									ret := -0.791667 // sell
								if( ema12 > -0.011442 )
									ret := 0.323529
							if( ema3 > 0.721478 )
								if( ema1 <= 0.999549 )
									ret := -0.650685
								if( ema1 > 0.999549 )
									ret := 0.076923
						if( bbm > 0.009028 )
							if( ema2 <= 1.10502 )
								if( ema1 <= 0.627537 )
									ret := 0.800000 // buy
								if( ema1 > 0.627537 )
									ret := -0.191950
							if( ema2 > 1.10502 )
								if( ema3 <= 1.19401 )
									ret := 0.714286 // buy
								if( ema3 > 1.19401 )
									ret := -0.008475
					if( ema2 > 1.42754 )
						if( bullPower <= -0.003131 )
							ret := 0.333333
						if( bullPower > -0.003131 )
							if( ema13 <= -0.044796 )
								ret := -0.090909
							if( ema13 > -0.044796 )
								if( bullPower <= -0.001557 )
									ret := -0.666667
								if( bullPower > -0.001557 )
									ret := -0.913580 // sell
				if( ema12 > -0.008519 )
					if( bearPower <= -0.018545 )
						if( ema1 <= 1.51084 )
							if( ema13 <= 0.00137 )
								if( ema2 <= 0.760266 )
									ret := 0.071713
								if( ema2 > 0.760266 )
									ret := 0.361640
							if( ema13 > 0.00137 )
								if( ema3 <= 1.0695 )
									ret := 0.172414
								if( ema3 > 1.0695 )
									ret := 0.759259 // buy
						if( ema1 > 1.51084 )
							if( ema3 <= 1.65287 )
								if( tema <= 1.55231 )
									ret := -0.956522 // sell
								if( tema > 1.55231 )
									ret := -0.118644
							if( ema3 > 1.65287 )
								if( tema <= 1.73906 )
									ret := 0.880000 // buy
								if( tema > 1.73906 )
									ret := -0.111111
					if( bearPower > -0.018545 )
						if( ema3 <= 1.01552 )
							if( bbp <= -0.011609 )
								if( tema <= 0.836211 )
									ret := -0.007689
								if( tema > 0.836211 )
									ret := -0.311734
							if( bbp > -0.011609 )
								if( bullPower <= -0.003715 )
									ret := -0.458333
								if( bullPower > -0.003715 )
									ret := 0.357576
						if( ema3 > 1.01552 )
							if( ema2 <= 1.10069 )
								if( ema2 <= 1.02136 )
									ret := -0.700000 // sell
								if( ema2 > 1.02136 )
									ret := 0.488889
							if( ema2 > 1.10069 )
								if( bbm <= 0.008698 )
									ret := -0.427536
								if( bbm > 0.008698 )
									ret := 0.048880
	if( bbp > -0.011204 )
		if( ema1 <= 1.58335 )
			if( bbp <= 0.010686 )
				if( bearPower <= -0.013216 )
					if( tema <= 0.695428 )
						if( ema13 <= 0.006718 )
							if( tema <= 0.621013 )
								if( bbp <= -0.004267 )
									ret := 0.116279
								if( bbp > -0.004267 )
									ret := -0.733333 // sell
							if( tema > 0.621013 )
								ret := -0.900000 // sell
						if( ema13 > 0.006718 )
							if( ema1 <= 0.513228 )
								ret := -1.000000 // sell
							if( ema1 > 0.513228 )
								ret := -0.538462
					if( tema > 0.695428 )
						if( ema13 <= -0.003684 )
							if( bullPower <= 0.007707 )
								if( bearPower <= -0.014353 )
									ret := -0.684211
								if( bearPower > -0.014353 )
									ret := 0.157895
							if( bullPower > 0.007707 )
								if( ema13 <= -0.007336 )
									ret := 0.104478
								if( ema13 > -0.007336 )
									ret := 0.736842 // buy
						if( ema13 > -0.003684 )
							if( tema <= 1.41322 )
								if( ema3 <= 1.36805 )
									ret := 0.481172
								if( ema3 > 1.36805 )
									ret := -0.722222 // sell
							if( tema > 1.41322 )
								if( bullPower <= 0.017031 )
									ret := 1.000000 // buy
								if( bullPower > 0.017031 )
									ret := 0.600000
				if( bearPower > -0.013216 )
					if( ema2 <= 0.608015 )
						if( bbp <= -0.002079 )
							if( ema2 <= 0.216031 )
								if( bearPower <= -0.005863 )
									ret := 0.967742 // buy
								if( bearPower > -0.005863 )
									ret := 0.666667
							if( ema2 > 0.216031 )
								if( tema <= 0.216275 )
									ret := -1.000000 // sell
								if( tema > 0.216275 )
									ret := 0.069822
						if( bbp > -0.002079 )
							if( ema3 <= 0.210754 )
								ret := 1.000000 // buy
							if( ema3 > 0.210754 )
								if( ema12 <= 0.000435 )
									ret := -0.029169
								if( ema12 > 0.000435 )
									ret := 0.028889
					if( ema2 > 0.608015 )
						if( ema12 <= 0.000647 )
							if( ema3 <= 1.4656 )
								if( bbm <= 0.007466 )
									ret := -0.116380
								if( bbm > 0.007466 )
									ret := -0.042108
							if( ema3 > 1.4656 )
								if( ema2 <= 1.57017 )
									ret := -0.789474 // sell
								if( ema2 > 1.57017 )
									ret := 0.500000
						if( ema12 > 0.000647 )
							if( bbm <= 0.009577 )
								if( ema1 <= 1.10387 )
									ret := -0.074393
								if( ema1 > 1.10387 )
									ret := 0.269953
							if( bbm > 0.009577 )
								if( bullPower <= 0.01373 )
									ret := 0.115691
								if( bullPower > 0.01373 )
									ret := 0.551282
			if( bbp > 0.010686 )
				if( ema13 <= 0.050324 )
					if( ema1 <= 0.313503 )
						if( ema1 <= 0.246542 )
							if( bbp <= 0.011609 )
								ret := -0.571429
							if( bbp > 0.011609 )
								if( bullPower <= 0.012866 )
									ret := -1.000000 // sell
								if( bullPower > 0.012866 )
									ret := -0.870968 // sell
						if( ema1 > 0.246542 )
							if( ema13 <= 0.004225 )
								if( ema12 <= 0.000735 )
									ret := 0.090909
								if( ema12 > 0.000735 )
									ret := -0.908046 // sell
							if( ema13 > 0.004225 )
								if( bullPower <= 0.008593 )
									ret := -0.727273 // sell
								if( bullPower > 0.008593 )
									ret := -0.257353
					if( ema1 > 0.313503 )
						if( ema12 <= 0.003268 )
							if( ema2 <= 1.15873 )
								if( ema13 <= 0.006379 )
									ret := 0.082185
								if( ema13 > 0.006379 )
									ret := 0.638298
							if( ema2 > 1.15873 )
								if( ema1 <= 1.35623 )
									ret := -0.500000
								if( ema1 > 1.35623 )
									ret := 0.049505
						if( ema12 > 0.003268 )
							if( ema2 <= 0.647858 )
								if( tema <= 0.628121 )
									ret := -0.138758
								if( tema > 0.628121 )
									ret := -0.461394
							if( ema2 > 0.647858 )
								if( bearPower <= -0.003019 )
									ret := 0.379791
								if( bearPower > -0.003019 )
									ret := -0.043299
				if( ema13 > 0.050324 )
					if( bullPower <= 0.110601 )
						if( bbm <= 0.037764 )
							if( ema2 <= 0.537688 )
								ret := 0.529412
							if( ema2 > 0.537688 )
								if( ema1 <= 1.5224 )
									ret := -0.642487
								if( ema1 > 1.5224 )
									ret := 0.230769
						if( bbm > 0.037764 )
							if( ema13 <= 0.090259 )
								if( ema2 <= 0.832295 )
									ret := 0.324324
								if( ema2 > 0.832295 )
									ret := -0.239726
							if( ema13 > 0.090259 )
								ret := 0.888889 // buy
					if( bullPower > 0.110601 )
						if( ema12 <= 0.052207 )
							ret := -1.000000 // sell
						if( ema12 > 0.052207 )
							if( bbp <= 0.225139 )
								ret := 0.111111
							if( bbp > 0.225139 )
								ret := -0.625000
		if( ema1 > 1.58335 )
			if( ema3 <= 1.54877 )
				ret := 0.555556
			if( ema3 > 1.54877 )
				if( ema13 <= 0.078226 )
					if( ema3 <= 1.69442 )
						if( ema3 <= 1.61727 )
							if( bullPower <= 0.021064 )
								if( bearPower <= -0.010727 )
									ret := -0.689655
								if( bearPower > -0.010727 )
									ret := -0.931250 // sell
							if( bullPower > 0.021064 )
								if( ema3 <= 1.61117 )
									ret := -0.726027 // sell
								if( ema3 > 1.61117 )
									ret := 0.105263
						if( ema3 > 1.61727 )
							ret := -1.000000 // sell
					if( ema3 > 1.69442 )
						if( ema1 <= 1.74832 )
							if( ema12 <= -0.004044 )
								ret := -0.636364
							if( ema12 > -0.004044 )
								ret := 0.833333 // buy
						if( ema1 > 1.74832 )
							if( ema3 <= 1.76987 )
								if( ema3 <= 1.73621 )
									ret := -0.900000 // sell
								if( ema3 > 1.73621 )
									ret := -1.000000 // sell
							if( ema3 > 1.76987 )
								if( ema2 <= 1.79429 )
									ret := 0.750000 // buy
								if( ema2 > 1.79429 )
									ret := -1.000000 // sell
				if( ema13 > 0.078226 )
					if( tema <= 1.71677 )
						ret := 1.000000 // buy
					if( tema > 1.71677 )
						ret := -0.444444
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_XRPUSDT_30Min_5d1135a2(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


