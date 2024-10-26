//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: RUN_15Min_2BT0_ac47e9b2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_RUN_15Min_2BT0_ac47e9b2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_RUN_15Min_ac47e9b2(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( tema <= 12.0935 )
		if( tema <= 4.83408 )
			if( bbp <= -0.067167 )
				if( ema2 <= 4.88711 )
					if( bearPower <= -0.05461 )
						if( ema12 <= -0.028783 )
							if( bullPower <= -0.043498 )
								ret := 0.000000
							if( bullPower > -0.043498 )
								if( ema13 <= -0.065628 )
									ret := 0.875000 // buy
								if( ema13 > -0.065628 )
									ret := 0.000000
						if( ema12 > -0.028783 )
							ret := 0.000000
					if( bearPower > -0.05461 )
						if( ema13 <= -0.044388 )
							ret := 1.000000 // buy
						if( ema13 > -0.044388 )
							ret := 0.750000 // buy
				if( ema2 > 4.88711 )
					if( tema <= 4.83333 )
						if( ema13 <= -0.141537 )
							if( bbm <= 0.049539 )
								ret := 1.000000 // buy
							if( bbm > 0.049539 )
								ret := 0.500000
						if( ema13 > -0.141537 )
							ret := 1.000000 // buy
					if( tema > 4.83333 )
						ret := 0.500000
			if( bbp > -0.067167 )
				if( ema2 <= 4.87528 )
					if( bearPower <= 0.000891 )
						if( ema13 <= -0.049748 )
							if( bbm <= 0.028631 )
								ret := -0.800000 // sell
							if( bbm > 0.028631 )
								ret := -0.250000
						if( ema13 > -0.049748 )
							if( ema13 <= -0.019014 )
								ret := 0.000000
							if( ema13 > -0.019014 )
								if( ema1 <= 4.83044 )
									ret := 0.250000
								if( ema1 > 4.83044 )
									ret := 0.000000
					if( bearPower > 0.000891 )
						if( ema3 <= 4.7194 )
							ret := 0.166667
						if( ema3 > 4.7194 )
							if( ema2 <= 4.77878 )
								ret := 1.000000 // buy
							if( ema2 > 4.77878 )
								ret := 0.750000 // buy
				if( ema2 > 4.87528 )
					ret := 1.000000 // buy
		if( tema > 4.83408 )
			if( ema13 <= -0.693445 )
				if( ema1 <= 12.532 )
					if( ema13 <= -0.709877 )
						ret := 1.000000 // buy
					if( ema13 > -0.709877 )
						ret := 0.750000 // buy
				if( ema1 > 12.532 )
					if( bbm <= 0.103465 )
						ret := -1.000000 // sell
					if( bbm > 0.103465 )
						ret := -0.500000
			if( ema13 > -0.693445 )
				if( ema2 <= 11.5669 )
					if( tema <= 11.6932 )
						if( ema12 <= -0.335528 )
							if( bearPower <= -0.762919 )
								if( bbm <= 0.341267 )
									ret := -0.600000
								if( bbm > 0.341267 )
									ret := 0.714286 // buy
							if( bearPower > -0.762919 )
								if( ema13 <= -0.603886 )
									ret := -1.000000 // sell
								if( ema13 > -0.603886 )
									ret := -0.700000 // sell
						if( ema12 > -0.335528 )
							if( ema13 <= -0.424302 )
								if( ema3 <= 10.533 )
									ret := 0.791045 // buy
								if( ema3 > 10.533 )
									ret := -0.176471
							if( ema13 > -0.424302 )
								if( ema13 <= 0.113856 )
									ret := 0.068533
								if( ema13 > 0.113856 )
									ret := 0.161196
					if( tema > 11.6932 )
						if( ema1 <= 11.6378 )
							if( bbm <= 0.275 )
								if( bullPower <= 0.290896 )
									ret := -0.444444
								if( bullPower > 0.290896 )
									ret := -0.789474 // sell
							if( bbm > 0.275 )
								if( ema12 <= 0.149641 )
									ret := 0.750000 // buy
								if( ema12 > 0.149641 )
									ret := -0.750000 // sell
						if( ema1 > 11.6378 )
							if( bbp <= 0.846879 )
								if( ema12 <= 0.146329 )
									ret := -0.250000
								if( ema12 > 0.146329 )
									ret := 0.833333 // buy
							if( bbp > 0.846879 )
								ret := -1.000000 // sell
				if( ema2 > 11.5669 )
					if( ema3 <= 11.6294 )
						if( ema2 <= 11.6931 )
							if( ema12 <= 0.024022 )
								if( ema13 <= 0.048915 )
									ret := 0.888889 // buy
								if( ema13 > 0.048915 )
									ret := 0.545455
							if( ema12 > 0.024022 )
								if( ema1 <= 11.6539 )
									ret := 0.179487
								if( ema1 > 11.6539 )
									ret := 0.614286
						if( ema2 > 11.6931 )
							if( ema1 <= 11.7928 )
								ret := -0.250000
							if( ema1 > 11.7928 )
								if( bearPower <= 0.096365 )
									ret := -1.000000 // sell
								if( bearPower > 0.096365 )
									ret := -0.500000
					if( ema3 > 11.6294 )
						if( bbm <= 0.047669 )
							if( bearPower <= -0.074647 )
								if( ema2 <= 11.8814 )
									ret := 0.766234 // buy
								if( ema2 > 11.8814 )
									ret := 0.352273
							if( bearPower > -0.074647 )
								if( bearPower <= 0.080091 )
									ret := 0.135204
								if( bearPower > 0.080091 )
									ret := 0.489362
						if( bbm > 0.047669 )
							if( ema3 <= 12.0835 )
								if( ema2 <= 11.9386 )
									ret := 0.084562
								if( ema2 > 11.9386 )
									ret := -0.187500
							if( ema3 > 12.0835 )
								if( tema <= 11.7659 )
									ret := 0.411043
								if( tema > 11.7659 )
									ret := 0.097500
	if( tema > 12.0935 )
		if( bbp <= -2.23787 )
			if( tema <= 57.1835 )
				if( bullPower <= -1.02545 )
					if( ema13 <= -2.18648 )
						if( tema <= 50.9993 )
							if( bullPower <= -1.33197 )
								ret := 1.000000 // buy
							if( bullPower > -1.33197 )
								ret := 0.800000 // buy
						if( tema > 50.9993 )
							if( ema13 <= -2.35061 )
								ret := 0.200000
							if( ema13 > -2.35061 )
								if( bbm <= 0.843927 )
									ret := 1.000000 // buy
								if( bbm > 0.843927 )
									ret := 0.750000 // buy
					if( ema13 > -2.18648 )
						if( bullPower <= -1.70813 )
							if( ema1 <= 52.723 )
								if( tema <= 50.5668 )
									ret := 1.000000 // buy
								if( tema > 50.5668 )
									ret := 0.250000
							if( ema1 > 52.723 )
								if( bbm <= 0.301051 )
									ret := 0.500000
								if( bbm > 0.301051 )
									ret := -0.928571 // sell
						if( bullPower > -1.70813 )
							if( ema1 <= 44.1189 )
								if( bullPower <= -1.5231 )
									ret := -1.000000 // sell
								if( bullPower > -1.5231 )
									ret := 0.342857
							if( ema1 > 44.1189 )
								if( ema13 <= -1.12508 )
									ret := 0.509259
								if( ema13 > -1.12508 )
									ret := 0.849315 // buy
				if( bullPower > -1.02545 )
					if( ema13 <= -1.48948 )
						if( bbm <= 0.79269 )
							ret := 0.200000
						if( bbm > 0.79269 )
							if( ema3 <= 55.7106 )
								if( bullPower <= -0.77784 )
									ret := 1.000000 // buy
								if( bullPower > -0.77784 )
									ret := 0.750000 // buy
							if( ema3 > 55.7106 )
								ret := 0.600000
					if( ema13 > -1.48948 )
						if( ema1 <= 23.8361 )
							if( bbp <= -2.53151 )
								ret := 0.000000
							if( bbp > -2.53151 )
								if( ema13 <= -0.512306 )
									ret := 0.529412
								if( ema13 > -0.512306 )
									ret := 1.000000 // buy
						if( ema1 > 23.8361 )
							if( tema <= 29.4084 )
								if( bbm <= 0.601934 )
									ret := -0.500000
								if( bbm > 0.601934 )
									ret := -0.857143 // sell
							if( tema > 29.4084 )
								if( bbp <= -2.36376 )
									ret := 0.013986
								if( bbp > -2.36376 )
									ret := 0.463415
			if( tema > 57.1835 )
				if( ema1 <= 59.5964 )
					if( bearPower <= -2.26837 )
						ret := 0.750000 // buy
					if( bearPower > -2.26837 )
						if( ema12 <= -0.737366 )
							if( ema13 <= -2.16909 )
								ret := -1.000000 // sell
							if( ema13 > -2.16909 )
								if( ema12 <= -0.886345 )
									ret := -0.300000
								if( ema12 > -0.886345 )
									ret := -0.916667 // sell
						if( ema12 > -0.737366 )
							if( bbm <= 1.00391 )
								ret := 0.857143 // buy
							if( bbm > 1.00391 )
								if( tema <= 57.9839 )
									ret := 0.000000
								if( tema > 57.9839 )
									ret := -1.000000 // sell
				if( ema1 > 59.5964 )
					if( tema <= 71.5938 )
						if( ema3 <= 74.8816 )
							if( ema2 <= 69.7071 )
								if( ema3 <= 65.9589 )
									ret := 0.187500
								if( ema3 > 65.9589 )
									ret := 0.819672 // buy
							if( ema2 > 69.7071 )
								if( bbm <= 0.578077 )
									ret := 0.684211
								if( bbm > 0.578077 )
									ret := -0.574468
						if( ema3 > 74.8816 )
							if( ema3 <= 76.738 )
								ret := 1.000000 // buy
							if( ema3 > 76.738 )
								ret := 0.750000 // buy
					if( tema > 71.5938 )
						if( tema <= 83.0271 )
							if( ema12 <= -0.313357 )
								if( ema12 <= -1.52964 )
									ret := 0.285714
								if( ema12 > -1.52964 )
									ret := -0.640000
							if( ema12 > -0.313357 )
								ret := 1.000000 // buy
						if( tema > 83.0271 )
							if( ema1 <= 93.8335 )
								if( tema <= 88.2843 )
									ret := 0.333333
								if( tema > 88.2843 )
									ret := 0.916667 // buy
							if( ema1 > 93.8335 )
								if( ema1 <= 94.4061 )
									ret := -1.000000 // sell
								if( ema1 > 94.4061 )
									ret := -0.111111
		if( bbp > -2.23787 )
			if( bbp <= 0.151177 )
				if( tema <= 57.7999 )
					if( bbm <= 0.018788 )
						if( bullPower <= -0.179484 )
							if( ema12 <= -0.134906 )
								if( ema3 <= 42.6621 )
									ret := -0.086667
								if( ema3 > 42.6621 )
									ret := 0.296089
							if( ema12 > -0.134906 )
								if( ema1 <= 25.0417 )
									ret := 0.616487
								if( ema1 > 25.0417 )
									ret := 0.309091
						if( bullPower > -0.179484 )
							if( ema13 <= -0.288342 )
								if( tema <= 26.9827 )
									ret := -0.534483
								if( tema > 26.9827 )
									ret := 0.020202
							if( ema13 > -0.288342 )
								if( bbp <= -0.018834 )
									ret := 0.146199
								if( bbp > -0.018834 )
									ret := 0.046218
					if( bbm > 0.018788 )
						if( ema2 <= 19.5411 )
							if( ema2 <= 19.301 )
								if( ema2 <= 17.511 )
									ret := 0.037044
								if( ema2 > 17.511 )
									ret := 0.122279
							if( ema2 > 19.301 )
								if( ema12 <= -0.50056 )
									ret := -1.000000 // sell
								if( ema12 > -0.50056 )
									ret := 0.383275
						if( ema2 > 19.5411 )
							if( ema3 <= 21.263 )
								if( ema12 <= -0.043918 )
									ret := -0.024820
								if( ema12 > -0.043918 )
									ret := -0.176336
							if( ema3 > 21.263 )
								if( ema13 <= -0.413361 )
									ret := -0.020657
								if( ema13 > -0.413361 )
									ret := 0.067260
				if( tema > 57.7999 )
					if( ema3 <= 69.1715 )
						if( ema3 <= 62.2669 )
							if( tema <= 61.2775 )
								if( ema12 <= -0.396013 )
									ret := -0.542254
								if( ema12 > -0.396013 )
									ret := -0.063866
							if( tema > 61.2775 )
								if( ema12 <= 0.054171 )
									ret := 0.780220 // buy
								if( ema12 > 0.054171 )
									ret := -0.176471
						if( ema3 > 62.2669 )
							if( bullPower <= -0.684088 )
								if( ema1 <= 64.9093 )
									ret := 0.242424
								if( ema1 > 64.9093 )
									ret := 0.666667
							if( bullPower > -0.684088 )
								if( ema12 <= 0.134291 )
									ret := -0.431343
								if( ema12 > 0.134291 )
									ret := 0.147059
					if( ema3 > 69.1715 )
						if( ema2 <= 69.8944 )
							if( bbm <= 0.335 )
								if( ema1 <= 69.6757 )
									ret := 0.933333 // buy
								if( ema1 > 69.6757 )
									ret := 0.500000
							if( bbm > 0.335 )
								if( bearPower <= -0.897148 )
									ret := 0.730769 // buy
								if( bearPower > -0.897148 )
									ret := -0.027778
						if( ema2 > 69.8944 )
							if( bullPower <= 0.468038 )
								if( ema3 <= 74.0358 )
									ret := -0.176471
								if( ema3 > 74.0358 )
									ret := 0.051429
							if( bullPower > 0.468038 )
								if( ema1 <= 83.0617 )
									ret := 0.671642
								if( ema1 > 83.0617 )
									ret := -0.176471
			if( bbp > 0.151177 )
				if( bbm <= 0.069865 )
					if( bearPower <= 1.21348 )
						if( ema13 <= 0.004673 )
							if( tema <= 45.2482 )
								if( bullPower <= 0.372761 )
									ret := -0.415808
								if( bullPower > 0.372761 )
									ret := -0.960000 // sell
							if( tema > 45.2482 )
								if( ema2 <= 54.4815 )
									ret := 0.156627
								if( ema2 > 54.4815 )
									ret := -0.228571
						if( ema13 > 0.004673 )
							if( bullPower <= 0.108148 )
								if( ema2 <= 14.2591 )
									ret := -0.106509
								if( ema2 > 14.2591 )
									ret := 0.146084
							if( bullPower > 0.108148 )
								if( ema13 <= 0.213144 )
									ret := -0.175322
								if( ema13 > 0.213144 )
									ret := -0.003030
					if( bearPower > 1.21348 )
						if( ema2 <= 71.8201 )
							if( ema13 <= 0.837038 )
								if( bbp <= 2.6118 )
									ret := 0.000000
								if( bbp > 2.6118 )
									ret := -0.809524 // sell
							if( ema13 > 0.837038 )
								if( bearPower <= 1.84699 )
									ret := -1.000000 // sell
								if( bearPower > 1.84699 )
									ret := -0.888889 // sell
						if( ema2 > 71.8201 )
							if( ema2 <= 73.5208 )
								ret := 1.000000 // buy
							if( ema2 > 73.5208 )
								if( bbp <= 3.38667 )
									ret := -0.500000
								if( bbp > 3.38667 )
									ret := -0.800000 // sell
				if( bbm > 0.069865 )
					if( ema13 <= 0.568181 )
						if( ema12 <= 0.264018 )
							if( ema2 <= 77.4951 )
								if( ema3 <= 57.2045 )
									ret := 0.014172
								if( ema3 > 57.2045 )
									ret := 0.164916
							if( ema2 > 77.4951 )
								if( ema3 <= 93.8129 )
									ret := -0.582609
								if( ema3 > 93.8129 )
									ret := 0.923077 // buy
						if( ema12 > 0.264018 )
							if( ema1 <= 39.3481 )
								if( ema2 <= 33.7057 )
									ret := -0.179806
								if( ema2 > 33.7057 )
									ret := -0.551282
							if( ema1 > 39.3481 )
								if( tema <= 49.4568 )
									ret := 0.316667
								if( tema > 49.4568 )
									ret := -0.099366
					if( ema13 > 0.568181 )
						if( tema <= 30.41 )
							if( bbp <= 3.34397 )
								if( ema13 <= 0.889612 )
									ret := 0.133758
								if( ema13 > 0.889612 )
									ret := 0.586538
							if( bbp > 3.34397 )
								if( bearPower <= 1.4591 )
									ret := -1.000000 // sell
								if( bearPower > 1.4591 )
									ret := -0.600000
						if( tema > 30.41 )
							if( bbm <= 1.80339 )
								if( ema2 <= 91.5172 )
									ret := 0.075762
								if( ema2 > 91.5172 )
									ret := -0.459016
							if( bbm > 1.80339 )
								if( tema <= 53.9275 )
									ret := 0.500000
								if( tema > 53.9275 )
									ret := -0.534091
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_RUN_15Min_ac47e9b2(bbm, bearPower, bbp, bullPower, BBPower_Color, ema1, tema, ema12, ema2, ema3, ema13)

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


