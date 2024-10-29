//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: AFRM_1Min_2TV0_713c47f3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AFRM_1Min_2TV0_713c47f3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AFRM_1Min_713c47f3(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema2 <= 24.2562 )
		if( VIM <= 1.81092 )
			if( ema1 <= 23.3575 )
				if( VIP_VIM <= 0.94218 )
					if( ema2 <= 22.2865 )
						if( VIP_VIM <= 0.174386 )
							if( ema2 <= 22.0174 )
								ret := 0.916667 // buy
							if( ema2 > 22.0174 )
								ret := 1.000000 // buy
						if( VIP_VIM > 0.174386 )
							if( ema13 <= 0.053055 )
								ret := -1.000000 // sell
							if( ema13 > 0.053055 )
								if( VIM <= 0.980068 )
									ret := 1.000000 // buy
								if( VIM > 0.980068 )
									ret := 0.800000 // buy
					if( ema2 > 22.2865 )
						if( VIM <= 1.4482 )
							if( VIM <= 1.1248 )
								if( ema2 <= 22.6283 )
									ret := 0.733333 // buy
								if( ema2 > 22.6283 )
									ret := -0.411765
							if( VIM > 1.1248 )
								if( VIP_VIM <= 0.092502 )
									ret := -0.285714
								if( VIP_VIM > 0.092502 )
									ret := -0.891304 // sell
						if( VIM > 1.4482 )
							ret := 1.000000 // buy
				if( VIP_VIM > 0.94218 )
					ret := -1.000000 // sell
			if( ema1 > 23.3575 )
				if( ema13 <= 0.027122 )
					if( ema13 <= -0.076842 )
						if( VIP <= 0.983647 )
							if( VIP <= 0.762136 )
								if( ema13 <= -0.14331 )
									ret := 1.000000 // buy
								if( ema13 > -0.14331 )
									ret := 0.842105 // buy
							if( VIP > 0.762136 )
								ret := 1.000000 // buy
						if( VIP > 0.983647 )
							ret := 0.625000
					if( ema13 > -0.076842 )
						if( ema12 <= -0.02757 )
							ret := -0.384615
						if( ema12 > -0.02757 )
							if( ema13 <= -0.03494 )
								ret := 1.000000 // buy
							if( ema13 > -0.03494 )
								if( ema2 <= 24.208 )
									ret := 0.884615 // buy
								if( ema2 > 24.208 )
									ret := 0.521739
				if( ema13 > 0.027122 )
					if( ema1 <= 24.1799 )
						if( tema <= 24.1404 )
							if( ema12 <= 0.179579 )
								ret := 1.000000 // buy
							if( ema12 > 0.179579 )
								ret := 0.076923
						if( tema > 24.1404 )
							ret := -0.166667
					if( ema1 > 24.1799 )
						if( VIP_VIM <= 0.30483 )
							if( VIP_VIM <= 0.147381 )
								if( VIP_VIM <= -0.23496 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.23496 )
									ret := 0.666667
							if( VIP_VIM > 0.147381 )
								if( ema2 <= 24.19 )
									ret := -0.588235
								if( ema2 > 24.19 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.30483 )
							if( ema12 <= 0.089323 )
								if( ema12 <= 0.06747 )
									ret := 0.375000
								if( ema12 > 0.06747 )
									ret := 1.000000 // buy
							if( ema12 > 0.089323 )
								ret := 0.000000
		if( VIM > 1.81092 )
			if( ema13 <= -0.558548 )
				if( ema2 <= 23.5779 )
					ret := 0.818182 // buy
				if( ema2 > 23.5779 )
					ret := 1.000000 // buy
			if( ema13 > -0.558548 )
				if( tema <= 22.8359 )
					if( ema2 <= 22.7632 )
						if( ema13 <= -0.150668 )
							ret := 0.636364
						if( ema13 > -0.150668 )
							ret := -0.875000 // sell
					if( ema2 > 22.7632 )
						if( ema12 <= -0.140298 )
							ret := 1.000000 // buy
						if( ema12 > -0.140298 )
							ret := 0.900000 // buy
				if( tema > 22.8359 )
					if( ema13 <= -0.117125 )
						if( ema13 <= -0.192047 )
							if( ema2 <= 24.0026 )
								ret := -1.000000 // sell
							if( ema2 > 24.0026 )
								ret := -0.916667 // sell
						if( ema13 > -0.192047 )
							ret := -0.555556
					if( ema13 > -0.117125 )
						if( VIP <= 3.05388 )
							if( VIP <= 2.72002 )
								ret := 0.500000
							if( VIP > 2.72002 )
								ret := 1.000000 // buy
						if( VIP > 3.05388 )
							if( ema12 <= -0.002232 )
								if( tema <= 24.0235 )
									ret := -0.588235
								if( tema > 24.0235 )
									ret := 0.454545
							if( ema12 > -0.002232 )
								if( tema <= 24.0302 )
									ret := -0.500000
								if( tema > 24.0302 )
									ret := -0.954545 // sell
	if( ema2 > 24.2562 )
		if( ema12 <= 0.007408 )
			if( VIP <= 1.34376 )
				if( ema2 <= 32.0519 )
					if( ema12 <= -0.095228 )
						if( ema13 <= -0.718645 )
							if( VIM <= 1.44711 )
								ret := -0.750000 // sell
							if( VIM > 1.44711 )
								ret := -1.000000 // sell
						if( ema13 > -0.718645 )
							if( ema2 <= 26.7617 )
								if( tema <= 24.8341 )
									ret := 0.433628
								if( tema > 24.8341 )
									ret := -0.358025
							if( ema2 > 26.7617 )
								if( ema3 <= 28.0471 )
									ret := 0.885057 // buy
								if( ema3 > 28.0471 )
									ret := 0.214062
					if( ema12 > -0.095228 )
						if( VIM <= 1.14669 )
							if( VIP_VIM <= -0.238665 )
								if( VIP <= 0.884432 )
									ret := 0.141865
								if( VIP > 0.884432 )
									ret := 0.566667
							if( VIP_VIM > -0.238665 )
								if( ema2 <= 24.3409 )
									ret := -0.482759
								if( ema2 > 24.3409 )
									ret := 0.046816
						if( VIM > 1.14669 )
							if( tema <= 24.2115 )
								if( ema3 <= 24.3128 )
									ret := -0.384615
								if( ema3 > 24.3128 )
									ret := -0.885714 // sell
							if( tema > 24.2115 )
								if( ema2 <= 26.3831 )
									ret := 0.135812
								if( ema2 > 26.3831 )
									ret := -0.037873
				if( ema2 > 32.0519 )
					if( tema <= 34.8953 )
						if( ema1 <= 33.6178 )
							if( VIP <= 0.819818 )
								if( VIM <= 1.4226 )
									ret := 0.158940
								if( VIM > 1.4226 )
									ret := -0.429688
							if( VIP > 0.819818 )
								if( ema12 <= -0.072082 )
									ret := -0.520216
								if( ema12 > -0.072082 )
									ret := -0.138209
						if( ema1 > 33.6178 )
							if( VIM <= 1.61728 )
								if( ema12 <= -0.127677 )
									ret := -0.701493 // sell
								if( ema12 > -0.127677 )
									ret := -0.261146
							if( VIM > 1.61728 )
								if( VIM <= 1.84395 )
									ret := 0.933333 // buy
								if( VIM > 1.84395 )
									ret := 0.625000
					if( tema > 34.8953 )
						if( tema <= 45.4778 )
							if( ema3 <= 35.9267 )
								if( VIP_VIM <= -0.694975 )
									ret := -0.872340 // sell
								if( VIP_VIM > -0.694975 )
									ret := 0.342806
							if( ema3 > 35.9267 )
								if( ema3 <= 42.7586 )
									ret := -0.042588
								if( ema3 > 42.7586 )
									ret := 0.085330
						if( tema > 45.4778 )
							if( VIP_VIM <= 0.035515 )
								if( ema13 <= -0.340404 )
									ret := 0.422222
								if( ema13 > -0.340404 )
									ret := -0.356944
							if( VIP_VIM > 0.035515 )
								if( ema13 <= 0.01355 )
									ret := 0.652174
								if( ema13 > 0.01355 )
									ret := -0.263158
			if( VIP > 1.34376 )
				if( ema3 <= 33.1037 )
					if( ema3 <= 30.9408 )
						if( VIP <= 47.2263 )
							if( VIM <= 4.89163 )
								if( ema1 <= 25.4772 )
									ret := -0.260000
								if( ema1 > 25.4772 )
									ret := 0.148336
							if( VIM > 4.89163 )
								if( ema1 <= 28.2862 )
									ret := 0.555858
								if( ema1 > 28.2862 )
									ret := 0.231818
						if( VIP > 47.2263 )
							if( VIP_VIM <= 0.262518 )
								if( ema1 <= 29.698 )
									ret := -0.636364
								if( ema1 > 29.698 )
									ret := -0.055556
							if( VIP_VIM > 0.262518 )
								if( VIP <= 88.8516 )
									ret := -0.961538 // sell
								if( VIP > 88.8516 )
									ret := -0.615385
					if( ema3 > 30.9408 )
						if( VIP_VIM <= -1.74956 )
							if( ema13 <= -0.062084 )
								if( ema13 <= -0.126108 )
									ret := 1.000000 // buy
								if( ema13 > -0.126108 )
									ret := 0.888889 // buy
							if( ema13 > -0.062084 )
								if( ema12 <= -0.018568 )
									ret := -0.222222
								if( ema12 > -0.018568 )
									ret := 0.304348
						if( VIP_VIM > -1.74956 )
							if( VIP <= 8.80283 )
								if( VIM <= 1.33444 )
									ret := 0.617021
								if( VIM > 1.33444 )
									ret := -0.139640
							if( VIP > 8.80283 )
								if( ema3 <= 31.8351 )
									ret := -0.075472
								if( ema3 > 31.8351 )
									ret := 0.621849
				if( ema3 > 33.1037 )
					if( ema3 <= 35.5401 )
						if( ema12 <= -0.014662 )
							if( VIM <= 1.60381 )
								ret := -0.600000
							if( VIM > 1.60381 )
								if( tema <= 33.7831 )
									ret := 0.476415
								if( tema > 33.7831 )
									ret := 0.748299 // buy
						if( ema12 > -0.014662 )
							if( ema13 <= -0.021763 )
								if( VIP <= 4.92857 )
									ret := -0.563636
								if( VIP > 4.92857 )
									ret := 0.066667
							if( ema13 > -0.021763 )
								if( tema <= 35.1327 )
									ret := 0.187291
								if( tema > 35.1327 )
									ret := 0.925926 // buy
					if( ema3 > 35.5401 )
						if( ema2 <= 35.9625 )
							if( ema1 <= 35.4411 )
								ret := 0.615385
							if( ema1 > 35.4411 )
								if( ema13 <= -0.030264 )
									ret := -0.539216
								if( ema13 > -0.030264 )
									ret := -0.034483
						if( ema2 > 35.9625 )
							if( ema12 <= -0.040413 )
								if( ema1 <= 40.5547 )
									ret := 0.711974 // buy
								if( ema1 > 40.5547 )
									ret := 0.150442
							if( ema12 > -0.040413 )
								if( ema2 <= 41.4503 )
									ret := -0.059081
								if( ema2 > 41.4503 )
									ret := 0.215356
		if( ema12 > 0.007408 )
			if( VIP_VIM <= 0.758855 )
				if( VIP <= 5.96106 )
					if( tema <= 45.966 )
						if( VIP_VIM <= -0.220405 )
							if( ema1 <= 34.8151 )
								if( ema3 <= 33.0205 )
									ret := 0.125455
								if( ema3 > 33.0205 )
									ret := -0.516484
							if( ema1 > 34.8151 )
								if( ema2 <= 42.4766 )
									ret := 0.500000
								if( ema2 > 42.4766 )
									ret := -0.025641
						if( VIP_VIM > -0.220405 )
							if( VIM <= 1.04796 )
								if( ema1 <= 42.5538 )
									ret := 0.003808
								if( ema1 > 42.5538 )
									ret := -0.097666
							if( VIM > 1.04796 )
								if( ema12 <= 0.030687 )
									ret := -0.051943
								if( ema12 > 0.030687 )
									ret := -0.203918
					if( tema > 45.966 )
						if( ema1 <= 49.2057 )
							if( VIM <= 0.918487 )
								if( ema13 <= 0.314112 )
									ret := 0.522976
								if( ema13 > 0.314112 )
									ret := -0.209677
							if( VIM > 0.918487 )
								if( ema3 <= 46.6192 )
									ret := 0.364706
								if( ema3 > 46.6192 )
									ret := -0.242188
						if( ema1 > 49.2057 )
							if( VIM <= 0.987537 )
								if( VIM <= 0.762673 )
									ret := -0.714286 // sell
								if( VIM > 0.762673 )
									ret := -0.257143
							if( VIM > 0.987537 )
								if( VIP <= 1.02065 )
									ret := -1.000000 // sell
								if( VIP > 1.02065 )
									ret := -0.700000 // sell
				if( VIP > 5.96106 )
					if( ema2 <= 43.8052 )
						if( ema2 <= 32.5763 )
							if( ema13 <= 0.087899 )
								if( ema12 <= 0.012231 )
									ret := 0.142857
								if( ema12 > 0.012231 )
									ret := -0.343598
							if( ema13 > 0.087899 )
								if( ema2 <= 31.716 )
									ret := 0.062222
								if( ema2 > 31.716 )
									ret := 1.000000 // buy
						if( ema2 > 32.5763 )
							if( VIP <= 31.2546 )
								if( ema12 <= 0.013289 )
									ret := -0.345679
								if( ema12 > 0.013289 )
									ret := -0.631757
							if( VIP > 31.2546 )
								if( VIP <= 62.86 )
									ret := 0.379310
								if( VIP > 62.86 )
									ret := -0.500000
					if( ema2 > 43.8052 )
						if( ema13 <= 0.378972 )
							if( ema13 <= 0.040161 )
								if( ema12 <= 0.014573 )
									ret := 0.062500
								if( ema12 > 0.014573 )
									ret := 0.777778 // buy
							if( ema13 > 0.040161 )
								if( ema12 <= 0.028289 )
									ret := -0.750000 // sell
								if( ema12 > 0.028289 )
									ret := 0.000000
						if( ema13 > 0.378972 )
							ret := 1.000000 // buy
			if( VIP_VIM > 0.758855 )
				if( ema12 <= 0.08862 )
					if( ema1 <= 44.7895 )
						if( VIP <= 1.42225 )
							if( VIP_VIM <= 0.805436 )
								if( ema2 <= 28.1165 )
									ret := -0.680000
								if( ema2 > 28.1165 )
									ret := 0.055046
							if( VIP_VIM > 0.805436 )
								if( ema1 <= 31.6915 )
									ret := 0.470588
								if( ema1 > 31.6915 )
									ret := -0.041667
						if( VIP > 1.42225 )
							if( VIP <= 4.74988 )
								if( ema12 <= 0.046983 )
									ret := -0.281804
								if( ema12 > 0.046983 )
									ret := -0.491603
							if( VIP > 4.74988 )
								if( VIM <= 12.4837 )
									ret := -0.003597
								if( VIM > 12.4837 )
									ret := -0.564103
					if( ema1 > 44.7895 )
						if( tema <= 44.8956 )
							ret := 0.952381 // buy
						if( tema > 44.8956 )
							if( ema1 <= 47.0929 )
								if( VIP <= 2.53545 )
									ret := 0.437500
								if( VIP > 2.53545 )
									ret := -0.062500
							if( ema1 > 47.0929 )
								if( VIM <= 1.11071 )
									ret := 0.000000
								if( VIM > 1.11071 )
									ret := -0.100000
				if( ema12 > 0.08862 )
					if( ema1 <= 25.4548 )
						if( VIP_VIM <= 0.981478 )
							if( tema <= 24.7807 )
								ret := -0.384615
							if( tema > 24.7807 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.981478 )
							ret := -0.090909
					if( ema1 > 25.4548 )
						if( VIM <= 1.68139 )
							if( VIP_VIM <= 0.858905 )
								if( ema12 <= 0.099826 )
									ret := 0.328767
								if( ema12 > 0.099826 )
									ret := -0.286486
							if( VIP_VIM > 0.858905 )
								if( ema1 <= 43.5745 )
									ret := 0.244295
								if( ema1 > 43.5745 )
									ret := -0.783784 // sell
						if( VIM > 1.68139 )
							if( ema3 <= 45.3889 )
								if( VIP_VIM <= 0.886677 )
									ret := 0.277778
								if( VIP_VIM > 0.886677 )
									ret := -0.535088
							if( ema3 > 45.3889 )
								ret := 0.545455
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_AFRM_1Min_713c47f3(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


