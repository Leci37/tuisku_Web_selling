//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: NVDA_5Min_2TV0_4bce9bae Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_2TV0_4bce9bae", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_4bce9bae(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( VIP <= 1.01189 )
		if( VIP_VIM <= -0.25562 )
			if( ema2 <= 409.501 )
				if( tema <= 408.506 )
					if( ema13 <= -3.47261 )
						if( ema3 <= 406.276 )
							if( ema13 <= -3.84738 )
								if( ema2 <= 385.635 )
									ret := 0.875000 // buy
								if( ema2 > 385.635 )
									ret := 0.985915 // buy
							if( ema13 > -3.84738 )
								ret := 0.636364
						if( ema3 > 406.276 )
							if( VIP_VIM <= -0.581223 )
								ret := 0.818182 // buy
							if( VIP_VIM > -0.581223 )
								ret := 0.142857
					if( ema13 > -3.47261 )
						if( ema13 <= -1.10169 )
							if( VIP_VIM <= -0.608149 )
								if( ema13 <= -2.67876 )
									ret := 0.962963 // buy
								if( ema13 > -2.67876 )
									ret := 0.271484
							if( VIP_VIM > -0.608149 )
								if( VIM <= 1.12859 )
									ret := 0.761194 // buy
								if( VIM > 1.12859 )
									ret := -0.108449
						if( ema13 > -1.10169 )
							if( VIM <= 1.2941 )
								if( ema1 <= 408.557 )
									ret := 0.143938
								if( ema1 > 408.557 )
									ret := -0.894737 // sell
							if( VIM > 1.2941 )
								if( ema1 <= 130.871 )
									ret := -0.229412
								if( ema1 > 130.871 )
									ret := 0.139752
				if( tema > 408.506 )
					if( VIP <= 0.83279 )
						ret := 1.000000 // buy
					if( VIP > 0.83279 )
						ret := 0.769231 // buy
			if( ema2 > 409.501 )
				if( tema <= 484.416 )
					if( ema13 <= -7.74846 )
						if( VIP <= 0.553988 )
							ret := 1.000000 // buy
						if( VIP > 0.553988 )
							if( ema13 <= -9.62626 )
								ret := 1.000000 // buy
							if( ema13 > -9.62626 )
								ret := 0.590909
					if( ema13 > -7.74846 )
						if( ema2 <= 468.517 )
							if( ema3 <= 463.236 )
								if( ema2 <= 461.158 )
									ret := -0.086996
								if( ema2 > 461.158 )
									ret := -0.638889
							if( ema3 > 463.236 )
								if( ema2 <= 462.879 )
									ret := 0.811594 // buy
								if( ema2 > 462.879 )
									ret := 0.086677
						if( ema2 > 468.517 )
							if( ema12 <= -2.28855 )
								if( VIM <= 1.37571 )
									ret := -0.835714 // sell
								if( VIM > 1.37571 )
									ret := -0.300000
							if( ema12 > -2.28855 )
								if( ema13 <= -1.47995 )
									ret := -0.293427
								if( ema13 > -1.47995 )
									ret := -0.048986
				if( tema > 484.416 )
					if( VIM <= 1.32172 )
						if( ema13 <= -20.9144 )
							if( ema1 <= 907.574 )
								ret := -0.800000 // sell
							if( ema1 > 907.574 )
								ret := -1.000000 // sell
						if( ema13 > -20.9144 )
							if( ema13 <= -14.9399 )
								if( ema3 <= 1036.18 )
									ret := -0.142857
								if( ema3 > 1036.18 )
									ret := 0.948718 // buy
							if( ema13 > -14.9399 )
								if( ema12 <= -6.00199 )
									ret := -0.564885
								if( ema12 > -6.00199 )
									ret := 0.016173
					if( VIM > 1.32172 )
						if( ema1 <= 874.066 )
							if( ema3 <= 869.661 )
								if( ema1 <= 848.81 )
									ret := 0.247580
								if( ema1 > 848.81 )
									ret := -0.150000
							if( ema3 > 869.661 )
								if( ema12 <= -1.45327 )
									ret := 0.953488 // buy
								if( ema12 > -1.45327 )
									ret := 0.111111
						if( ema1 > 874.066 )
							if( tema <= 883.373 )
								if( ema3 <= 878.416 )
									ret := 0.545455
								if( ema3 > 878.416 )
									ret := -0.891566 // sell
							if( tema > 883.373 )
								if( VIP <= 0.738697 )
									ret := 0.356098
								if( VIP > 0.738697 )
									ret := -0.099476
		if( VIP_VIM > -0.25562 )
			if( ema1 <= 104.665 )
				if( ema2 <= 101.266 )
					if( ema3 <= 100.524 )
						if( ema12 <= -0.954445 )
							ret := -1.000000 // sell
						if( ema12 > -0.954445 )
							if( VIP <= 0.997803 )
								if( tema <= 97.9821 )
									ret := 0.117647
								if( tema > 97.9821 )
									ret := 0.759259 // buy
							if( VIP > 0.997803 )
								ret := -0.357143
					if( ema3 > 100.524 )
						if( tema <= 100.249 )
							ret := -0.375000
						if( tema > 100.249 )
							if( VIM <= 1.02214 )
								ret := -0.800000 // sell
							if( VIM > 1.02214 )
								ret := -1.000000 // sell
				if( ema2 > 101.266 )
					if( VIM <= 1.13918 )
						if( ema12 <= 0.183693 )
							if( ema3 <= 102.91 )
								if( VIP_VIM <= -0.179463 )
									ret := 0.312500
								if( VIP_VIM > -0.179463 )
									ret := 0.919355 // buy
							if( ema3 > 102.91 )
								if( tema <= 103.762 )
									ret := 0.161972
								if( tema > 103.762 )
									ret := 0.739130 // buy
						if( ema12 > 0.183693 )
							ret := -0.636364
					if( VIM > 1.13918 )
						ret := -0.777778 // sell
			if( ema1 > 104.665 )
				if( ema12 <= -0.960487 )
					if( ema2 <= 499.813 )
						if( ema3 <= 125.575 )
							if( tema <= 119.658 )
								ret := -0.800000 // sell
							if( tema > 119.658 )
								ret := -1.000000 // sell
						if( ema3 > 125.575 )
							if( ema12 <= -1.55661 )
								if( VIM <= 1.0953 )
									ret := 0.000000
								if( VIM > 1.0953 )
									ret := 0.923077 // buy
							if( ema12 > -1.55661 )
								if( tema <= 470.113 )
									ret := -0.148387
								if( tema > 470.113 )
									ret := 0.763636 // buy
					if( ema2 > 499.813 )
						if( ema1 <= 1197.63 )
							if( ema3 <= 891.393 )
								if( ema12 <= -2.2073 )
									ret := -0.070270
								if( ema12 > -2.2073 )
									ret := -0.464960
							if( ema3 > 891.393 )
								if( ema13 <= -5.65183 )
									ret := -0.913043 // sell
								if( ema13 > -5.65183 )
									ret := 0.060790
						if( ema1 > 1197.63 )
							if( VIP_VIM <= -0.176466 )
								if( ema13 <= -5.44811 )
									ret := -0.454545
								if( ema13 > -5.44811 )
									ret := -1.000000 // sell
							if( VIP_VIM > -0.176466 )
								ret := 0.000000
				if( ema12 > -0.960487 )
					if( ema3 <= 423.423 )
						if( ema3 <= 420.844 )
							if( ema2 <= 419.277 )
								if( VIP <= 0.877355 )
									ret := 0.047368
								if( VIP > 0.877355 )
									ret := -0.124566
							if( ema2 > 419.277 )
								if( ema2 <= 420.203 )
									ret := 0.879310 // buy
								if( ema2 > 420.203 )
									ret := -0.038462
						if( ema3 > 420.844 )
							if( tema <= 423.921 )
								if( VIP <= 0.954271 )
									ret := -0.689873
								if( VIP > 0.954271 )
									ret := -0.250000
							if( tema > 423.921 )
								ret := 0.692308
					if( ema3 > 423.423 )
						if( tema <= 423.263 )
							if( VIP <= 0.8764 )
								ret := 0.000000
							if( VIP > 0.8764 )
								if( ema12 <= -0.462207 )
									ret := 0.934426 // buy
								if( ema12 > -0.462207 )
									ret := 0.612903
						if( tema > 423.263 )
							if( tema <= 479.764 )
								if( ema1 <= 440.422 )
									ret := -0.097969
								if( ema1 > 440.422 )
									ret := 0.091231
							if( tema > 479.764 )
								if( tema <= 540.772 )
									ret := -0.164960
								if( tema > 540.772 )
									ret := -0.027836
	if( VIP > 1.01189 )
		if( ema2 <= 1205.19 )
			if( ema13 <= -3.16287 )
				if( ema13 <= -19.9836 )
					if( VIP_VIM <= -0.247189 )
						ret := -0.125000
					if( VIP_VIM > -0.247189 )
						ret := 0.466667
				if( ema13 > -19.9836 )
					if( ema12 <= -3.0672 )
						ret := -0.090909
					if( ema12 > -3.0672 )
						if( ema12 <= -0.766754 )
							if( ema3 <= 293.6 )
								if( VIM <= 1.47993 )
									ret := -1.000000 // sell
								if( VIM > 1.47993 )
									ret := -0.909091 // sell
							if( ema3 > 293.6 )
								if( VIP <= 1.20338 )
									ret := -0.913793 // sell
								if( VIP > 1.20338 )
									ret := -0.411765
						if( ema12 > -0.766754 )
							ret := -0.111111
			if( ema13 > -3.16287 )
				if( ema1 <= 1200.51 )
					if( ema12 <= 8.1785 )
						if( ema12 <= 2.24857 )
							if( ema2 <= 1033.79 )
								if( ema2 <= 96.0244 )
									ret := 1.000000 // buy
								if( ema2 > 96.0244 )
									ret := 0.026672
							if( ema2 > 1033.79 )
								if( ema1 <= 1146.88 )
									ret := 0.398104
								if( ema1 > 1146.88 )
									ret := -0.205387
						if( ema12 > 2.24857 )
							if( tema <= 414.988 )
								if( VIP_VIM <= 0.673156 )
									ret := -1.000000 // sell
								if( VIP_VIM > 0.673156 )
									ret := -0.125000
							if( tema > 414.988 )
								if( VIP <= 1.26026 )
									ret := -0.199270
								if( VIP > 1.26026 )
									ret := -0.007971
					if( ema12 > 8.1785 )
						if( VIP_VIM <= 0.8786 )
							if( VIP <= 1.29343 )
								if( VIP <= 1.23759 )
									ret := 1.000000 // buy
								if( VIP > 1.23759 )
									ret := 0.705882 // buy
							if( VIP > 1.29343 )
								if( ema13 <= 19.4474 )
									ret := 0.352941
								if( ema13 > 19.4474 )
									ret := -0.783784 // sell
						if( VIP_VIM > 0.8786 )
							if( ema1 <= 760.829 )
								if( ema13 <= 16.244 )
									ret := 0.909091 // buy
								if( ema13 > 16.244 )
									ret := 1.000000 // buy
							if( ema1 > 760.829 )
								ret := 0.400000
				if( ema1 > 1200.51 )
					if( tema <= 1209.28 )
						if( VIP <= 1.24408 )
							if( tema <= 1204.65 )
								if( tema <= 1202.05 )
									ret := 1.000000 // buy
								if( tema > 1202.05 )
									ret := 0.500000
							if( tema > 1204.65 )
								ret := 1.000000 // buy
						if( VIP > 1.24408 )
							ret := 0.733333 // buy
					if( tema > 1209.28 )
						ret := 0.263158
		if( ema2 > 1205.19 )
			if( ema2 <= 1216.54 )
				if( VIP <= 1.28474 )
					if( ema13 <= 1.0844 )
						if( ema3 <= 1207.14 )
							ret := -0.500000
						if( ema3 > 1207.14 )
							if( ema2 <= 1210.81 )
								ret := -1.000000 // sell
							if( ema2 > 1210.81 )
								ret := -0.888889 // sell
					if( ema13 > 1.0844 )
						if( ema13 <= 4.22924 )
							if( tema <= 1212.77 )
								if( tema <= 1210.22 )
									ret := -0.083333
								if( tema > 1210.22 )
									ret := -0.714286 // sell
							if( tema > 1212.77 )
								ret := 0.235294
						if( ema13 > 4.22924 )
							if( ema1 <= 1212.5 )
								ret := -0.142857
							if( ema1 > 1212.5 )
								ret := -1.000000 // sell
				if( VIP > 1.28474 )
					if( ema12 <= 4.17591 )
						ret := -1.000000 // sell
					if( ema12 > 4.17591 )
						ret := -0.952381 // sell
			if( ema2 > 1216.54 )
				if( tema <= 1242.11 )
					if( ema1 <= 1237.37 )
						if( ema12 <= 0.935755 )
							ret := 0.000000
						if( ema12 > 0.935755 )
							if( ema2 <= 1223.06 )
								if( VIP_VIM <= 0.266072 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.266072 )
									ret := 0.750000 // buy
							if( ema2 > 1223.06 )
								ret := 0.357143
					if( ema1 > 1237.37 )
						ret := 1.000000 // buy
				if( tema > 1242.11 )
					if( ema2 <= 1242.62 )
						ret := -0.157895
					if( ema2 > 1242.62 )
						if( VIP_VIM <= 0.147792 )
							ret := -1.000000 // sell
						if( VIP_VIM > 0.147792 )
							ret := -0.666667
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NVDA_5Min_4bce9bae(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


