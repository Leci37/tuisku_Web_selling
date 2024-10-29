//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: EPAM_15Min_1BOL_72f7fa82 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_EPAM_15Min_1BOL_72f7fa82", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_EPAM_15Min_72f7fa82(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBlower <= 643.308 )
		if( dif_source_BBlower <= 0.683264 )
			if( BBupper <= 301.438 )
				if( dif_source_BBupper <= -38.1157 )
					if( dif_source_BBlower <= -7.71973 )
						if( BBlower <= 180.095 )
							ret := 1.000000 // buy
						if( BBlower > 180.095 )
							if( vrsi <= 6.92025 )
								if( BBupper <= 262.542 )
									ret := -0.863636 // sell
								if( BBupper > 262.542 )
									ret := 0.458333
							if( vrsi > 6.92025 )
								if( BBupper <= 293.613 )
									ret := -0.800000 // sell
								if( BBupper > 293.613 )
									ret := 0.666667
					if( dif_source_BBlower > -7.71973 )
						if( BBlower <= 206.179 )
							if( BBupper <= 281.443 )
								if( vrsi <= 15.6747 )
									ret := 0.739130 // buy
								if( vrsi > 15.6747 )
									ret := -0.378378
							if( BBupper > 281.443 )
								if( dif_source_BBupper <= -89.8563 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -89.8563 )
									ret := 0.750000 // buy
						if( BBlower > 206.179 )
							if( vrsi <= 34.9999 )
								if( BBupper <= 293.076 )
									ret := -1.000000 // sell
								if( BBupper > 293.076 )
									ret := 0.653846
							if( vrsi > 34.9999 )
								if( dif_source_BBupper <= -62.5015 )
									ret := -0.142857
								if( dif_source_BBupper > -62.5015 )
									ret := -1.000000 // sell
				if( dif_source_BBupper > -38.1157 )
					if( dif_source_BBupper <= -30.6753 )
						if( BBupper <= 194.22 )
							if( vrsi <= 25.7313 )
								ret := 0.500000
							if( vrsi > 25.7313 )
								if( vrsi <= 27.5643 )
									ret := -0.750000 // sell
								if( vrsi > 27.5643 )
									ret := -1.000000 // sell
						if( BBupper > 194.22 )
							if( BBlower <= 239.956 )
								if( BBupper <= 240.132 )
									ret := 0.877778 // buy
								if( BBupper > 240.132 )
									ret := 0.411765
							if( BBlower > 239.956 )
								if( BBlower <= 263.313 )
									ret := -0.800000 // sell
								if( BBlower > 263.313 )
									ret := 0.333333
					if( dif_source_BBupper > -30.6753 )
						if( BBlower <= 112.682 )
							if( vrsi <= 16.6914 )
								if( dif_source_BBupper <= -2.62742 )
									ret := 0.537500
								if( dif_source_BBupper > -2.62742 )
									ret := 0.200000
							if( vrsi > 16.6914 )
								if( dif_source_BBlower <= -0.31929 )
									ret := 0.462121
								if( dif_source_BBlower > -0.31929 )
									ret := 0.116254
						if( BBlower > 112.682 )
							if( BBupper <= 123.26 )
								if( dif_source_BBupper <= -5.3569 )
									ret := -0.441176
								if( dif_source_BBupper > -5.3569 )
									ret := 0.305556
							if( BBupper > 123.26 )
								if( BBupper <= 127.879 )
									ret := 0.353846
								if( BBupper > 127.879 )
									ret := 0.024540
			if( BBupper > 301.438 )
				if( dif_source_BBlower <= -2.09512 )
					if( vrsi <= 2.63667 )
						if( BBupper <= 399.648 )
							if( dif_source_BBlower <= -8.98498 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -8.98498 )
								if( dif_source_BBupper <= -29.9609 )
									ret := -0.500000
								if( dif_source_BBupper > -29.9609 )
									ret := 0.222222
						if( BBupper > 399.648 )
							if( BBlower <= 417.108 )
								if( BBupper <= 405.101 )
									ret := -1.000000 // sell
								if( BBupper > 405.101 )
									ret := -0.565217
							if( BBlower > 417.108 )
								if( BBlower <= 586.952 )
									ret := 0.764706 // buy
								if( BBlower > 586.952 )
									ret := -0.583333
					if( vrsi > 2.63667 )
						if( BBlower <= 624.65 )
							if( vrsi <= 24.1071 )
								if( dif_source_BBlower <= -4.59577 )
									ret := 0.702602 // buy
								if( dif_source_BBlower > -4.59577 )
									ret := 0.336207
							if( vrsi > 24.1071 )
								if( dif_source_BBlower <= -48.4245 )
									ret := -1.000000 // sell
								if( dif_source_BBlower > -48.4245 )
									ret := 0.340824
						if( BBlower > 624.65 )
							if( dif_source_BBlower <= -15.9063 )
								if( vrsi <= 9.81226 )
									ret := -0.500000
								if( vrsi > 9.81226 )
									ret := 0.187500
							if( dif_source_BBlower > -15.9063 )
								ret := -1.000000 // sell
				if( dif_source_BBlower > -2.09512 )
					if( BBlower <= 281.098 )
						if( dif_source_BBupper <= -46.525 )
							if( dif_source_BBlower <= 0.253997 )
								if( vrsi <= 50.9545 )
									ret := 1.000000 // buy
								if( vrsi > 50.9545 )
									ret := 0.750000 // buy
							if( dif_source_BBlower > 0.253997 )
								ret := 0.500000
						if( dif_source_BBupper > -46.525 )
							if( vrsi <= 29.9185 )
								if( BBupper <= 315.042 )
									ret := -0.391304
								if( BBupper > 315.042 )
									ret := 1.000000 // buy
							if( vrsi > 29.9185 )
								if( dif_source_BBupper <= -37.8676 )
									ret := 0.241379
								if( dif_source_BBupper > -37.8676 )
									ret := 0.852941 // buy
					if( BBlower > 281.098 )
						if( BBlower <= 287.247 )
							if( dif_source_BBlower <= 0.546887 )
								if( dif_source_BBlower <= -1.90731 )
									ret := 0.250000
								if( dif_source_BBlower > -1.90731 )
									ret := -0.523810
							if( dif_source_BBlower > 0.546887 )
								ret := 0.750000 // buy
						if( BBlower > 287.247 )
							if( dif_source_BBupper <= -12.8675 )
								if( BBupper <= 336.892 )
									ret := 0.350427
								if( BBupper > 336.892 )
									ret := 0.028944
							if( dif_source_BBupper > -12.8675 )
								if( BBlower <= 341.747 )
									ret := -0.736842 // sell
								if( BBlower > 341.747 )
									ret := -0.050000
		if( dif_source_BBlower > 0.683264 )
			if( dif_source_BBlower <= 164.292 )
				if( BBupper <= 705.843 )
					if( vrsi <= 94.3494 )
						if( BBupper <= 676.397 )
							if( BBupper <= 352.493 )
								if( BBupper <= 348.543 )
									ret := 0.053495
								if( BBupper > 348.543 )
									ret := 0.272142
							if( BBupper > 352.493 )
								if( dif_source_BBupper <= -12.9101 )
									ret := -0.023946
								if( dif_source_BBupper > -12.9101 )
									ret := 0.064640
						if( BBupper > 676.397 )
							if( vrsi <= 56.7336 )
								if( dif_source_BBupper <= -81.3836 )
									ret := 0.783333 // buy
								if( dif_source_BBupper > -81.3836 )
									ret := -0.146341
							if( vrsi > 56.7336 )
								if( BBlower <= 514.633 )
									ret := -0.428571
								if( BBlower > 514.633 )
									ret := 0.619048
					if( vrsi > 94.3494 )
						if( BBlower <= 167.903 )
							if( dif_source_BBlower <= 22.9981 )
								if( BBupper <= 185.619 )
									ret := -0.195355
								if( BBupper > 185.619 )
									ret := 0.620690
							if( dif_source_BBlower > 22.9981 )
								if( BBupper <= 207.589 )
									ret := -0.931034 // sell
								if( BBupper > 207.589 )
									ret := -0.593750
						if( BBlower > 167.903 )
							if( BBupper <= 179.622 )
								if( dif_source_BBlower <= 5.79048 )
									ret := 0.050000
								if( dif_source_BBlower > 5.79048 )
									ret := 0.843750 // buy
							if( BBupper > 179.622 )
								if( dif_source_BBupper <= -104.932 )
									ret := 0.640000
								if( dif_source_BBupper > -104.932 )
									ret := -0.003028
				if( BBupper > 705.843 )
					if( BBupper <= 726.284 )
						if( dif_source_BBlower <= 17.2329 )
							if( dif_source_BBupper <= -102.249 )
								if( dif_source_BBlower <= 11.5968 )
									ret := -0.734375 // sell
								if( dif_source_BBlower > 11.5968 )
									ret := -0.947368 // sell
							if( dif_source_BBupper > -102.249 )
								if( dif_source_BBupper <= -96.2372 )
									ret := 0.666667
								if( dif_source_BBupper > -96.2372 )
									ret := -0.914286 // sell
						if( dif_source_BBlower > 17.2329 )
							if( dif_source_BBlower <= 17.6277 )
								if( vrsi <= 19.0746 )
									ret := 1.000000 // buy
								if( vrsi > 19.0746 )
									ret := 0.500000
							if( dif_source_BBlower > 17.6277 )
								if( dif_source_BBlower <= 37.8452 )
									ret := -0.469880
								if( dif_source_BBlower > 37.8452 )
									ret := -0.075269
					if( BBupper > 726.284 )
						if( dif_source_BBlower <= 23.5149 )
							if( BBupper <= 727.787 )
								if( BBlower <= 625.515 )
									ret := 0.000000
								if( BBlower > 625.515 )
									ret := 0.833333 // buy
							if( BBupper > 727.787 )
								if( BBlower <= 611.278 )
									ret := -0.250000
								if( BBlower > 611.278 )
									ret := 0.926829 // buy
						if( dif_source_BBlower > 23.5149 )
							if( vrsi <= 45.7707 )
								if( dif_source_BBlower <= 53.1374 )
									ret := -0.833333 // sell
								if( dif_source_BBlower > 53.1374 )
									ret := 0.274725
							if( vrsi > 45.7707 )
								if( vrsi <= 74.689 )
									ret := -0.403846
								if( vrsi > 74.689 )
									ret := -0.750000 // sell
			if( dif_source_BBlower > 164.292 )
				if( dif_source_BBlower <= 166.048 )
					ret := -0.500000
				if( dif_source_BBlower > 166.048 )
					if( dif_source_BBupper <= -8.07216 )
						ret := -1.000000 // sell
					if( dif_source_BBupper > -8.07216 )
						if( vrsi <= 69.9294 )
							ret := -0.250000
						if( vrsi > 69.9294 )
							if( dif_source_BBlower <= 172.94 )
								ret := -0.750000 // sell
							if( dif_source_BBlower > 172.94 )
								ret := -1.000000 // sell
	if( BBlower > 643.308 )
		if( dif_source_BBupper <= -61.2501 )
			if( BBlower <= 648.227 )
				if( dif_source_BBupper <= -66.5693 )
					if( dif_source_BBlower <= 16.5431 )
						if( BBupper <= 691.766 )
							ret := 1.000000 // buy
						if( BBupper > 691.766 )
							ret := 0.000000
					if( dif_source_BBlower > 16.5431 )
						if( dif_source_BBlower <= 19.6906 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 19.6906 )
							ret := 0.750000 // buy
				if( dif_source_BBupper > -66.5693 )
					if( BBlower <= 646.054 )
						if( dif_source_BBlower <= 22.7071 )
							ret := 0.500000
						if( dif_source_BBlower > 22.7071 )
							ret := 0.000000
					if( BBlower > 646.054 )
						ret := -0.250000
			if( BBlower > 648.227 )
				if( BBupper <= 737.41 )
					if( dif_source_BBlower <= 14.5942 )
						ret := 0.000000
					if( dif_source_BBlower > 14.5942 )
						if( dif_source_BBupper <= -64.3463 )
							ret := -0.250000
						if( dif_source_BBupper > -64.3463 )
							ret := 0.000000
				if( BBupper > 737.41 )
					ret := 0.250000
		if( dif_source_BBupper > -61.2501 )
			if( dif_source_BBlower <= 35.2306 )
				if( BBlower <= 644.819 )
					if( dif_source_BBlower <= 9.54766 )
						ret := -1.000000 // sell
					if( dif_source_BBlower > 9.54766 )
						if( dif_source_BBlower <= 20.3365 )
							ret := 1.000000 // buy
						if( dif_source_BBlower > 20.3365 )
							if( BBlower <= 644.163 )
								ret := 0.000000
							if( BBlower > 644.163 )
								ret := -0.250000
				if( BBlower > 644.819 )
					if( dif_source_BBlower <= 7.35108 )
						if( vrsi <= 52.6668 )
							if( BBlower <= 656.439 )
								if( BBupper <= 699.478 )
									ret := -0.791667 // sell
								if( BBupper > 699.478 )
									ret := -0.300000
							if( BBlower > 656.439 )
								ret := 0.000000
						if( vrsi > 52.6668 )
							ret := 0.000000
					if( dif_source_BBlower > 7.35108 )
						if( BBupper <= 737.339 )
							if( BBupper <= 698.734 )
								if( BBupper <= 683.166 )
									ret := -1.000000 // sell
								if( BBupper > 683.166 )
									ret := -0.357143
							if( BBupper > 698.734 )
								if( BBlower <= 646.185 )
									ret := -0.666667
								if( BBlower > 646.185 )
									ret := -0.973684 // sell
						if( BBupper > 737.339 )
							ret := -0.166667
			if( dif_source_BBlower > 35.2306 )
				ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_EPAM_15Min_72f7fa82(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


