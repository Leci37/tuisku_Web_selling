//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: CRWD_1Min_2BV0_1159d536 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2BV0_1159d536", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_1159d536(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.714457 )
		if( VIP <= 0.901264 )
			if( bullPower <= -4.35581 )
				if( VIP_VIM <= -0.537516 )
					ret := 1.000000 // buy
				if( VIP_VIM > -0.537516 )
					ret := 0.750000 // buy
			if( bullPower > -4.35581 )
				if( VIM <= 1.50804 )
					if( bullPower <= -0.918448 )
						if( VIP_VIM <= -0.577066 )
							if( bbp <= -9.3588 )
								if( VIP <= 0.473388 )
									ret := -0.500000
								if( VIP > 0.473388 )
									ret := -0.923077 // sell
							if( bbp > -9.3588 )
								if( bullPower <= -3.32015 )
									ret := 1.000000 // buy
								if( bullPower > -3.32015 )
									ret := 0.029021
						if( VIP_VIM > -0.577066 )
							if( bearPower <= -4.93496 )
								if( bearPower <= -5.77013 )
									ret := 0.000000
								if( bearPower > -5.77013 )
									ret := 1.000000 // buy
							if( bearPower > -4.93496 )
								if( bbp <= -5.66455 )
									ret := 0.203704
								if( bbp > -5.66455 )
									ret := -0.291391
					if( bullPower > -0.918448 )
						if( bearPower <= -1.19655 )
							if( VIP <= 0.69557 )
								if( bearPower <= -1.56503 )
									ret := 0.258065
								if( bearPower > -1.56503 )
									ret := 0.724638 // buy
							if( VIP > 0.69557 )
								if( bearPower <= -3.19796 )
									ret := -1.000000 // sell
								if( bearPower > -3.19796 )
									ret := 0.107399
						if( bearPower > -1.19655 )
							if( bearPower <= -0.915027 )
								if( bbm <= 0.405471 )
									ret := -0.302326
								if( bbm > 0.405471 )
									ret := 0.363636
							if( bearPower > -0.915027 )
								if( bullPower <= -0.769886 )
									ret := 0.900000 // buy
								if( bullPower > -0.769886 )
									ret := 0.375000
				if( VIM > 1.50804 )
					if( VIP <= 0.38142 )
						ret := -1.000000 // sell
					if( VIP > 0.38142 )
						if( VIP_VIM <= -0.690094 )
							if( VIM <= 1.64813 )
								if( bbp <= -3.42089 )
									ret := 0.553846
								if( bbp > -3.42089 )
									ret := 0.122449
							if( VIM > 1.64813 )
								if( VIP <= 0.478197 )
									ret := -0.166667
								if( VIP > 0.478197 )
									ret := 0.849057 // buy
						if( VIP_VIM > -0.690094 )
							ret := -0.750000 // sell
		if( VIP > 0.901264 )
			if( bullPower <= -9.74232 )
				if( bbp <= -43.2765 )
					ret := 0.000000
				if( bbp > -43.2765 )
					ret := -1.000000 // sell
			if( bullPower > -9.74232 )
				if( VIP <= 66.1129 )
					if( VIM <= 2.21849 )
						if( VIP <= 1.14074 )
							if( bbm <= 0.054131 )
								if( bullPower <= -0.848307 )
									ret := -0.666667
								if( bullPower > -0.848307 )
									ret := 0.166667
							if( bbm > 0.054131 )
								if( VIM <= 1.71069 )
									ret := 0.430189
								if( VIM > 1.71069 )
									ret := 0.886792 // buy
						if( VIP > 1.14074 )
							if( bearPower <= -0.757257 )
								if( VIP_VIM <= 0.030975 )
									ret := 0.700935 // buy
								if( VIP_VIM > 0.030975 )
									ret := 0.961538 // buy
							if( bearPower > -0.757257 )
								if( VIP_VIM <= -0.19479 )
									ret := 0.000000
								if( VIP_VIM > -0.19479 )
									ret := 0.500000
					if( VIM > 2.21849 )
						if( bbp <= -2.60443 )
							if( VIP_VIM <= -1.15404 )
								if( VIP <= 20.3371 )
									ret := 0.397959
								if( VIP > 20.3371 )
									ret := -0.545455
							if( VIP_VIM > -1.15404 )
								if( VIP_VIM <= 0.958167 )
									ret := 0.604839
								if( VIP_VIM > 0.958167 )
									ret := -0.285714
						if( bbp > -2.60443 )
							if( bullPower <= -0.800321 )
								if( VIM <= 3.20018 )
									ret := -0.206612
								if( VIM > 3.20018 )
									ret := 0.223529
							if( bullPower > -0.800321 )
								if( VIM <= 5.9638 )
									ret := 0.603960
								if( VIM > 5.9638 )
									ret := 0.128205
				if( VIP > 66.1129 )
					if( bbp <= -1.78427 )
						if( VIM <= 256.327 )
							if( VIP_VIM <= -1.93583 )
								ret := -0.166667
							if( VIP_VIM > -1.93583 )
								ret := -1.000000 // sell
						if( VIM > 256.327 )
							ret := 0.166667
					if( bbp > -1.78427 )
						if( bullPower <= -0.784998 )
							ret := 0.000000
						if( bullPower > -0.784998 )
							ret := 0.750000 // buy
	if( bullPower > -0.714457 )
		if( bearPower <= 0.471075 )
			if( VIM <= 1.46497 )
				if( bearPower <= -2.95264 )
					if( VIP <= 0.698901 )
						if( VIP_VIM <= -0.689186 )
							ret := 0.857143 // buy
						if( VIP_VIM > -0.689186 )
							if( bearPower <= -5.62586 )
								if( VIP <= 0.496451 )
									ret := 0.600000
								if( VIP > 0.496451 )
									ret := -0.769231 // sell
							if( bearPower > -5.62586 )
								if( VIP_VIM <= -0.581244 )
									ret := -0.500000
								if( VIP_VIM > -0.581244 )
									ret := 0.800000 // buy
					if( VIP > 0.698901 )
						if( bbm <= 6.81252 )
							if( bbm <= 3.75407 )
								if( VIP_VIM <= -0.345471 )
									ret := -0.882353 // sell
								if( VIP_VIM > -0.345471 )
									ret := -0.500000
							if( bbm > 3.75407 )
								ret := -1.000000 // sell
						if( bbm > 6.81252 )
							if( bullPower <= 2.428 )
								ret := -0.500000
							if( bullPower > 2.428 )
								if( VIP <= 0.887115 )
									ret := 0.250000
								if( VIP > 0.887115 )
									ret := 0.500000
				if( bearPower > -2.95264 )
					if( bbp <= 3.76085 )
						if( bbm <= 1.19996 )
							if( bbm <= 0.22594 )
								if( bullPower <= -0.598278 )
									ret := 0.376623
								if( bullPower > -0.598278 )
									ret := 0.004228
							if( bbm > 0.22594 )
								if( VIM <= 0.911421 )
									ret := 0.006647
								if( VIM > 0.911421 )
									ret := 0.062016
						if( bbm > 1.19996 )
							if( VIP_VIM <= 0.35976 )
								if( bbp <= -2.32716 )
									ret := 0.393939
								if( bbp > -2.32716 )
									ret := 0.147236
							if( VIP_VIM > 0.35976 )
								if( bullPower <= 1.44056 )
									ret := 0.217949
								if( bullPower > 1.44056 )
									ret := -0.197802
					if( bbp > 3.76085 )
						if( VIM <= 0.403763 )
							ret := 1.000000 // buy
						if( VIM > 0.403763 )
							if( bearPower <= 0.165979 )
								if( VIP <= 1.00478 )
									ret := -0.200000
								if( VIP > 1.00478 )
									ret := -0.939394 // sell
							if( bearPower > 0.165979 )
								if( bullPower <= 4.16982 )
									ret := -1.000000 // sell
								if( bullPower > 4.16982 )
									ret := 0.111111
			if( VIM > 1.46497 )
				if( bullPower <= -0.155048 )
					if( VIP_VIM <= -0.604943 )
						if( VIP_VIM <= -0.778259 )
							if( VIP <= 3.28194 )
								if( VIM <= 2.44722 )
									ret := 0.055147
								if( VIM > 2.44722 )
									ret := 0.373737
							if( VIP > 3.28194 )
								if( bbp <= -1.05821 )
									ret := -0.432836
								if( bbp > -1.05821 )
									ret := 0.052632
						if( VIP_VIM > -0.778259 )
							if( bullPower <= -0.410254 )
								if( VIP <= 2.85235 )
									ret := -0.554054
								if( VIP > 2.85235 )
									ret := 0.000000
							if( bullPower > -0.410254 )
								if( VIP <= 1.77776 )
									ret := -0.143939
								if( VIP > 1.77776 )
									ret := 0.333333
					if( VIP_VIM > -0.604943 )
						if( bbm <= 0.762604 )
							if( VIP_VIM <= 0.969627 )
								if( VIP <= 8.41075 )
									ret := 0.241163
								if( VIP > 8.41075 )
									ret := 0.422535
							if( VIP_VIM > 0.969627 )
								if( VIM <= 7.29625 )
									ret := 0.711111 // buy
								if( VIM > 7.29625 )
									ret := 0.260417
						if( bbm > 0.762604 )
							if( VIM <= 1.91159 )
								if( bearPower <= -1.1053 )
									ret := 0.233333
								if( bearPower > -1.1053 )
									ret := -1.000000 // sell
							if( VIM > 1.91159 )
								if( bearPower <= -1.40709 )
									ret := -0.272727
								if( bearPower > -1.40709 )
									ret := -0.928571 // sell
				if( bullPower > -0.155048 )
					if( bullPower <= 0.609925 )
						if( bbm <= 1.66418 )
							if( VIP_VIM <= 0.579336 )
								if( VIM <= 2.01729 )
									ret := 0.132184
								if( VIM > 2.01729 )
									ret := -0.002758
							if( VIP_VIM > 0.579336 )
								if( VIM <= 7.51714 )
									ret := 0.251790
								if( VIM > 7.51714 )
									ret := -0.013699
						if( bbm > 1.66418 )
							if( bearPower <= -1.78668 )
								if( VIM <= 1.6422 )
									ret := 0.300000
								if( VIM > 1.6422 )
									ret := 1.000000 // buy
							if( bearPower > -1.78668 )
								ret := 1.000000 // buy
					if( bullPower > 0.609925 )
						if( VIP_VIM <= 0.745982 )
							if( bullPower <= 1.6199 )
								if( bbp <= -0.816073 )
									ret := -1.000000 // sell
								if( bbp > -0.816073 )
									ret := 0.361702
							if( bullPower > 1.6199 )
								if( VIP_VIM <= 0.336539 )
									ret := 0.821429 // buy
								if( VIP_VIM > 0.336539 )
									ret := 0.142857
						if( VIP_VIM > 0.745982 )
							if( bearPower <= 0.196213 )
								if( bbp <= 0.847637 )
									ret := -0.555556
								if( bbp > 0.847637 )
									ret := -1.000000 // sell
							if( bearPower > 0.196213 )
								if( bbm <= 1.51 )
									ret := 0.235294
								if( bbm > 1.51 )
									ret := 1.000000 // buy
		if( bearPower > 0.471075 )
			if( bbm <= 0.561668 )
				if( VIM <= 2.46618 )
					if( bearPower <= 0.78055 )
						if( VIM <= 0.759635 )
							if( VIM <= 0.644387 )
								if( bearPower <= 0.488202 )
									ret := 0.321429
								if( bearPower > 0.488202 )
									ret := -0.190955
							if( VIM > 0.644387 )
								if( bullPower <= 0.975936 )
									ret := 0.220690
								if( bullPower > 0.975936 )
									ret := -0.084746
						if( VIM > 0.759635 )
							if( VIP_VIM <= 0.74571 )
								if( bearPower <= 0.718967 )
									ret := -0.168337
								if( bearPower > 0.718967 )
									ret := 0.232877
							if( VIP_VIM > 0.74571 )
								if( bullPower <= 0.60769 )
									ret := -0.775510 // sell
								if( bullPower > 0.60769 )
									ret := -0.265823
					if( bearPower > 0.78055 )
						if( bullPower <= 1.38998 )
							if( bbm <= 0.1519 )
								if( VIP_VIM <= 0.784336 )
									ret := -0.768116 // sell
								if( VIP_VIM > 0.784336 )
									ret := -0.377049
							if( bbm > 0.1519 )
								if( VIP_VIM <= 0.363973 )
									ret := 0.361111
								if( VIP_VIM > 0.363973 )
									ret := -0.353414
						if( bullPower > 1.38998 )
							if( bbp <= 2.4683 )
								if( bullPower <= 1.44529 )
									ret := 0.150000
								if( bullPower > 1.44529 )
									ret := 1.000000 // buy
							if( bbp > 2.4683 )
								if( VIM <= 1.8811 )
									ret := -0.133603
								if( VIM > 1.8811 )
									ret := -0.806452 // sell
				if( VIM > 2.46618 )
					if( VIM <= 241.345 )
						if( VIP_VIM <= 0.308212 )
							if( bbp <= 3.22636 )
								if( bbm <= 3.1e-05 )
									ret := 0.008247
								if( bbm > 3.1e-05 )
									ret := 0.306604
							if( bbp > 3.22636 )
								if( VIP <= 10.0379 )
									ret := 0.000000
								if( VIP > 10.0379 )
									ret := 0.702128 // buy
						if( VIP_VIM > 0.308212 )
							if( VIM <= 32.927 )
								if( VIM <= 3.9412 )
									ret := 0.104545
								if( VIM > 3.9412 )
									ret := -0.281579
							if( VIM > 32.927 )
								if( VIM <= 61.3132 )
									ret := 0.807692 // buy
								if( VIM > 61.3132 )
									ret := 0.181818
					if( VIM > 241.345 )
						if( VIP <= 975.59 )
							if( bbp <= 1.69445 )
								if( VIM <= 675.204 )
									ret := -0.705882 // sell
								if( VIM > 675.204 )
									ret := -1.000000 // sell
							if( bbp > 1.69445 )
								ret := -1.000000 // sell
						if( VIP > 975.59 )
							if( VIP <= 1575.96 )
								ret := 0.200000
							if( VIP > 1575.96 )
								ret := -0.666667
			if( bbm > 0.561668 )
				if( VIP_VIM <= 0.429885 )
					if( bearPower <= 0.539942 )
						if( bullPower <= 1.393 )
							if( bbp <= 1.69196 )
								if( bullPower <= 1.1195 )
									ret := 0.400000
								if( bullPower > 1.1195 )
									ret := 0.777778 // buy
							if( bbp > 1.69196 )
								if( bullPower <= 1.2814 )
									ret := -0.375000
								if( bullPower > 1.2814 )
									ret := 0.350000
						if( bullPower > 1.393 )
							if( VIM <= 0.961848 )
								if( bullPower <= 2.18616 )
									ret := -0.770833 // sell
								if( bullPower > 2.18616 )
									ret := 0.400000
							if( VIM > 0.961848 )
								if( VIM <= 1.19703 )
									ret := 0.250000
								if( VIM > 1.19703 )
									ret := 0.750000 // buy
					if( bearPower > 0.539942 )
						if( VIP <= 1.07161 )
							if( bullPower <= 1.2626 )
								if( bbm <= 0.588294 )
									ret := -0.636364
								if( bbm > 0.588294 )
									ret := 1.000000 // buy
							if( bullPower > 1.2626 )
								if( VIM <= 0.94536 )
									ret := 0.100000
								if( VIM > 0.94536 )
									ret := 0.723404 // buy
						if( VIP > 1.07161 )
							if( bbp <= 2.94182 )
								if( bullPower <= 1.93233 )
									ret := 0.235616
								if( bullPower > 1.93233 )
									ret := -0.616667
							if( bbp > 2.94182 )
								if( VIM <= 0.901818 )
									ret := 0.494024
								if( VIM > 0.901818 )
									ret := 0.079646
				if( VIP_VIM > 0.429885 )
					if( VIP_VIM <= 1.14131 )
						if( bbm <= 4.00465 )
							if( bbm <= 1.35877 )
								if( VIP <= 1.37698 )
									ret := -0.111650
								if( VIP > 1.37698 )
									ret := 0.142029
							if( bbm > 1.35877 )
								if( bearPower <= 0.620931 )
									ret := 0.565217
								if( bearPower > 0.620931 )
									ret := -0.367742
						if( bbm > 4.00465 )
							if( bbm <= 6.39095 )
								if( VIP <= 1.36823 )
									ret := 0.935484 // buy
								if( VIP > 1.36823 )
									ret := 0.250000
							if( bbm > 6.39095 )
								ret := -1.000000 // sell
					if( VIP_VIM > 1.14131 )
						if( VIP_VIM <= 1.29348 )
							if( VIP <= 1.63363 )
								ret := 0.750000 // buy
							if( VIP > 1.63363 )
								ret := 1.000000 // buy
						if( VIP_VIM > 1.29348 )
							if( VIP <= 2.11676 )
								ret := -0.500000
							if( VIP > 2.11676 )
								if( bbm <= 0.713219 )
									ret := 0.750000 // buy
								if( bbm > 0.713219 )
									ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_CRWD_1Min_1159d536(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


