//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: DOGEUSDT_30Min_2BB0_6a594ee3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2BB0_6a594ee3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_6a594ee3(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.004801 )
		if( Lower_Band <= 0.243144 )
			if( bearPower <= -0.004475 )
				if( basis <= 0.203104 )
					if( basis <= 0.194824 )
						if( bbm <= 0.006272 )
							if( basis <= 0.053343 )
								if( Upper_Band <= 0.058181 )
									ret := 0.625000
								if( Upper_Band > 0.058181 )
									ret := -1.000000 // sell
							if( basis > 0.053343 )
								if( Lower_Band <= 0.074262 )
									ret := 0.782609 // buy
								if( Lower_Band > 0.074262 )
									ret := 0.297410
						if( bbm > 0.006272 )
							if( Upper_Band <= 0.190823 )
								if( bearPower <= -0.013548 )
									ret := 0.920000 // buy
								if( bearPower > -0.013548 )
									ret := 0.534161
							if( Upper_Band > 0.190823 )
								if( basis <= 0.187288 )
									ret := -0.578947
								if( basis > 0.187288 )
									ret := 0.809524 // buy
					if( basis > 0.194824 )
						if( bullPower <= -0.001374 )
							if( bullPower <= -0.003452 )
								if( basis <= 0.197662 )
									ret := -0.500000
								if( basis > 0.197662 )
									ret := 0.000000
							if( bullPower > -0.003452 )
								if( bbp <= -0.007591 )
									ret := -1.000000 // sell
								if( bbp > -0.007591 )
									ret := -0.555556
						if( bullPower > -0.001374 )
							if( Lower_Band <= 0.195157 )
								if( basis <= 0.198141 )
									ret := -0.071429
								if( basis > 0.198141 )
									ret := 1.000000 // buy
							if( Lower_Band > 0.195157 )
								ret := -0.750000 // sell
				if( basis > 0.203104 )
					if( basis <= 0.214131 )
						if( bbm <= 0.00302 )
							if( bbp <= -0.006611 )
								if( Lower_Band <= 0.196698 )
									ret := 1.000000 // buy
								if( Lower_Band > 0.196698 )
									ret := 0.576923
							if( bbp > -0.006611 )
								ret := -0.600000
						if( bbm > 0.00302 )
							if( basis <= 0.213352 )
								if( bbm <= 0.00641 )
									ret := 0.908163 // buy
								if( bbm > 0.00641 )
									ret := 0.615385
							if( basis > 0.213352 )
								if( bbm <= 0.004454 )
									ret := -0.250000
								if( bbm > 0.004454 )
									ret := 0.875000 // buy
					if( basis > 0.214131 )
						if( Upper_Band <= 0.239986 )
							if( Lower_Band <= 0.203232 )
								if( Upper_Band <= 0.230685 )
									ret := -0.888889 // sell
								if( Upper_Band > 0.230685 )
									ret := -0.250000
							if( Lower_Band > 0.203232 )
								if( bullPower <= -0.001565 )
									ret := 0.500000
								if( bullPower > -0.001565 )
									ret := 0.112903
						if( Upper_Band > 0.239986 )
							if( bbp <= -0.032043 )
								if( bbm <= 0.018125 )
									ret := -0.727273 // sell
								if( bbm > 0.018125 )
									ret := 0.416667
							if( bbp > -0.032043 )
								if( bullPower <= -0.001548 )
									ret := 0.652850
								if( bullPower > -0.001548 )
									ret := 0.402062
			if( bearPower > -0.004475 )
				if( Lower_Band <= 0.226338 )
					if( Upper_Band <= 0.237354 )
						if( Lower_Band <= 0.052846 )
							if( bbp <= -0.005062 )
								if( Upper_Band <= 0.047028 )
									ret := 0.500000
								if( Upper_Band > 0.047028 )
									ret := 1.000000 // buy
							if( bbp > -0.005062 )
								ret := -0.500000
						if( Lower_Band > 0.052846 )
							if( basis <= 0.071088 )
								if( bullPower <= -0.001197 )
									ret := -0.516129
								if( bullPower > -0.001197 )
									ret := 0.666667
							if( basis > 0.071088 )
								if( bearPower <= -0.004464 )
									ret := -0.777778 // sell
								if( bearPower > -0.004464 )
									ret := 0.163472
					if( Upper_Band > 0.237354 )
						if( bbp <= -0.006096 )
							ret := -0.750000 // sell
						if( bbp > -0.006096 )
							ret := -1.000000 // sell
				if( Lower_Band > 0.226338 )
					if( basis <= 0.248872 )
						if( bearPower <= -0.004215 )
							if( Upper_Band <= 0.245603 )
								ret := 0.250000
							if( Upper_Band > 0.245603 )
								if( basis <= 0.244911 )
									ret := -0.250000
								if( basis > 0.244911 )
									ret := 0.250000
						if( bearPower > -0.004215 )
							if( basis <= 0.238977 )
								if( basis <= 0.232639 )
									ret := 1.000000 // buy
								if( basis > 0.232639 )
									ret := 0.062500
							if( basis > 0.238977 )
								if( bullPower <= -0.001664 )
									ret := 0.466667
								if( bullPower > -0.001664 )
									ret := 0.962963 // buy
					if( basis > 0.248872 )
						ret := -0.600000
		if( Lower_Band > 0.243144 )
			if( bbm <= 0.039191 )
				if( basis <= 0.251404 )
					if( bearPower <= -0.005188 )
						ret := 0.000000
					if( bearPower > -0.005188 )
						if( bullPower <= -0.001283 )
							if( basis <= 0.248268 )
								ret := -0.250000
							if( basis > 0.248268 )
								if( bullPower <= -0.001985 )
									ret := -0.500000
								if( bullPower > -0.001985 )
									ret := -1.000000 // sell
						if( bullPower > -0.001283 )
							ret := -1.000000 // sell
				if( basis > 0.251404 )
					if( Lower_Band <= 0.331083 )
						if( bullPower <= 0.005624 )
							if( Upper_Band <= 0.292042 )
								if( Lower_Band <= 0.246861 )
									ret := 0.574468
								if( Lower_Band > 0.246861 )
									ret := -0.149560
							if( Upper_Band > 0.292042 )
								if( Upper_Band <= 0.303571 )
									ret := 0.654930
								if( Upper_Band > 0.303571 )
									ret := 0.218585
						if( bullPower > 0.005624 )
							if( basis <= 0.327199 )
								ret := -0.600000
							if( basis > 0.327199 )
								if( bbp <= -0.013218 )
									ret := -0.750000 // sell
								if( bbp > -0.013218 )
									ret := -1.000000 // sell
					if( Lower_Band > 0.331083 )
						if( bbm <= 0.00481 )
							if( Upper_Band <= 0.376482 )
								if( Upper_Band <= 0.35394 )
									ret := -0.866667 // sell
								if( Upper_Band > 0.35394 )
									ret := -0.222222
							if( Upper_Band > 0.376482 )
								if( bbp <= -0.012823 )
									ret := -0.750000 // sell
								if( bbp > -0.012823 )
									ret := -1.000000 // sell
						if( bbm > 0.00481 )
							if( Upper_Band <= 0.667649 )
								if( Lower_Band <= 0.337132 )
									ret := -0.410714
								if( Lower_Band > 0.337132 )
									ret := 0.107975
							if( Upper_Band > 0.667649 )
								if( Upper_Band <= 0.731952 )
									ret := -0.472222
								if( Upper_Band > 0.731952 )
									ret := 0.750000 // buy
			if( bbm > 0.039191 )
				if( bullPower <= -0.018426 )
					ret := 1.000000 // buy
				if( bullPower > -0.018426 )
					if( bbp <= -0.078206 )
						ret := -0.200000
					if( bbp > -0.078206 )
						if( bbm <= 0.04522 )
							if( bullPower <= -0.014299 )
								ret := 1.000000 // buy
							if( bullPower > -0.014299 )
								if( basis <= 0.385266 )
									ret := 1.000000 // buy
								if( basis > 0.385266 )
									ret := -0.100000
						if( bbm > 0.04522 )
							ret := 1.000000 // buy
	if( bbp > -0.004801 )
		if( Lower_Band <= 0.077925 )
			if( bbp <= -0.001246 )
				if( Upper_Band <= 0.096038 )
					if( bbm <= 0.004973 )
						if( Upper_Band <= 0.08308 )
							if( Upper_Band <= 0.081487 )
								if( bearPower <= -0.003568 )
									ret := 1.000000 // buy
								if( bearPower > -0.003568 )
									ret := 0.180124
							if( Upper_Band > 0.081487 )
								if( bearPower <= -0.002578 )
									ret := 0.275862
								if( bearPower > -0.002578 )
									ret := -0.542169
						if( Upper_Band > 0.08308 )
							if( Lower_Band <= 0.076751 )
								if( bullPower <= -0.000738 )
									ret := 0.500000
								if( bullPower > -0.000738 )
									ret := 0.784615 // buy
							if( Lower_Band > 0.076751 )
								if( bbp <= -0.001811 )
									ret := -0.375000
								if( bbp > -0.001811 )
									ret := 0.400000
					if( bbm > 0.004973 )
						if( bbp <= -0.003105 )
							if( bullPower <= 0.000918 )
								ret := -1.000000 // sell
							if( bullPower > 0.000918 )
								ret := 0.250000
						if( bbp > -0.003105 )
							ret := -1.000000 // sell
				if( Upper_Band > 0.096038 )
					ret := -1.000000 // sell
			if( bbp > -0.001246 )
				if( Upper_Band <= 0.102928 )
					if( bearPower <= 0.002706 )
						if( basis <= 0.054757 )
							if( BBPower_Color <= 0.5 )
								if( bearPower <= -0.001369 )
									ret := 0.862069 // buy
								if( bearPower > -0.001369 )
									ret := 0.158414
							if( BBPower_Color > 0.5 )
								if( bullPower <= 0.001178 )
									ret := 0.022204
								if( bullPower > 0.001178 )
									ret := 0.222222
						if( basis > 0.054757 )
							if( bullPower <= 4.9e-05 )
								if( bbm <= 0.000405 )
									ret := -0.051506
								if( bbm > 0.000405 )
									ret := 0.067235
							if( bullPower > 4.9e-05 )
								if( bbm <= 0.000942 )
									ret := 0.093719
								if( bbm > 0.000942 )
									ret := -0.038965
					if( bearPower > 0.002706 )
						if( Upper_Band <= 0.05148 )
							if( bbm <= 0.00503 )
								ret := -0.800000 // sell
							if( bbm > 0.00503 )
								ret := 1.000000 // buy
						if( Upper_Band > 0.05148 )
							if( bullPower <= 0.005279 )
								if( bullPower <= 0.004785 )
									ret := 0.250000
								if( bullPower > 0.004785 )
									ret := 0.500000
							if( bullPower > 0.005279 )
								if( Lower_Band <= 0.075513 )
									ret := -0.875000 // sell
								if( Lower_Band > 0.075513 )
									ret := -0.307692
				if( Upper_Band > 0.102928 )
					if( bullPower <= 0.01206 )
						if( bbm <= 0.002246 )
							ret := 0.750000 // buy
						if( bbm > 0.002246 )
							if( bearPower <= -0.000839 )
								ret := 0.750000 // buy
							if( bearPower > -0.000839 )
								ret := 1.000000 // buy
					if( bullPower > 0.01206 )
						ret := 0.500000
		if( Lower_Band > 0.077925 )
			if( bearPower <= -0.002331 )
				if( Upper_Band <= 0.391339 )
					if( bullPower <= -0.00029 )
						if( Lower_Band <= 0.142791 )
							if( Lower_Band <= 0.080378 )
								if( basis <= 0.081081 )
									ret := -0.500000
								if( basis > 0.081081 )
									ret := 0.732143 // buy
							if( Lower_Band > 0.080378 )
								if( Upper_Band <= 0.091971 )
									ret := -0.252174
								if( Upper_Band > 0.091971 )
									ret := 0.212422
						if( Lower_Band > 0.142791 )
							if( bearPower <= -0.004198 )
								if( Lower_Band <= 0.166438 )
									ret := -1.000000 // sell
								if( Lower_Band > 0.166438 )
									ret := -0.545455
							if( bearPower > -0.004198 )
								if( Upper_Band <= 0.15944 )
									ret := -0.363636
								if( Upper_Band > 0.15944 )
									ret := -0.009236
					if( bullPower > -0.00029 )
						if( bullPower <= 0.011453 )
							if( bbp <= 0.004784 )
								if( BBPower_Color <= 0.5 )
									ret := 0.191551
								if( BBPower_Color > 0.5 )
									ret := -0.080808
							if( bbp > 0.004784 )
								if( bearPower <= -0.004362 )
									ret := 0.500000
								if( bearPower > -0.004362 )
									ret := 0.937500 // buy
						if( bullPower > 0.011453 )
							if( Upper_Band <= 0.364325 )
								if( basis <= 0.240109 )
									ret := 0.200000
								if( basis > 0.240109 )
									ret := -0.717949 // sell
							if( Upper_Band > 0.364325 )
								ret := 1.000000 // buy
				if( Upper_Band > 0.391339 )
					if( bbm <= 0.008565 )
						if( Upper_Band <= 0.418512 )
							if( Upper_Band <= 0.39556 )
								ret := -0.428571
							if( Upper_Band > 0.39556 )
								if( bearPower <= -0.003524 )
									ret := -1.000000 // sell
								if( bearPower > -0.003524 )
									ret := -0.750000 // sell
						if( Upper_Band > 0.418512 )
							if( Upper_Band <= 0.513024 )
								if( basis <= 0.419775 )
									ret := 0.750000 // buy
								if( basis > 0.419775 )
									ret := -0.238095
							if( Upper_Band > 0.513024 )
								if( bearPower <= -0.004283 )
									ret := -1.000000 // sell
								if( bearPower > -0.004283 )
									ret := -0.750000 // sell
					if( bbm > 0.008565 )
						if( Lower_Band <= 0.587471 )
							if( bbp <= 0.00667 )
								if( basis <= 0.415074 )
									ret := -0.500000
								if( basis > 0.415074 )
									ret := 0.009901
							if( bbp > 0.00667 )
								if( bbp <= 0.018439 )
									ret := 0.626667
								if( bbp > 0.018439 )
									ret := -0.529412
						if( Lower_Band > 0.587471 )
							if( basis <= 0.697286 )
								if( Lower_Band <= 0.608701 )
									ret := -0.833333 // sell
								if( Lower_Band > 0.608701 )
									ret := -1.000000 // sell
							if( basis > 0.697286 )
								if( Lower_Band <= 0.678637 )
									ret := 0.500000
								if( Lower_Band > 0.678637 )
									ret := -0.500000
			if( bearPower > -0.002331 )
				if( Upper_Band <= 0.171071 )
					if( bbm <= 0.001196 )
						if( bearPower <= -0.000139 )
							if( basis <= 0.08061 )
								if( Upper_Band <= 0.079537 )
									ret := 0.061644
								if( Upper_Band > 0.079537 )
									ret := -0.278689
							if( basis > 0.08061 )
								if( Lower_Band <= 0.124623 )
									ret := 0.007582
								if( Lower_Band > 0.124623 )
									ret := -0.085397
						if( bearPower > -0.000139 )
							if( bullPower <= 0.002291 )
								if( Lower_Band <= 0.112758 )
									ret := 0.024221
								if( Lower_Band > 0.112758 )
									ret := 0.097433
							if( bullPower > 0.002291 )
								if( Lower_Band <= 0.109185 )
									ret := -0.542373
								if( Lower_Band > 0.109185 )
									ret := 0.040000
					if( bbm > 0.001196 )
						if( basis <= 0.166159 )
							if( Upper_Band <= 0.167273 )
								if( Upper_Band <= 0.093894 )
									ret := -0.068468
								if( Upper_Band > 0.093894 )
									ret := 0.082442
							if( Upper_Band > 0.167273 )
								if( bearPower <= -1.6e-05 )
									ret := 0.046729
								if( bearPower > -1.6e-05 )
									ret := -0.614286
						if( basis > 0.166159 )
							if( bearPower <= -0.001702 )
								if( Lower_Band <= 0.163374 )
									ret := 0.666667
								if( Lower_Band > 0.163374 )
									ret := 1.000000 // buy
							if( bearPower > -0.001702 )
								if( basis <= 0.166615 )
									ret := 0.604167
								if( basis > 0.166615 )
									ret := 0.252874
				if( Upper_Band > 0.171071 )
					if( Upper_Band <= 0.73269 )
						if( Lower_Band <= 0.51676 )
							if( Upper_Band <= 0.573568 )
								if( Lower_Band <= 0.440525 )
									ret := -0.044396
								if( Lower_Band > 0.440525 )
									ret := -0.382353
							if( Upper_Band > 0.573568 )
								if( bullPower <= 0.054869 )
									ret := -0.928571 // sell
								if( bullPower > 0.054869 )
									ret := 0.000000
						if( Lower_Band > 0.51676 )
							if( Upper_Band <= 0.645736 )
								if( bearPower <= -0.001415 )
									ret := -0.333333
								if( bearPower > -0.001415 )
									ret := 0.779661 // buy
							if( Upper_Band > 0.645736 )
								if( Upper_Band <= 0.70243 )
									ret := -0.566667
								if( Upper_Band > 0.70243 )
									ret := 0.666667
					if( Upper_Band > 0.73269 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

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
float op_operation = decision_tree_0_DOGEUSDT_30Min_6a594ee3(basis, Upper_Band, Lower_Band, bearPower, bbm, bbp, bullPower, BBPower_Color)

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


