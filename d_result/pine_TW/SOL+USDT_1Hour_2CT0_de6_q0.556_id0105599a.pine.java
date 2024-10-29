//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: SOLUSDT_1Hour_2CT0_0105599a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_1Hour_2CT0_0105599a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_1Hour_0105599a(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=6, max_features=0.9,min_samples_leaf=7, random_state=843828734)
	if( ad_mf <= -96465.6 )
		if( ema13 <= 0.452223 )
			if( ad_mf <= -224515 )
				if( ema3 <= 67.0434 )
					if( ad <= -230663 )
						if( ad_mf <= -322707 )
							ret := 0.163636
						if( ad_mf > -322707 )
							ret := -0.089109
					if( ad > -230663 )
						if( mf <= -0.107776 )
							ret := 0.000000
						if( mf > -0.107776 )
							ret := 0.765625 // buy
				if( ema3 > 67.0434 )
					if( mf <= -0.156927 )
						if( ema12 <= -1.43219 )
							ret := 0.917808 // buy
						if( ema12 > -1.43219 )
							ret := 0.250000
					if( mf > -0.156927 )
						if( tema <= 130.343 )
							ret := 0.453674
						if( tema > 130.343 )
							ret := 0.100559
			if( ad_mf > -224515 )
				if( ad_mf <= -100258 )
					if( ad <= -100926 )
						if( ad <= -130448 )
							ret := -0.064906
						if( ad > -130448 )
							ret := 0.053763
					if( ad > -100926 )
						if( tema <= 25.5181 )
							ret := -0.307692
						if( tema > 25.5181 )
							ret := -0.862069 // sell
				if( ad_mf > -100258 )
					if( ema12 <= -0.222616 )
						if( mf <= -0.145478 )
							ret := -0.080000
						if( mf > -0.145478 )
							ret := 0.700000 // buy
					if( ema12 > -0.222616 )
						if( ad_mf <= -98724.9 )
							ret := 0.576923
						if( ad_mf > -98724.9 )
							ret := -0.098901
		if( ema13 > 0.452223 )
			if( mf <= -0.042181 )
				if( ema12 <= 0.185082 )
					if( ad_mf <= -147852 )
						if( ema12 <= 0.062204 )
							ret := -0.071429
						if( ema12 > 0.062204 )
							ret := 0.692308
					if( ad_mf > -147852 )
						ret := -0.782609 // sell
				if( ema12 > 0.185082 )
					if( ad_mf <= -406681 )
						if( ema13 <= 0.997349 )
							ret := 0.473684
						if( ema13 > 0.997349 )
							ret := -0.321429
					if( ad_mf > -406681 )
						if( tema <= 134.164 )
							ret := 0.670330
						if( tema > 134.164 )
							ret := 0.288889
			if( mf > -0.042181 )
				if( ema1 <= 65.8646 )
					if( ema1 <= 65.1297 )
						if( ad <= -176052 )
							ret := -0.017182
						if( ad > -176052 )
							ret := 0.209898
					if( ema1 > 65.1297 )
						ret := -0.772727 // sell
				if( ema1 > 65.8646 )
					if( ema3 <= 134.324 )
						if( ad <= -530875 )
							ret := -0.535714
						if( ad > -530875 )
							ret := 0.368785
					if( ema3 > 134.324 )
						if( ad_mf <= -155336 )
							ret := -0.121849
						if( ad_mf > -155336 )
							ret := 0.241546
	if( ad_mf > -96465.6 )
		if( ema3 <= 35.49 )
			if( ad <= 33312.1 )
				if( ad_mf <= -25621.2 )
					if( ema1 <= 2.24939 )
						if( ad <= -31281.9 )
							ret := 0.281879
						if( ad > -31281.9 )
							ret := -0.272727
					if( ema1 > 2.24939 )
						if( ema1 <= 2.3108 )
							ret := -0.633333
						if( ema1 > 2.3108 )
							ret := 0.037759
				if( ad_mf > -25621.2 )
					if( mf <= 0.096022 )
						if( ad <= -24720.3 )
							ret := -0.440000
						if( ad > -24720.3 )
							ret := -0.081831
					if( mf > 0.096022 )
						if( ad <= -6823.74 )
							ret := -0.072435
						if( ad > -6823.74 )
							ret := 0.131664
			if( ad > 33312.1 )
				if( ad <= 339695 )
					if( ema12 <= 0.449965 )
						if( ema13 <= 0.257027 )
							ret := 0.075528
						if( ema13 > 0.257027 )
							ret := 0.204613
					if( ema12 > 0.449965 )
						if( ad <= 45307.6 )
							ret := 0.736842 // buy
						if( ad > 45307.6 )
							ret := -0.174142
				if( ad > 339695 )
					if( mf <= -0.092621 )
						if( ema3 <= 20.0967 )
							ret := 0.071429
						if( ema3 > 20.0967 )
							ret := -0.843137 // sell
					if( mf > -0.092621 )
						if( ad_mf <= 353786 )
							ret := -0.619048
						if( ad_mf > 353786 )
							ret := -0.071082
		if( ema3 > 35.49 )
			if( ad_mf <= 587514 )
				if( mf <= 0.294651 )
					if( ad <= -94270.4 )
						if( mf <= -0.207942 )
							ret := 0.692308
						if( mf > -0.207942 )
							ret := -0.600000
					if( ad > -94270.4 )
						if( ad_mf <= -90854.1 )
							ret := 0.490683
						if( ad_mf > -90854.1 )
							ret := -0.048915
				if( mf > 0.294651 )
					if( ema13 <= 3.47091 )
						if( ema13 <= 0.470151 )
							ret := 0.785714 // buy
						if( ema13 > 0.470151 )
							ret := 0.071038
					if( ema13 > 3.47091 )
						if( tema <= 113.471 )
							ret := 0.847826 // buy
						if( tema > 113.471 )
							ret := 0.293578
			if( ad_mf > 587514 )
				if( ema2 <= 38.6174 )
					ret := 0.562500
				if( ema2 > 38.6174 )
					if( mf <= 0.111894 )
						if( ad <= 669490 )
							ret := 0.736842 // buy
						if( ad > 669490 )
							ret := -0.383333
					if( mf > 0.111894 )
						if( ad_mf <= 611229 )
							ret := -0.967742 // sell
						if( ad_mf > 611229 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
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
float op_operation = decision_tree_0_SOLUSDT_1Hour_0105599a(mf, ad, ad_mf, ema1, tema, ema12, ema2, ema3, ema13)

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


