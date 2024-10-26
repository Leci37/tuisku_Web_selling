//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: XLMUSDT_15Min_2BV0_fa3f2b4b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2BV0_fa3f2b4b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_fa3f2b4b(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( bearPower <= -0.000428 )
		if( VIP_VIM <= -0.365838 )
			if( bearPower <= -0.003177 )
				if( VIM <= 1.33818 )
					if( VIP_VIM <= -0.77099 )
						if( bbp <= -0.009174 )
							ret := 1.000000 // buy
						if( bbp > -0.009174 )
							if( bbp <= -0.005517 )
								ret := 0.600000
							if( bbp > -0.005517 )
								ret := 1.000000 // buy
					if( VIP_VIM > -0.77099 )
						if( VIP <= 0.590164 )
							if( VIM <= 1.18249 )
								if( bbm <= 0.005044 )
									ret := -0.285714
								if( bbm > 0.005044 )
									ret := 0.714286 // buy
							if( VIM > 1.18249 )
								if( VIP_VIM <= -0.728866 )
									ret := -0.250000
								if( VIP_VIM > -0.728866 )
									ret := -0.894737 // sell
						if( VIP > 0.590164 )
							if( bbp <= -0.007708 )
								if( VIP_VIM <= -0.590477 )
									ret := 0.942308 // buy
								if( VIP_VIM > -0.590477 )
									ret := 0.653061
							if( bbp > -0.007708 )
								if( bbp <= -0.005801 )
									ret := 0.163265
								if( bbp > -0.005801 )
									ret := 0.579137
				if( VIM > 1.33818 )
					if( VIP_VIM <= -0.712097 )
						if( VIP_VIM <= -0.740573 )
							if( VIP_VIM <= -0.771164 )
								if( VIP <= 0.523179 )
									ret := 0.600000
								if( VIP > 0.523179 )
									ret := -0.157303
							if( VIP_VIM > -0.771164 )
								if( bbp <= -0.006002 )
									ret := 0.875000 // buy
								if( bbp > -0.006002 )
									ret := 0.111111
						if( VIP_VIM > -0.740573 )
							if( bullPower <= -0.002269 )
								if( VIP_VIM <= -0.729931 )
									ret := -0.600000
								if( VIP_VIM > -0.729931 )
									ret := -1.000000 // sell
							if( bullPower > -0.002269 )
								ret := 0.454545
					if( VIP_VIM > -0.712097 )
						ret := 1.000000 // buy
			if( bearPower > -0.003177 )
				if( VIM <= 1.29629 )
					if( bearPower <= -0.000654 )
						if( VIP <= 0.816468 )
							if( bbp <= -0.004707 )
								if( VIP <= 0.715298 )
									ret := -0.363636
								if( VIP > 0.715298 )
									ret := -0.916667 // sell
							if( bbp > -0.004707 )
								if( VIP_VIM <= -0.62187 )
									ret := 0.489691
								if( VIP_VIM > -0.62187 )
									ret := 0.197072
						if( VIP > 0.816468 )
							if( bbm <= 0.001438 )
								if( VIP_VIM <= -0.388264 )
									ret := 0.662921
								if( VIP_VIM > -0.388264 )
									ret := 0.357143
							if( bbm > 0.001438 )
								ret := -0.437500
					if( bearPower > -0.000654 )
						if( VIP <= 0.839002 )
							if( bearPower <= -0.000651 )
								ret := -0.588235
							if( bearPower > -0.000651 )
								if( VIM <= 1.18912 )
									ret := 0.242188
								if( VIM > 1.18912 )
									ret := 0.041441
						if( VIP > 0.839002 )
							if( bbm <= 0.000242 )
								ret := -0.222222
							if( bbm > 0.000242 )
								if( bullPower <= -0.000172 )
									ret := 1.000000 // buy
								if( bullPower > -0.000172 )
									ret := 0.545455
				if( VIM > 1.29629 )
					if( VIM <= 1.30069 )
						if( bearPower <= -0.001518 )
							if( bbm <= 0.001074 )
								if( VIP <= 0.674642 )
									ret := 0.700000 // buy
								if( VIP > 0.674642 )
									ret := -0.062500
							if( bbm > 0.001074 )
								if( VIM <= 1.29789 )
									ret := -0.800000 // sell
								if( VIM > 1.29789 )
									ret := 0.000000
						if( bearPower > -0.001518 )
							if( VIP_VIM <= -0.567117 )
								if( VIP_VIM <= -0.593756 )
									ret := -0.500000
								if( VIP_VIM > -0.593756 )
									ret := 0.100000
							if( VIP_VIM > -0.567117 )
								if( bearPower <= -0.000596 )
									ret := -0.837838 // sell
								if( bearPower > -0.000596 )
									ret := -0.307692
					if( VIM > 1.30069 )
						if( VIP <= 0.716104 )
							if( VIP <= 0.71265 )
								if( VIM <= 1.49707 )
									ret := 0.081766
								if( VIM > 1.49707 )
									ret := -0.866667 // sell
							if( VIP > 0.71265 )
								if( VIP_VIM <= -0.605609 )
									ret := -0.400000
								if( VIP_VIM > -0.605609 )
									ret := -0.777778 // sell
						if( VIP > 0.716104 )
							if( bearPower <= -0.000909 )
								if( bbp <= -0.004279 )
									ret := 1.000000 // buy
								if( bbp > -0.004279 )
									ret := 0.617188
							if( bearPower > -0.000909 )
								if( VIP_VIM <= -0.56202 )
									ret := 0.271186
								if( VIP_VIM > -0.56202 )
									ret := -0.375000
		if( VIP_VIM > -0.365838 )
			if( VIP <= 1.0729 )
				if( VIP <= 0.793032 )
					if( bearPower <= -0.001776 )
						if( VIM <= 1.13592 )
							if( VIM <= 1.11095 )
								if( VIM <= 1.05245 )
									ret := -0.368421
								if( VIM > 1.05245 )
									ret := 0.270833
							if( VIM > 1.11095 )
								if( VIM <= 1.11848 )
									ret := -0.444444
								if( VIM > 1.11848 )
									ret := -0.950000 // sell
						if( VIM > 1.13592 )
							ret := 0.687500
					if( bearPower > -0.001776 )
						if( bearPower <= -0.001052 )
							if( VIM <= 1.08093 )
								if( bullPower <= 0.000167 )
									ret := -0.111111
								if( bullPower > 0.000167 )
									ret := 0.857143 // buy
							if( VIM > 1.08093 )
								if( bbm <= 0.000889 )
									ret := 0.315789
								if( bbm > 0.000889 )
									ret := 0.737589 // buy
						if( bearPower > -0.001052 )
							if( bearPower <= -0.000884 )
								if( VIP_VIM <= -0.344945 )
									ret := 0.500000
								if( VIP_VIM > -0.344945 )
									ret := -0.333333
							if( bearPower > -0.000884 )
								if( VIP <= 0.781929 )
									ret := -0.363636
								if( VIP > 0.781929 )
									ret := 0.693333
				if( VIP > 0.793032 )
					if( VIP_VIM <= -0.336526 )
						if( bbp <= -0.003954 )
							if( VIP <= 0.815679 )
								ret := 1.000000 // buy
							if( VIP > 0.815679 )
								ret := 0.727273 // buy
						if( bbp > -0.003954 )
							if( bullPower <= -0.001001 )
								if( VIP <= 0.835991 )
									ret := -0.428571
								if( VIP > 0.835991 )
									ret := -1.000000 // sell
							if( bullPower > -0.001001 )
								if( bbp <= -0.000254 )
									ret := -0.042220
								if( bbp > -0.000254 )
									ret := -0.923077 // sell
					if( VIP_VIM > -0.336526 )
						if( VIM <= 0.823787 )
							if( bbm <= 0.002671 )
								ret := -0.950000 // sell
							if( bbm > 0.002671 )
								ret := -0.333333
						if( VIM > 0.823787 )
							if( bbm <= 0.003867 )
								if( VIP <= 0.825991 )
									ret := 0.248136
								if( VIP > 0.825991 )
									ret := 0.096269
							if( bbm > 0.003867 )
								if( bearPower <= -0.002729 )
									ret := -0.232558
								if( bearPower > -0.002729 )
									ret := -0.793103 // sell
			if( VIP > 1.0729 )
				if( bearPower <= -0.001469 )
					if( bearPower <= -0.002337 )
						ret := 0.578947
					if( bearPower > -0.002337 )
						if( bullPower <= 0.00054 )
							if( VIM <= 1.00944 )
								ret := -1.000000 // sell
							if( VIM > 1.00944 )
								ret := -0.555556
						if( bullPower > 0.00054 )
							ret := -0.142857
				if( bearPower > -0.001469 )
					if( VIP_VIM <= 0.081736 )
						if( bbm <= 0.001037 )
							if( VIM <= 1.05858 )
								if( bearPower <= -0.000513 )
									ret := 0.986486 // buy
								if( bearPower > -0.000513 )
									ret := 0.692308
							if( VIM > 1.05858 )
								ret := -0.043478
						if( bbm > 0.001037 )
							ret := -0.818182 // sell
					if( VIP_VIM > 0.081736 )
						if( VIM <= 0.773019 )
							if( VIP <= 1.11413 )
								ret := 0.947368 // buy
							if( VIP > 1.11413 )
								ret := 0.538462
						if( VIM > 0.773019 )
							if( VIP <= 1.17787 )
								if( VIP <= 1.15049 )
									ret := 0.246929
								if( VIP > 1.15049 )
									ret := -0.228916
							if( VIP > 1.17787 )
								if( bbm <= 0.001048 )
									ret := 0.704225 // buy
								if( bbm > 0.001048 )
									ret := 0.000000
	if( bearPower > -0.000428 )
		if( bbp <= 0.00662 )
			if( bbp <= -8.7e-05 )
				if( VIP <= 1.0628 )
					if( VIP_VIM <= -0.091018 )
						if( bbm <= 0.0003 )
							if( VIP_VIM <= -0.098524 )
								if( VIP <= 1.00744 )
									ret := -0.009596
								if( VIP > 1.00744 )
									ret := -0.500000
							if( VIP_VIM > -0.098524 )
								if( bullPower <= -3e-05 )
									ret := -0.586207
								if( bullPower > -3e-05 )
									ret := 0.014925
						if( bbm > 0.0003 )
							if( bbm <= 0.000387 )
								if( VIP_VIM <= -0.105515 )
									ret := 0.268765
								if( VIP_VIM > -0.105515 )
									ret := -0.214286
							if( bbm > 0.000387 )
								if( bullPower <= 0.000288 )
									ret := 0.014988
								if( bullPower > 0.000288 )
									ret := -0.600000
					if( VIP_VIM > -0.091018 )
						if( VIM <= 1.03898 )
							if( VIM <= 1.03584 )
								if( VIM <= 1.03085 )
									ret := 0.027218
								if( VIM > 1.03085 )
									ret := 0.298077
							if( VIM > 1.03584 )
								if( VIM <= 1.03634 )
									ret := -0.857143 // sell
								if( VIM > 1.03634 )
									ret := -0.254902
						if( VIM > 1.03898 )
							if( VIP_VIM <= -0.079111 )
								if( bbm <= 0.000204 )
									ret := 0.076923
								if( bbm > 0.000204 )
									ret := 0.534722
							if( VIP_VIM > -0.079111 )
								if( bbp <= -0.000265 )
									ret := 0.297297
								if( bbp > -0.000265 )
									ret := 0.010283
				if( VIP > 1.0628 )
					if( VIP <= 1.14571 )
						if( VIM <= 0.956816 )
							if( bbm <= 0.000388 )
								if( VIP <= 1.11114 )
									ret := 0.273810
								if( VIP > 1.11114 )
									ret := 0.618421
							if( bbm > 0.000388 )
								if( bbm <= 0.000401 )
									ret := -0.068323
								if( bbm > 0.000401 )
									ret := 0.360000
						if( VIM > 0.956816 )
							if( bbp <= -0.000236 )
								if( bullPower <= -5.4e-05 )
									ret := -0.013333
								if( bullPower > -5.4e-05 )
									ret := 0.408333
							if( bbp > -0.000236 )
								if( bbp <= -0.000149 )
									ret := -0.352000
								if( bbp > -0.000149 )
									ret := 0.054945
					if( VIP > 1.14571 )
						if( bullPower <= 9.2e-05 )
							if( bbp <= -0.000192 )
								if( bbp <= -0.000323 )
									ret := 0.000000
								if( bbp > -0.000323 )
									ret := -0.472973
							if( bbp > -0.000192 )
								if( VIM <= 0.921675 )
									ret := 0.212121
								if( VIM > 0.921675 )
									ret := -0.636364
						if( bullPower > 9.2e-05 )
							if( VIP_VIM <= 0.285349 )
								if( bbp <= -0.000117 )
									ret := 0.705882 // buy
								if( bbp > -0.000117 )
									ret := 0.882353 // buy
							if( VIP_VIM > 0.285349 )
								if( VIP_VIM <= 0.328854 )
									ret := -0.395833
								if( VIP_VIM > 0.328854 )
									ret := 0.400000
			if( bbp > -8.7e-05 )
				if( bearPower <= -0.000393 )
					if( bearPower <= -0.000395 )
						if( bearPower <= -0.000422 )
							if( bbp <= 0.000452 )
								if( VIP_VIM <= 0.158564 )
									ret := -0.594595
								if( VIP_VIM > 0.158564 )
									ret := -1.000000 // sell
							if( bbp > 0.000452 )
								ret := 0.111111
						if( bearPower > -0.000422 )
							if( VIP <= 0.897154 )
								if( VIP_VIM <= -0.249392 )
									ret := -0.166667
								if( VIP_VIM > -0.249392 )
									ret := 0.705882 // buy
							if( VIP > 0.897154 )
								if( VIP <= 0.930766 )
									ret := -0.823529 // sell
								if( VIP > 0.930766 )
									ret := -0.098160
					if( bearPower > -0.000395 )
						if( VIP_VIM <= 0.09482 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.09482 )
							ret := -0.500000
				if( bearPower > -0.000393 )
					if( VIP <= 1.34259 )
						if( bearPower <= 0.001478 )
							if( VIP <= 1.33846 )
								if( VIM <= 0.58025 )
									ret := -0.532258
								if( VIM > 0.58025 )
									ret := 0.005351
							if( VIP > 1.33846 )
								if( bullPower <= 0.001293 )
									ret := -0.111111
								if( bullPower > 0.001293 )
									ret := -0.941176 // sell
						if( bearPower > 0.001478 )
							if( VIP_VIM <= 0.573689 )
								if( VIM <= 0.726118 )
									ret := 0.625000
								if( VIM > 0.726118 )
									ret := -0.305970
							if( VIP_VIM > 0.573689 )
								if( VIP <= 1.30611 )
									ret := -0.826087 // sell
								if( VIP > 1.30611 )
									ret := -0.153846
					if( VIP > 1.34259 )
						if( bullPower <= 0.001688 )
							if( VIP_VIM <= 0.732868 )
								if( VIP <= 1.35438 )
									ret := 0.283582
								if( VIP > 1.35438 )
									ret := -0.071730
							if( VIP_VIM > 0.732868 )
								if( VIP_VIM <= 0.792729 )
									ret := -0.442953
								if( VIP_VIM > 0.792729 )
									ret := 0.156028
						if( bullPower > 0.001688 )
							if( VIM <= 0.571328 )
								if( bearPower <= 0.001945 )
									ret := 0.080357
								if( bearPower > 0.001945 )
									ret := -0.857143 // sell
							if( VIM > 0.571328 )
								if( VIP <= 1.34713 )
									ret := 0.933333 // buy
								if( VIP > 1.34713 )
									ret := 0.432432
		if( bbp > 0.00662 )
			if( bearPower <= 0.002222 )
				if( VIP <= 1.20566 )
					ret := -0.200000
				if( VIP > 1.20566 )
					if( bearPower <= 0.001666 )
						ret := 1.000000 // buy
					if( bearPower > 0.001666 )
						ret := 0.307692
			if( bearPower > 0.002222 )
				if( VIM <= 0.668808 )
					if( VIP <= 1.29645 )
						ret := 0.347826
					if( VIP > 1.29645 )
						if( VIP_VIM <= 0.952829 )
							if( bbm <= 0.001525 )
								ret := 0.428571
							if( bbm > 0.001525 )
								if( VIM <= 0.598032 )
									ret := -0.903226 // sell
								if( VIM > 0.598032 )
									ret := -0.217391
						if( VIP_VIM > 0.952829 )
							if( bullPower <= 0.006999 )
								ret := -0.166667
							if( bullPower > 0.006999 )
								ret := 0.818182 // buy
				if( VIM > 0.668808 )
					if( VIM <= 0.682287 )
						ret := -0.947368 // sell
					if( VIM > 0.682287 )
						if( VIP_VIM <= 0.556092 )
							if( VIM <= 0.720431 )
								ret := -1.000000 // sell
							if( VIM > 0.720431 )
								if( VIP <= 1.19304 )
									ret := -0.166667
								if( VIP > 1.19304 )
									ret := -0.838710 // sell
						if( VIP_VIM > 0.556092 )
							ret := -0.083333
	
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


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
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
float op_operation = decision_tree_0_XLMUSDT_15Min_fa3f2b4b(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)

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


