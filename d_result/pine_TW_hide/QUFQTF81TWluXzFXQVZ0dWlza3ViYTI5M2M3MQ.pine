//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AAPL_5Min_1WAV_ba293c71 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_1WAV_ba293c71", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_ba293c71(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_tci <= -56.3648 )
		if( wt2 <= 70.2553 )
			if( ap <= 228.356 )
				if( ci_wt2 <= 88.3538 )
					if( wt2 <= 62.7196 )
						if( d <= 0.31574 )
							if( esa <= 222.607 )
								if( tci <= 61.3781 )
									ret := -0.123424
								if( tci > 61.3781 )
									ret := 0.097735
							if( esa > 222.607 )
								if( d_tci <= -59.8343 )
									ret := 0.558559
								if( d_tci > -59.8343 )
									ret := -0.200000
						if( d > 0.31574 )
							if( esa <= 182.99 )
								if( tci <= 59.5882 )
									ret := -0.092105
								if( tci > 59.5882 )
									ret := -0.697749
							if( esa > 182.99 )
								if( ci_wt2 <= -11.5443 )
									ret := -0.565657
								if( ci_wt2 > -11.5443 )
									ret := 0.001887
					if( wt2 > 62.7196 )
						if( wt2 <= 68.8305 )
							if( ap <= 170.12 )
								if( wt2 <= 67.7743 )
									ret := 0.226804
								if( wt2 > 67.7743 )
									ret := -0.916667 // sell
							if( ap > 170.12 )
								if( ap <= 224.778 )
									ret := -0.263189
								if( ap > 224.778 )
									ret := -0.548387
						if( wt2 > 68.8305 )
							if( esa <= 179.538 )
								if( ap <= 172.762 )
									ret := -0.093750
								if( ap > 172.762 )
									ret := 0.454545
							if( esa > 179.538 )
								if( d_tci <= -65.0034 )
									ret := -0.094972
								if( d_tci > -65.0034 )
									ret := -0.586957
				if( ci_wt2 > 88.3538 )
					if( ci_wt2 <= 125.337 )
						if( d_tci <= -56.9949 )
							if( wt2 <= 61.478 )
								if( ci <= 153.407 )
									ret := -0.583333
								if( ci > 153.407 )
									ret := -0.759259 // sell
							if( wt2 > 61.478 )
								ret := -0.222222
						if( d_tci > -56.9949 )
							ret := -0.055556
					if( ci_wt2 > 125.337 )
						if( ci <= 199.941 )
							if( d <= 0.166181 )
								ret := -0.583333
							if( d > 0.166181 )
								if( esa <= 177.626 )
									ret := -0.322581
								if( esa > 177.626 )
									ret := 0.566667
						if( ci > 199.941 )
							if( ci <= 230.628 )
								if( d_tci <= -60.1315 )
									ret := -0.909091 // sell
								if( d_tci > -60.1315 )
									ret := -0.500000
							if( ci > 230.628 )
								ret := 0.142857
			if( ap > 228.356 )
				if( tci <= 59.8117 )
					if( ci_wt2 <= 70.6868 )
						if( tci <= 59.0486 )
							if( ci <= 54.0304 )
								ret := -0.333333
							if( ci > 54.0304 )
								if( tci <= 58.3598 )
									ret := 0.727273 // buy
								if( tci > 58.3598 )
									ret := -0.117647
						if( tci > 59.0486 )
							ret := 0.500000
					if( ci_wt2 > 70.6868 )
						ret := -0.636364
				if( tci > 59.8117 )
					if( d <= 0.119156 )
						ret := -0.071429
					if( d > 0.119156 )
						if( ap <= 230.627 )
							if( ap <= 229.77 )
								if( esa <= 228.632 )
									ret := -0.571429
								if( esa > 228.632 )
									ret := -0.892857 // sell
							if( ap > 229.77 )
								if( d <= 0.294114 )
									ret := -0.083333
								if( d > 0.294114 )
									ret := -0.700000 // sell
						if( ap > 230.627 )
							if( ap <= 232.31 )
								if( d <= 0.552022 )
									ret := -1.000000 // sell
								if( d > 0.552022 )
									ret := -0.900000 // sell
							if( ap > 232.31 )
								if( d <= 0.564665 )
									ret := -1.000000 // sell
								if( d > 0.564665 )
									ret := -0.615385
		if( wt2 > 70.2553 )
			if( wt2 <= 87.9664 )
				if( d <= 0.675469 )
					if( d <= 0.572286 )
						if( tci <= 71.0689 )
							if( ap <= 227.966 )
								if( d <= 0.481349 )
									ret := 0.154930
								if( d > 0.481349 )
									ret := 0.837209 // buy
							if( ap > 227.966 )
								ret := -0.944444 // sell
						if( tci > 71.0689 )
							if( ap <= 171.267 )
								if( ci <= 93.9702 )
									ret := -0.796296 // sell
								if( ci > 93.9702 )
									ret := 0.315789
							if( ap > 171.267 )
								if( d <= 0.254293 )
									ret := -0.284264
								if( d > 0.254293 )
									ret := -0.002347
					if( d > 0.572286 )
						if( esa <= 190.287 )
							if( tci <= 73.1179 )
								ret := -0.111111
							if( tci > 73.1179 )
								if( d_tci <= -78.1431 )
									ret := -0.882353 // sell
								if( d_tci > -78.1431 )
									ret := -1.000000 // sell
						if( esa > 190.287 )
							if( d <= 0.603053 )
								ret := -0.466667
							if( d > 0.603053 )
								if( wt2 <= 73.176 )
									ret := 0.692308
								if( wt2 > 73.176 )
									ret := 0.000000
				if( d > 0.675469 )
					if( ap <= 220.893 )
						if( esa <= 193.332 )
							if( ci <= 41.766 )
								ret := -0.909091 // sell
							if( ci > 41.766 )
								if( wt2 <= 75.8651 )
									ret := 0.068966
								if( wt2 > 75.8651 )
									ret := 0.836735 // buy
						if( esa > 193.332 )
							if( wt2 <= 77.7318 )
								if( ci <= 73.443 )
									ret := 0.913043 // buy
								if( ci > 73.443 )
									ret := 0.000000
							if( wt2 > 77.7318 )
								ret := 1.000000 // buy
					if( ap > 220.893 )
						if( esa <= 228.799 )
							if( wt2 <= 84.592 )
								if( tci <= 72.4226 )
									ret := -0.416667
								if( tci > 72.4226 )
									ret := -0.866667 // sell
							if( wt2 > 84.592 )
								ret := 0.090909
						if( esa > 228.799 )
							if( ci_wt2 <= -12.6761 )
								ret := 1.000000 // buy
							if( ci_wt2 > -12.6761 )
								ret := 0.777778 // buy
			if( wt2 > 87.9664 )
				if( ci_wt2 <= -29.5567 )
					ret := 1.000000 // buy
				if( ci_wt2 > -29.5567 )
					if( wt2 <= 91.2807 )
						ret := 0.500000
					if( wt2 > 91.2807 )
						ret := 0.760000 // buy
	if( d_tci > -56.3648 )
		if( ap <= 169.591 )
			if( d_tci <= -20.4028 )
				if( esa <= 166.608 )
					if( esa <= 165.591 )
						if( tci <= 42.1441 )
							if( ci_wt2 <= -1.56033 )
								if( d_tci <= -40.0361 )
									ret := -0.272727
								if( d_tci > -40.0361 )
									ret := 0.078947
							if( ci_wt2 > -1.56033 )
								if( wt2 <= 14.1896 )
									ret := 0.166667
								if( wt2 > 14.1896 )
									ret := -0.528736
						if( tci > 42.1441 )
							if( ci <= 83.2321 )
								if( wt2 <= 50.6144 )
									ret := 0.333333
								if( wt2 > 50.6144 )
									ret := 0.741935 // buy
							if( ci > 83.2321 )
								ret := -0.130435
					if( esa > 165.591 )
						if( wt2 <= 51.8692 )
							if( tci <= 27.6275 )
								if( tci <= 22.4387 )
									ret := -0.416667
								if( tci > 22.4387 )
									ret := 0.280000
							if( tci > 27.6275 )
								if( tci <= 41.7955 )
									ret := -0.750000 // sell
								if( tci > 41.7955 )
									ret := -0.423077
						if( wt2 > 51.8692 )
							ret := 0.636364
				if( esa > 166.608 )
					if( d <= 0.31653 )
						if( ap <= 167.307 )
							if( tci <= 28.2406 )
								if( esa <= 167.066 )
									ret := 0.866667 // buy
								if( esa > 167.066 )
									ret := 0.727273 // buy
							if( tci > 28.2406 )
								if( wt2 <= 50.3975 )
									ret := -0.024691
								if( wt2 > 50.3975 )
									ret := 0.562500
						if( ap > 167.307 )
							if( ap <= 169.545 )
								if( d_tci <= -44.9466 )
									ret := -0.262887
								if( d_tci > -44.9466 )
									ret := -0.032723
							if( ap > 169.545 )
								if( ci <= 69.4991 )
									ret := 0.514286
								if( ci > 69.4991 )
									ret := 0.100000
					if( d > 0.31653 )
						if( ci_wt2 <= 7.66118 )
							if( d_tci <= -47.3685 )
								ret := 0.846154 // buy
							if( d_tci > -47.3685 )
								ret := -0.222222
						if( ci_wt2 > 7.66118 )
							if( ci <= 72.6546 )
								ret := 1.000000 // buy
							if( ci > 72.6546 )
								ret := 0.904762 // buy
			if( d_tci > -20.4028 )
				if( wt2 <= -10.0609 )
					if( wt2 <= -69.7109 )
						if( ap <= 164.567 )
							ret := 0.235294
						if( ap > 164.567 )
							if( d <= 0.174196 )
								ret := 0.500000
							if( d > 0.174196 )
								ret := 1.000000 // buy
					if( wt2 > -69.7109 )
						if( ap <= 164.118 )
							if( ci <= 11.9386 )
								if( d_tci <= 54.2702 )
									ret := 0.375000
								if( d_tci > 54.2702 )
									ret := 0.756098 // buy
							if( ci > 11.9386 )
								ret := -0.076923
						if( ap > 164.118 )
							if( d <= 0.38854 )
								if( ap <= 164.136 )
									ret := -0.692308
								if( ap > 164.136 )
									ret := 0.123870
							if( d > 0.38854 )
								if( d_tci <= 51.2869 )
									ret := 0.142857
								if( d_tci > 51.2869 )
									ret := -0.477612
				if( wt2 > -10.0609 )
					if( d <= 0.434737 )
						if( d_tci <= -1.13086 )
							if( ci <= -47.1822 )
								if( esa <= 169.628 )
									ret := 0.442857
								if( esa > 169.628 )
									ret := -0.250000
							if( ci > -47.1822 )
								if( ap <= 169.521 )
									ret := 0.166149
								if( ap > 169.521 )
									ret := 0.677419
						if( d_tci > -1.13086 )
							if( ap <= 168.939 )
								if( wt2 <= 10.5656 )
									ret := 0.235465
								if( wt2 > 10.5656 )
									ret := 0.750000 // buy
							if( ap > 168.939 )
								if( ci <= -81.3444 )
									ret := 0.285714
								if( ci > -81.3444 )
									ret := 0.717949 // buy
					if( d > 0.434737 )
						ret := -0.235294
		if( ap > 169.591 )
			if( wt2 <= -59.7201 )
				if( d_tci <= 63.9421 )
					if( ci_wt2 <= 127.331 )
						if( d_tci <= 51.0615 )
							if( d_tci <= 49.0852 )
								ret := 0.000000
							if( d_tci > 49.0852 )
								ret := 0.888889 // buy
						if( d_tci > 51.0615 )
							if( ap <= 171.779 )
								if( ci <= -54.6747 )
									ret := 0.814815 // buy
								if( ci > -54.6747 )
									ret := 0.096000
							if( ap > 171.779 )
								if( esa <= 223.65 )
									ret := -0.326454
								if( esa > 223.65 )
									ret := 0.018519
					if( ci_wt2 > 127.331 )
						if( d_tci <= 46.9032 )
							ret := -0.636364
						if( d_tci > 46.9032 )
							if( wt2 <= -62.219 )
								ret := -0.818182 // sell
							if( wt2 > -62.219 )
								ret := -1.000000 // sell
				if( d_tci > 63.9421 )
					if( wt2 <= -69.7418 )
						if( ci_wt2 <= 23.7038 )
							if( tci <= -76.0342 )
								if( d_tci <= 79.6745 )
									ret := -0.113772
								if( d_tci > 79.6745 )
									ret := 0.116766
							if( tci > -76.0342 )
								if( d_tci <= 70.7153 )
									ret := -0.090909
								if( d_tci > 70.7153 )
									ret := 0.512270
						if( ci_wt2 > 23.7038 )
							if( d <= 1.24269 )
								if( esa <= 222.974 )
									ret := -0.125858
								if( esa > 222.974 )
									ret := 0.651163
							if( d > 1.24269 )
								if( ci <= -45.0866 )
									ret := -1.000000 // sell
								if( ci > -45.0866 )
									ret := -0.777778 // sell
					if( wt2 > -69.7418 )
						if( ci <= -128.069 )
							if( ci <= -157.7 )
								if( ci_wt2 <= -109.084 )
									ret := -0.551724
								if( ci_wt2 > -109.084 )
									ret := 0.888889 // buy
							if( ci > -157.7 )
								if( wt2 <= -64.6252 )
									ret := -0.250000
								if( wt2 > -64.6252 )
									ret := -0.955556 // sell
						if( ci > -128.069 )
							if( ci_wt2 <= -54.4185 )
								if( esa <= 180.711 )
									ret := 0.033333
								if( esa > 180.711 )
									ret := 0.590909
							if( ci_wt2 > -54.4185 )
								if( d_tci <= 66.3509 )
									ret := 0.075107
								if( d_tci > 66.3509 )
									ret := -0.127438
			if( wt2 > -59.7201 )
				if( ci <= -41.743 )
					if( wt2 <= -43.2304 )
						if( ci <= -142.812 )
							if( wt2 <= -44.0997 )
								if( wt2 <= -53.455 )
									ret := -0.011236
								if( wt2 > -53.455 )
									ret := -0.485437
							if( wt2 > -44.0997 )
								ret := 0.611111
						if( ci > -142.812 )
							if( ap <= 194.775 )
								if( esa <= 174.112 )
									ret := 0.234310
								if( esa > 174.112 )
									ret := 0.027211
							if( ap > 194.775 )
								if( wt2 <= -58.2836 )
									ret := -0.328947
								if( wt2 > -58.2836 )
									ret := 0.348364
					if( wt2 > -43.2304 )
						if( ci_wt2 <= -218.4 )
							if( wt2 <= 12.7013 )
								if( wt2 <= 4.42635 )
									ret := 0.018519
								if( wt2 > 4.42635 )
									ret := -0.764706 // sell
							if( wt2 > 12.7013 )
								if( ci_wt2 <= -292.53 )
									ret := -0.500000
								if( ci_wt2 > -292.53 )
									ret := 0.845679 // buy
						if( ci_wt2 > -218.4 )
							if( tci <= -51.0334 )
								if( wt2 <= -35.0109 )
									ret := 0.374517
								if( wt2 > -35.0109 )
									ret := -0.535714
							if( tci > -51.0334 )
								if( ap <= 227.152 )
									ret := 0.036280
								if( ap > 227.152 )
									ret := -0.101375
				if( ci > -41.743 )
					if( d_tci <= 44.8762 )
						if( d <= 0.206947 )
							if( ci <= 49.3707 )
								if( ci_wt2 <= 27.3286 )
									ret := -0.025095
								if( ci_wt2 > 27.3286 )
									ret := 0.060699
							if( ci > 49.3707 )
								if( ci_wt2 <= 129.717 )
									ret := 0.062194
								if( ci_wt2 > 129.717 )
									ret := -0.075691
						if( d > 0.206947 )
							if( ap <= 214.855 )
								if( wt2 <= 50.8028 )
									ret := -0.116250
								if( wt2 > 50.8028 )
									ret := 0.089216
							if( ap > 214.855 )
								if( d_tci <= -55.1338 )
									ret := -0.341880
								if( d_tci > -55.1338 )
									ret := 0.027461
					if( d_tci > 44.8762 )
						if( wt2 <= -50.9755 )
							if( ap <= 173.248 )
								if( wt2 <= -58.6115 )
									ret := -0.483871
								if( wt2 > -58.6115 )
									ret := 0.369231
							if( ap > 173.248 )
								if( d <= 0.814257 )
									ret := -0.111185
								if( d > 0.814257 )
									ret := 0.900000 // buy
						if( wt2 > -50.9755 )
							if( esa <= 172.619 )
								if( d_tci <= 48.3987 )
									ret := -0.895833 // sell
								if( d_tci > 48.3987 )
									ret := -0.250000
							if( esa > 172.619 )
								if( d_tci <= 49.916 )
									ret := -0.319527
								if( d_tci > 49.916 )
									ret := 0.207547
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_AAPL_5Min_ba293c71(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


