//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: DOTUSDT_30Min_2BV0_5856b3ee Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2BV0_5856b3ee", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_5856b3ee(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bbp <= -0.845269 )
		if( bullPower <= -1.36738 )
			if( VIM <= 1.30154 )
				if( VIP <= 0.730459 )
					if( bullPower <= -2.07632 )
						if( bbp <= -7.7615 )
							ret := 0.857143 // buy
						if( bbp > -7.7615 )
							ret := 1.000000 // buy
					if( bullPower > -2.07632 )
						if( bullPower <= -1.83126 )
							ret := 0.333333
						if( bullPower > -1.83126 )
							if( bearPower <= -2.9912 )
								ret := 1.000000 // buy
							if( bearPower > -2.9912 )
								ret := 0.333333
				if( VIP > 0.730459 )
					ret := 1.000000 // buy
			if( VIM > 1.30154 )
				ret := 0.111111
		if( bullPower > -1.36738 )
			if( bullPower <= 0.626052 )
				if( VIP_VIM <= -0.623137 )
					if( bearPower <= -0.855205 )
						if( VIP <= 0.453521 )
							ret := 1.000000 // buy
						if( VIP > 0.453521 )
							if( bearPower <= -1.40552 )
								if( VIM <= 1.27425 )
									ret := -0.800000 // sell
								if( VIM > 1.27425 )
									ret := 0.180556
							if( bearPower > -1.40552 )
								if( bullPower <= -0.447618 )
									ret := -0.703448 // sell
								if( bullPower > -0.447618 )
									ret := -0.160000
					if( bearPower > -0.855205 )
						if( VIP_VIM <= -0.637717 )
							if( VIP <= 0.665078 )
								if( VIM <= 1.34546 )
									ret := 0.860000 // buy
								if( VIM > 1.34546 )
									ret := 0.567568
							if( VIP > 0.665078 )
								ret := -0.125000
						if( VIP_VIM > -0.637717 )
							if( bbp <= -1.08533 )
								ret := -0.071429
							if( bbp > -1.08533 )
								ret := -1.000000 // sell
				if( VIP_VIM > -0.623137 )
					if( VIM <= 1.20958 )
						if( VIP <= 0.864285 )
							if( bullPower <= 0.301749 )
								if( bbm <= 0.40084 )
									ret := -0.039106
								if( bbm > 0.40084 )
									ret := 0.303991
							if( bullPower > 0.301749 )
								ret := -1.000000 // sell
						if( VIP > 0.864285 )
							if( bbm <= 1.02421 )
								if( bearPower <= -1.37416 )
									ret := 0.883721 // buy
								if( bearPower > -1.37416 )
									ret := 0.159162
							if( bbm > 1.02421 )
								if( VIM <= 0.959227 )
									ret := 0.800000 // buy
								if( VIM > 0.959227 )
									ret := -0.216814
					if( VIM > 1.20958 )
						if( bbp <= -0.921312 )
							if( bullPower <= -0.398951 )
								if( VIM <= 1.2874 )
									ret := 0.103215
								if( VIM > 1.2874 )
									ret := 0.628205
							if( bullPower > -0.398951 )
								if( VIP <= 0.760236 )
									ret := 0.041401
								if( VIP > 0.760236 )
									ret := -0.617021
						if( bbp > -0.921312 )
							if( bullPower <= -0.244484 )
								if( bbm <= 0.231741 )
									ret := 0.000000
								if( bbm > 0.231741 )
									ret := 0.743243 // buy
							if( bullPower > -0.244484 )
								if( bbm <= 0.535154 )
									ret := -0.416667
								if( bbm > 0.535154 )
									ret := 0.909091 // buy
			if( bullPower > 0.626052 )
				if( VIM <= 1.05394 )
					ret := 1.000000 // buy
				if( VIM > 1.05394 )
					ret := 0.846154 // buy
	if( bbp > -0.845269 )
		if( bbp <= 0.314874 )
			if( bearPower <= -0.101797 )
				if( VIP_VIM <= -0.017775 )
					if( bbm <= 0.141012 )
						if( bbp <= -0.089378 )
							if( bbp <= -0.505425 )
								if( bbm <= 0.093 )
									ret := 0.086957
								if( bbm > 0.093 )
									ret := -0.337748
							if( bbp > -0.505425 )
								if( VIM <= 1.21894 )
									ret := 0.035806
								if( VIM > 1.21894 )
									ret := 0.137255
						if( bbp > -0.089378 )
							if( bbm <= 0.130736 )
								if( bearPower <= -0.104109 )
									ret := 0.933333 // buy
								if( bearPower > -0.104109 )
									ret := 0.645161
							if( bbm > 0.130736 )
								if( bearPower <= -0.110554 )
									ret := 0.692308
								if( bearPower > -0.110554 )
									ret := 0.177778
					if( bbm > 0.141012 )
						if( bbp <= -0.470754 )
							if( VIM <= 1.19431 )
								if( bbp <= -0.515706 )
									ret := 0.075895
								if( bbp > -0.515706 )
									ret := 0.353982
							if( VIM > 1.19431 )
								if( bbm <= 0.161739 )
									ret := -0.438202
								if( bbm > 0.161739 )
									ret := -0.075855
						if( bbp > -0.470754 )
							if( bearPower <= -0.129217 )
								if( bearPower <= -0.395537 )
									ret := -0.126799
								if( bearPower > -0.395537 )
									ret := -0.006705
							if( bearPower > -0.129217 )
								if( bbm <= 0.231676 )
									ret := -0.082687
								if( bbm > 0.231676 )
									ret := -0.461538
				if( VIP_VIM > -0.017775 )
					if( bbm <= 1.12934 )
						if( bullPower <= 0.395555 )
							if( bullPower <= -0.213682 )
								ret := -0.875000 // sell
							if( bullPower > -0.213682 )
								if( VIM <= 0.99329 )
									ret := 0.067399
								if( VIM > 0.99329 )
									ret := 0.254197
						if( bullPower > 0.395555 )
							if( bearPower <= -0.500568 )
								if( bbp <= -0.11072 )
									ret := 0.785714 // buy
								if( bbp > -0.11072 )
									ret := -0.500000
							if( bearPower > -0.500568 )
								if( bbm <= 0.577775 )
									ret := 0.111111
								if( bbm > 0.577775 )
									ret := 0.546358
					if( bbm > 1.12934 )
						if( VIM <= 0.951375 )
							if( bbm <= 1.36991 )
								if( bullPower <= 0.408942 )
									ret := 0.166667
								if( bullPower > 0.408942 )
									ret := -0.849057 // sell
							if( bbm > 1.36991 )
								if( VIP_VIM <= 0.095824 )
									ret := 0.250000
								if( VIP_VIM > 0.095824 )
									ret := 0.696970
						if( VIM > 0.951375 )
							if( bullPower <= 0.369165 )
								ret := -0.600000
							if( bullPower > 0.369165 )
								ret := -0.933333 // sell
			if( bearPower > -0.101797 )
				if( VIP <= 1.2568 )
					if( VIP_VIM <= -0.083239 )
						if( VIP_VIM <= -0.152718 )
							if( VIM <= 1.26972 )
								if( bbp <= -0.151362 )
									ret := -0.545455
								if( bbp > -0.151362 )
									ret := 0.005833
							if( VIM > 1.26972 )
								if( VIM <= 1.2875 )
									ret := -0.389068
								if( VIM > 1.2875 )
									ret := -0.103797
						if( VIP_VIM > -0.152718 )
							if( VIM <= 1.11401 )
								if( bullPower <= 0.271796 )
									ret := -0.112500
								if( bullPower > 0.271796 )
									ret := -0.735632 // sell
							if( VIM > 1.11401 )
								if( VIP <= 0.981111 )
									ret := -0.260870
								if( VIP > 0.981111 )
									ret := 0.382812
					if( VIP_VIM > -0.083239 )
						if( bbp <= -0.108072 )
							if( bbp <= -0.11651 )
								if( bbm <= 0.051247 )
									ret := -0.538462
								if( bbm > 0.051247 )
									ret := -0.950000 // sell
							if( bbp > -0.11651 )
								if( bbp <= -0.110864 )
									ret := -0.241379
								if( bbp > -0.110864 )
									ret := -0.916667 // sell
						if( bbp > -0.108072 )
							if( VIP_VIM <= -0.041238 )
								if( bullPower <= 0.234258 )
									ret := 0.103459
								if( bullPower > 0.234258 )
									ret := -0.634409
							if( VIP_VIM > -0.041238 )
								if( bullPower <= 0.259488 )
									ret := -0.020195
								if( bullPower > 0.259488 )
									ret := 0.214984
				if( VIP > 1.2568 )
					if( bullPower <= 0.167781 )
						if( VIP <= 1.31201 )
							if( bullPower <= 0.032456 )
								if( bullPower <= 0.028955 )
									ret := 0.007407
								if( bullPower > 0.028955 )
									ret := -0.476190
							if( bullPower > 0.032456 )
								if( VIM <= 0.820427 )
									ret := 0.128275
								if( VIM > 0.820427 )
									ret := 0.700000 // buy
						if( VIP > 1.31201 )
							if( VIP_VIM <= 0.990192 )
								if( bullPower <= 0.079935 )
									ret := 0.084848
								if( bullPower > 0.079935 )
									ret := -0.239766
							if( VIP_VIM > 0.990192 )
								ret := 0.666667
					if( bullPower > 0.167781 )
						if( VIM <= 0.679159 )
							if( bbm <= 0.056377 )
								ret := 0.333333
							if( bbm > 0.056377 )
								if( VIP_VIM <= 0.787989 )
									ret := 0.890411 // buy
								if( VIP_VIM > 0.787989 )
									ret := 0.000000
						if( VIM > 0.679159 )
							if( VIP <= 1.26271 )
								ret := 0.666667
							if( VIP > 1.26271 )
								if( bbm <= 0.185 )
									ret := 0.048780
								if( bbm > 0.185 )
									ret := 0.684211
		if( bbp > 0.314874 )
			if( bbp <= 0.34344 )
				if( VIM <= 0.947835 )
					if( bearPower <= 0.026331 )
						if( VIP_VIM <= 0.133177 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.133177 )
							if( VIP <= 1.14542 )
								if( VIM <= 0.900765 )
									ret := -0.415385
								if( VIM > 0.900765 )
									ret := 0.428571
							if( VIP > 1.14542 )
								if( bbp <= 0.320607 )
									ret := 0.800000 // buy
								if( bbp > 0.320607 )
									ret := 0.250000
					if( bearPower > 0.026331 )
						if( VIP_VIM <= 0.53134 )
							if( bullPower <= 0.213706 )
								if( VIM <= 0.83604 )
									ret := -0.920000 // sell
								if( VIM > 0.83604 )
									ret := -0.687500
							if( bullPower > 0.213706 )
								if( bullPower <= 0.227567 )
									ret := -0.119048
								if( bullPower > 0.227567 )
									ret := -0.590717
						if( VIP_VIM > 0.53134 )
							if( VIM <= 0.582038 )
								if( VIM <= 0.552841 )
									ret := -1.000000 // sell
								if( VIM > 0.552841 )
									ret := -0.500000
							if( VIM > 0.582038 )
								if( bullPower <= 0.202322 )
									ret := 0.375000
								if( bullPower > 0.202322 )
									ret := -0.133333
				if( VIM > 0.947835 )
					if( bearPower <= 0.014385 )
						if( bearPower <= -0.044132 )
							if( bullPower <= 0.426427 )
								ret := 0.736842 // buy
							if( bullPower > 0.426427 )
								if( VIM <= 0.979481 )
									ret := 0.611111
								if( VIM > 0.979481 )
									ret := -0.480000
						if( bearPower > -0.044132 )
							if( VIP <= 1.01877 )
								if( bearPower <= -0.021124 )
									ret := -0.809524 // sell
								if( bearPower > -0.021124 )
									ret := -1.000000 // sell
							if( VIP > 1.01877 )
								ret := -0.600000
					if( bearPower > 0.014385 )
						if( VIP <= 0.968588 )
							ret := -0.666667
						if( VIP > 0.968588 )
							if( bbm <= 0.216729 )
								if( bearPower <= 0.074917 )
									ret := -0.272727
								if( bearPower > 0.074917 )
									ret := 0.640000
							if( bbm > 0.216729 )
								if( bearPower <= 0.021713 )
									ret := 0.333333
								if( bearPower > 0.021713 )
									ret := 0.800000 // buy
			if( bbp > 0.34344 )
				if( VIM <= 0.747547 )
					if( VIP_VIM <= 0.566963 )
						if( bearPower <= 0.995623 )
							if( bullPower <= 0.739797 )
								if( VIP_VIM <= 0.498431 )
									ret := 0.382166
								if( VIP_VIM > 0.498431 )
									ret := -0.018824
							if( bullPower > 0.739797 )
								if( bbm <= 0.455285 )
									ret := 0.647887
								if( bbm > 0.455285 )
									ret := 0.274908
						if( bearPower > 0.995623 )
							if( VIP_VIM <= 0.545387 )
								if( bearPower <= 1.09527 )
									ret := -1.000000 // sell
								if( bearPower > 1.09527 )
									ret := -0.818182 // sell
							if( VIP_VIM > 0.545387 )
								ret := 0.200000
					if( VIP_VIM > 0.566963 )
						if( bearPower <= 1.44079 )
							if( VIM <= 0.689096 )
								if( VIP <= 1.26627 )
									ret := 0.541667
								if( VIP > 1.26627 )
									ret := -0.083871
							if( VIM > 0.689096 )
								if( bearPower <= 0.120885 )
									ret := 0.529412
								if( bearPower > 0.120885 )
									ret := -0.370370
						if( bearPower > 1.44079 )
							if( bullPower <= 3.52354 )
								if( VIM <= 0.620367 )
									ret := 1.000000 // buy
								if( VIM > 0.620367 )
									ret := 0.636364
							if( bullPower > 3.52354 )
								if( bearPower <= 2.15824 )
									ret := 0.636364
								if( bearPower > 2.15824 )
									ret := -0.111111
				if( VIM > 0.747547 )
					if( VIM <= 1.01478 )
						if( bbm <= 0.116759 )
							if( bbp <= 0.382232 )
								if( VIM <= 0.834476 )
									ret := -0.870370 // sell
								if( VIM > 0.834476 )
									ret := -0.466667
							if( bbp > 0.382232 )
								if( bbp <= 0.565704 )
									ret := -0.312500
								if( bbp > 0.565704 )
									ret := -0.777778 // sell
						if( bbm > 0.116759 )
							if( VIP <= 1.25886 )
								if( bbp <= 2.01203 )
									ret := -0.062375
								if( bbp > 2.01203 )
									ret := -0.537736
							if( VIP > 1.25886 )
								if( bbm <= 0.409953 )
									ret := -0.328205
								if( bbm > 0.409953 )
									ret := -0.807229 // sell
					if( VIM > 1.01478 )
						if( bbm <= 0.688774 )
							if( bbp <= 0.362473 )
								if( bullPower <= 0.433906 )
									ret := 0.450000
								if( bullPower > 0.433906 )
									ret := 0.812500 // buy
							if( bbp > 0.362473 )
								if( bbm <= 0.575 )
									ret := 0.034091
								if( bbm > 0.575 )
									ret := -0.546875
						if( bbm > 0.688774 )
							if( VIP_VIM <= -0.195245 )
								ret := -0.333333
							if( VIP_VIM > -0.195245 )
								if( VIP <= 0.917041 )
									ret := 0.878049 // buy
								if( VIP > 0.917041 )
									ret := 0.377778
	
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
float op_operation = decision_tree_0_DOTUSDT_30Min_5856b3ee(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


