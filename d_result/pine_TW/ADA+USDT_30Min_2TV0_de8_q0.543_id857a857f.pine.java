//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ADAUSDT_30Min_2TV0_857a857f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2TV0_857a857f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_857a857f(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema2 <= 0.355978 )
		if( VIM <= 1.30989 )
			if( ema1 <= 0.093014 )
				if( VIM <= 0.686333 )
					ret := -0.687500
				if( VIM > 0.686333 )
					if( ema12 <= 0.000387 )
						if( VIP_VIM <= 0.173891 )
							if( ema2 <= 0.090947 )
								if( ema13 <= 0.000175 )
									ret := 0.028455
								if( ema13 > 0.000175 )
									ret := 0.622222
							if( ema2 > 0.090947 )
								if( tema <= 0.088681 )
									ret := 0.933333 // buy
								if( tema > 0.088681 )
									ret := 0.305747
						if( VIP_VIM > 0.173891 )
							if( VIP <= 1.0861 )
								ret := -1.000000 // sell
							if( VIP > 1.0861 )
								if( VIM <= 0.886126 )
									ret := -0.311111
								if( VIM > 0.886126 )
									ret := 0.270270
					if( ema12 > 0.000387 )
						if( ema2 <= 0.090636 )
							if( ema13 <= 0.001421 )
								if( ema13 <= 0.000773 )
									ret := 0.333333
								if( ema13 > 0.000773 )
									ret := 0.964286 // buy
							if( ema13 > 0.001421 )
								ret := 0.375000
						if( ema2 > 0.090636 )
							if( ema12 <= 0.000557 )
								if( ema2 <= 0.092257 )
									ret := 0.750000 // buy
								if( ema2 > 0.092257 )
									ret := 0.272727
							if( ema12 > 0.000557 )
								if( VIM <= 0.821373 )
									ret := -0.727273 // sell
								if( VIM > 0.821373 )
									ret := -0.058824
			if( ema1 > 0.093014 )
				if( VIP <= 0.647403 )
					if( ema12 <= -0.00161 )
						if( tema <= 0.28766 )
							if( ema13 <= -0.003065 )
								ret := 1.000000 // buy
							if( ema13 > -0.003065 )
								ret := 0.800000 // buy
						if( tema > 0.28766 )
							if( ema1 <= 0.337391 )
								ret := 0.000000
							if( ema1 > 0.337391 )
								if( tema <= 0.338936 )
									ret := 0.818182 // buy
								if( tema > 0.338936 )
									ret := 1.000000 // buy
					if( ema12 > -0.00161 )
						ret := -0.250000
				if( VIP > 0.647403 )
					if( tema <= 0.102966 )
						if( VIP_VIM <= -0.162267 )
							if( VIP_VIM <= -0.198629 )
								if( VIP_VIM <= -0.224104 )
									ret := -0.279707
								if( VIP_VIM > -0.224104 )
									ret := 0.245902
							if( VIP_VIM > -0.198629 )
								if( ema12 <= -0.000236 )
									ret := -0.850000 // sell
								if( ema12 > -0.000236 )
									ret := -0.304348
						if( VIP_VIM > -0.162267 )
							if( ema13 <= 0.000663 )
								if( ema12 <= -2.9e-05 )
									ret := -0.034230
								if( ema12 > -2.9e-05 )
									ret := 0.254153
							if( ema13 > 0.000663 )
								if( VIP_VIM <= 0.083752 )
									ret := 0.342105
								if( VIP_VIM > 0.083752 )
									ret := -0.185547
					if( tema > 0.102966 )
						if( ema3 <= 0.243883 )
							if( ema3 <= 0.186746 )
								if( VIP_VIM <= -0.268749 )
									ret := 0.265455
								if( VIP_VIM > -0.268749 )
									ret := 0.056912
							if( ema3 > 0.186746 )
								if( ema2 <= 0.213695 )
									ret := 0.837037 // buy
								if( ema2 > 0.213695 )
									ret := 0.222222
						if( ema3 > 0.243883 )
							if( ema12 <= -0.002891 )
								if( VIP_VIM <= -0.26036 )
									ret := 0.318519
								if( VIP_VIM > -0.26036 )
									ret := -0.345455
							if( ema12 > -0.002891 )
								if( ema13 <= -0.003713 )
									ret := -0.110672
								if( ema13 > -0.003713 )
									ret := 0.039882
		if( VIM > 1.30989 )
			if( ema2 <= 0.092326 )
				if( tema <= 0.081013 )
					ret := -0.708333 // sell
				if( tema > 0.081013 )
					ret := -1.000000 // sell
			if( ema2 > 0.092326 )
				if( VIP_VIM <= -0.704867 )
					if( ema12 <= -0.004743 )
						if( ema2 <= 0.314751 )
							ret := 0.125000
						if( ema2 > 0.314751 )
							if( ema2 <= 0.345771 )
								ret := 1.000000 // buy
							if( ema2 > 0.345771 )
								ret := 0.888889 // buy
					if( ema12 > -0.004743 )
						if( ema3 <= 0.208121 )
							if( VIP <= 0.598905 )
								ret := -0.222222
							if( VIP > 0.598905 )
								ret := 1.000000 // buy
						if( ema3 > 0.208121 )
							if( ema2 <= 0.309815 )
								if( ema1 <= 0.295088 )
									ret := -0.095238
								if( ema1 > 0.295088 )
									ret := -1.000000 // sell
							if( ema2 > 0.309815 )
								if( ema13 <= -0.007099 )
									ret := 0.090909
								if( ema13 > -0.007099 )
									ret := 0.000000
				if( VIP_VIM > -0.704867 )
					if( VIP_VIM <= -0.636231 )
						if( ema2 <= 0.269723 )
							if( tema <= 0.19499 )
								ret := -0.545455
							if( tema > 0.19499 )
								if( ema12 <= -0.001155 )
									ret := 0.076923
								if( ema12 > -0.001155 )
									ret := -0.230769
						if( ema2 > 0.269723 )
							if( ema12 <= -0.003719 )
								if( ema3 <= 0.344477 )
									ret := -1.000000 // sell
								if( ema3 > 0.344477 )
									ret := -0.900000 // sell
							if( ema12 > -0.003719 )
								if( VIP <= 0.688792 )
									ret := -0.590909
								if( VIP > 0.688792 )
									ret := -0.090909
					if( VIP_VIM > -0.636231 )
						if( ema2 <= 0.263881 )
							ret := 0.409091
						if( ema2 > 0.263881 )
							if( ema12 <= -0.003023 )
								ret := 0.307692
							if( ema12 > -0.003023 )
								ret := -0.055556
	if( ema2 > 0.355978 )
		if( VIP <= 0.889151 )
			if( ema1 <= 2.34615 )
				if( tema <= 2.22733 )
					if( ema13 <= -0.024797 )
						if( tema <= 1.21505 )
							if( ema3 <= 1.23658 )
								if( ema12 <= -0.025509 )
									ret := 0.630631
								if( ema12 > -0.025509 )
									ret := 0.118881
							if( ema3 > 1.23658 )
								if( VIP <= 0.774238 )
									ret := 0.991453 // buy
								if( VIP > 0.774238 )
									ret := 0.678161
						if( tema > 1.21505 )
							if( tema <= 1.265 )
								if( tema <= 1.22746 )
									ret := -0.093023
								if( tema > 1.22746 )
									ret := -0.716535 // sell
							if( tema > 1.265 )
								if( ema1 <= 2.00757 )
									ret := 0.053556
								if( ema1 > 2.00757 )
									ret := 0.420925
					if( ema13 > -0.024797 )
						if( ema1 <= 1.33884 )
							if( ema13 <= -0.002814 )
								if( ema3 <= 0.497782 )
									ret := 0.139683
								if( ema3 > 0.497782 )
									ret := -0.004736
							if( ema13 > -0.002814 )
								if( VIP_VIM <= -0.157853 )
									ret := -0.073924
								if( VIP_VIM > -0.157853 )
									ret := 0.454545
						if( ema1 > 1.33884 )
							if( VIP <= 0.796382 )
								if( ema12 <= -0.01556 )
									ret := 0.583333
								if( ema12 > -0.01556 )
									ret := -0.482558
							if( VIP > 0.796382 )
								if( ema3 <= 2.19353 )
									ret := -0.023569
								if( ema3 > 2.19353 )
									ret := -0.585714
				if( tema > 2.22733 )
					if( ema3 <= 2.28506 )
						if( VIP_VIM <= -0.274477 )
							ret := 0.062500
						if( VIP_VIM > -0.274477 )
							ret := -0.666667
					if( ema3 > 2.28506 )
						if( VIM <= 1.27768 )
							if( ema12 <= -0.015974 )
								ret := -1.000000 // sell
							if( ema12 > -0.015974 )
								ret := -0.777778 // sell
						if( VIM > 1.27768 )
							ret := -0.750000 // sell
			if( ema1 > 2.34615 )
				if( ema12 <= -0.043323 )
					if( ema2 <= 2.79553 )
						if( ema1 <= 2.43149 )
							ret := 1.000000 // buy
						if( ema1 > 2.43149 )
							if( VIP <= 0.737632 )
								if( ema13 <= -0.093064 )
									ret := 0.800000 // buy
								if( ema13 > -0.093064 )
									ret := 1.000000 // buy
							if( VIP > 0.737632 )
								ret := 0.384615
					if( ema2 > 2.79553 )
						ret := 0.250000
				if( ema12 > -0.043323 )
					if( VIP_VIM <= -0.513067 )
						if( tema <= 2.48553 )
							ret := -0.916667 // sell
						if( tema > 2.48553 )
							ret := -0.473684
					if( VIP_VIM > -0.513067 )
						if( ema12 <= -0.028659 )
							if( ema3 <= 2.67638 )
								if( ema13 <= -0.062386 )
									ret := 0.666667
								if( ema13 > -0.062386 )
									ret := 0.333333
							if( ema3 > 2.67638 )
								if( ema3 <= 2.72829 )
									ret := -0.814815 // sell
								if( ema3 > 2.72829 )
									ret := -0.111111
						if( ema12 > -0.028659 )
							if( ema3 <= 2.85612 )
								if( ema1 <= 2.6686 )
									ret := 0.302439
								if( ema1 > 2.6686 )
									ret := 0.888889 // buy
							if( ema3 > 2.85612 )
								if( VIM <= 1.09331 )
									ret := -0.916667 // sell
								if( VIM > 1.09331 )
									ret := 0.150943
		if( VIP > 0.889151 )
			if( ema13 <= -0.000671 )
				if( VIP_VIM <= 0.044485 )
					if( VIM <= 1.26046 )
						if( tema <= 2.40188 )
							if( ema3 <= 2.39612 )
								if( ema1 <= 0.401677 )
									ret := -0.180973
								if( ema1 > 0.401677 )
									ret := -0.068205
							if( ema3 > 2.39612 )
								if( ema13 <= -0.012137 )
									ret := 0.811321 // buy
								if( ema13 > -0.012137 )
									ret := 0.125000
						if( tema > 2.40188 )
							if( ema2 <= 2.54768 )
								if( VIP_VIM <= -0.175574 )
									ret := -0.951220 // sell
								if( VIP_VIM > -0.175574 )
									ret := -0.436242
							if( ema2 > 2.54768 )
								if( ema1 <= 2.57266 )
									ret := 0.840000 // buy
								if( ema1 > 2.57266 )
									ret := -0.215094
					if( VIM > 1.26046 )
						if( ema1 <= 0.449605 )
							ret := -0.363636
						if( ema1 > 0.449605 )
							if( VIP <= 0.922117 )
								ret := -1.000000 // sell
							if( VIP > 0.922117 )
								ret := -0.785714 // sell
				if( VIP_VIM > 0.044485 )
					if( ema3 <= 0.561649 )
						if( ema12 <= 0.000199 )
							if( ema1 <= 0.360965 )
								ret := 1.000000 // buy
							if( ema1 > 0.360965 )
								if( ema3 <= 0.478394 )
									ret := 0.176692
								if( ema3 > 0.478394 )
									ret := 0.475806
						if( ema12 > 0.000199 )
							if( VIP <= 1.05387 )
								if( ema2 <= 0.443217 )
									ret := -0.833333 // sell
								if( ema2 > 0.443217 )
									ret := -0.111111
							if( VIP > 1.05387 )
								if( ema1 <= 0.457571 )
									ret := 0.600000
								if( ema1 > 0.457571 )
									ret := -0.461538
					if( ema3 > 0.561649 )
						if( tema <= 1.24339 )
							if( ema12 <= -0.000486 )
								if( ema1 <= 1.21244 )
									ret := 0.020588
								if( ema1 > 1.21244 )
									ret := -0.530303
							if( ema12 > -0.000486 )
								if( VIM <= 0.950423 )
									ret := -0.705882 // sell
								if( VIM > 0.950423 )
									ret := -0.164179
						if( tema > 1.24339 )
							if( ema3 <= 1.33131 )
								if( tema <= 1.25829 )
									ret := 0.000000
								if( tema > 1.25829 )
									ret := 0.693069
							if( ema3 > 1.33131 )
								if( VIM <= 0.951016 )
									ret := 0.291667
								if( VIM > 0.951016 )
									ret := -0.086351
			if( ema13 > -0.000671 )
				if( ema3 <= 2.8815 )
					if( ema2 <= 0.583144 )
						if( ema2 <= 0.536652 )
							if( ema1 <= 0.429027 )
								if( ema12 <= 0.005646 )
									ret := -0.030082
								if( ema12 > 0.005646 )
									ret := -0.721591 // sell
							if( ema1 > 0.429027 )
								if( VIP <= 1.19726 )
									ret := 0.006257
								if( VIP > 1.19726 )
									ret := 0.158473
						if( ema2 > 0.536652 )
							if( ema13 <= 0.009478 )
								if( tema <= 0.583909 )
									ret := 0.090246
								if( tema > 0.583909 )
									ret := 0.400000
							if( ema13 > 0.009478 )
								if( VIP <= 1.34997 )
									ret := 0.608247
								if( VIP > 1.34997 )
									ret := -0.379310
					if( ema2 > 0.583144 )
						if( ema1 <= 0.683818 )
							if( ema1 <= 0.678763 )
								if( VIM <= 0.989726 )
									ret := -0.311672
								if( VIM > 0.989726 )
									ret := -0.059574
							if( ema1 > 0.678763 )
								if( ema13 <= 0.001116 )
									ret := -0.333333
								if( ema13 > 0.001116 )
									ret := -0.886364 // sell
						if( ema1 > 0.683818 )
							if( ema12 <= 0.005126 )
								if( ema1 <= 2.38053 )
									ret := 0.039519
								if( ema1 > 2.38053 )
									ret := 0.313167
							if( ema12 > 0.005126 )
								if( ema13 <= 0.015755 )
									ret := -0.147704
								if( ema13 > 0.015755 )
									ret := -0.007900
				if( ema3 > 2.8815 )
					if( VIP_VIM <= 0.191382 )
						if( VIM <= 0.972238 )
							ret := 0.142857
						if( VIM > 0.972238 )
							if( ema1 <= 2.94484 )
								ret := -0.933333 // sell
							if( ema1 > 2.94484 )
								ret := -0.611111
					if( VIP_VIM > 0.191382 )
						if( ema3 <= 2.89706 )
							ret := -0.555556
						if( ema3 > 2.89706 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_857a857f(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


