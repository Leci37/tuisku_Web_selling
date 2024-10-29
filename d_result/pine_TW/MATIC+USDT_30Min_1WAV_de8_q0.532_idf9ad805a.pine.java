//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: MATICUSDT_30Min_1WAV_f9ad805a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_30Min_1WAV_f9ad805a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_30Min_f9ad805a(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_tci <= 51.2188 )
		if( ap <= 0.889039 )
			if( d_tci <= -56.4567 )
				if( ci <= 83.0364 )
					if( ci_wt2 <= 24.8066 )
						if( wt2 <= 74.6765 )
							if( wt2 <= 61.5234 )
								if( d <= 0.003939 )
									ret := 0.070496
								if( d > 0.003939 )
									ret := -0.287905
							if( wt2 > 61.5234 )
								if( d_tci <= -68.6989 )
									ret := -0.122024
								if( d_tci > -68.6989 )
									ret := 0.041160
						if( wt2 > 74.6765 )
							if( d_tci <= -78.2423 )
								if( wt2 <= 78.2551 )
									ret := 0.833333 // buy
								if( wt2 > 78.2551 )
									ret := -0.440000
							if( d_tci > -78.2423 )
								if( ci <= 62.2633 )
									ret := 0.712230 // buy
								if( ci > 62.2633 )
									ret := -0.125000
					if( ci_wt2 > 24.8066 )
						if( ap <= 0.450641 )
							if( tci <= 57.4389 )
								ret := -0.500000
							if( tci > 57.4389 )
								ret := -0.222222
						if( ap > 0.450641 )
							if( ap <= 0.722033 )
								if( ci_wt2 <= 27.5169 )
									ret := 1.000000 // buy
								if( ci_wt2 > 27.5169 )
									ret := 0.500000
							if( ap > 0.722033 )
								ret := 0.307692
				if( ci > 83.0364 )
					if( ci_wt2 <= 24.7839 )
						if( tci <= 67.1635 )
							if( d_tci <= -65.2681 )
								ret := 0.444444
							if( d_tci > -65.2681 )
								ret := -0.666667
						if( tci > 67.1635 )
							if( tci <= 73.8105 )
								if( d_tci <= -71.3431 )
									ret := -1.000000 // sell
								if( d_tci > -71.3431 )
									ret := -0.602941
							if( tci > 73.8105 )
								if( ap <= 0.835852 )
									ret := -0.534884
								if( ap > 0.835852 )
									ret := 0.500000
					if( ci_wt2 > 24.7839 )
						if( esa <= 0.345431 )
							if( wt2 <= 49.8987 )
								if( wt2 <= 48.8731 )
									ret := -0.660714
								if( wt2 > 48.8731 )
									ret := -1.000000 // sell
							if( wt2 > 49.8987 )
								if( tci <= 69.4394 )
									ret := -0.160338
								if( tci > 69.4394 )
									ret := -0.697368
						if( esa > 0.345431 )
							if( d_tci <= -57.3512 )
								if( d_tci <= -71.1829 )
									ret := -0.320000
								if( d_tci > -71.1829 )
									ret := 0.005044
							if( d_tci > -57.3512 )
								if( tci <= 57.1868 )
									ret := -0.409091
								if( tci > 57.1868 )
									ret := -0.944444 // sell
			if( d_tci > -56.4567 )
				if( ci <= -147.152 )
					if( d <= 0.010636 )
						if( tci <= -48.5188 )
							if( d <= 0.004153 )
								ret := 0.533333
							if( d > 0.004153 )
								ret := 1.000000 // buy
						if( tci > -48.5188 )
							if( ap <= 0.409307 )
								if( tci <= -3.62815 )
									ret := 0.116883
								if( tci > -3.62815 )
									ret := -0.657143
							if( ap > 0.409307 )
								if( tci <= 19.1707 )
									ret := -0.398406
								if( tci > 19.1707 )
									ret := 0.555556
					if( d > 0.010636 )
						if( esa <= 0.902209 )
							if( wt2 <= -19.515 )
								ret := 0.600000
							if( wt2 > -19.515 )
								ret := 1.000000 // buy
						if( esa > 0.902209 )
							ret := 0.400000
				if( ci > -147.152 )
					if( tci <= 26.0808 )
						if( tci <= -50.9286 )
							if( wt2 <= -52.7204 )
								if( d_tci <= 51.0498 )
									ret := -0.826087 // sell
								if( d_tci > 51.0498 )
									ret := -0.566667
							if( wt2 > -52.7204 )
								if( wt2 <= -40.2427 )
									ret := -0.106061
								if( wt2 > -40.2427 )
									ret := -0.888889 // sell
						if( tci > -50.9286 )
							if( ap <= 0.085316 )
								if( wt2 <= -15.7953 )
									ret := -0.020996
								if( wt2 > -15.7953 )
									ret := 0.143524
							if( ap > 0.085316 )
								if( ap <= 0.091773 )
									ret := -0.470588
								if( ap > 0.091773 )
									ret := 0.011908
					if( tci > 26.0808 )
						if( wt2 <= 58.2469 )
							if( tci <= 42.6119 )
								if( esa <= 0.498817 )
									ret := 0.199118
								if( esa > 0.498817 )
									ret := 0.092667
							if( tci > 42.6119 )
								if( wt2 <= 43.0163 )
									ret := -0.090604
								if( wt2 > 43.0163 )
									ret := 0.054795
						if( wt2 > 58.2469 )
							if( ci_wt2 <= -100.849 )
								if( d <= 0.00508 )
									ret := 0.411765
								if( d > 0.00508 )
									ret := -0.424242
							if( ci_wt2 > -100.849 )
								if( esa <= 0.771542 )
									ret := 0.616327
								if( esa > 0.771542 )
									ret := -0.068182
		if( ap > 0.889039 )
			if( wt2 <= -38.4948 )
				if( d <= 0.01145 )
					if( ci_wt2 <= 135.785 )
						if( wt2 <= -40.9193 )
							if( d_tci <= 42.5067 )
								if( ap <= 1.31282 )
									ret := 0.142268
								if( ap > 1.31282 )
									ret := -0.102362
							if( d_tci > 42.5067 )
								if( ci_wt2 <= 70.0155 )
									ret := -0.160494
								if( ci_wt2 > 70.0155 )
									ret := 0.141892
						if( wt2 > -40.9193 )
							if( esa <= 1.1182 )
								if( ci_wt2 <= -5.97033 )
									ret := 0.125000
								if( ci_wt2 > -5.97033 )
									ret := -0.182540
							if( esa > 1.1182 )
								if( tci <= -48.5428 )
									ret := 0.473684
								if( tci > -48.5428 )
									ret := -0.434211
					if( ci_wt2 > 135.785 )
						if( d <= 0.005997 )
							ret := -0.181818
						if( d > 0.005997 )
							if( ci <= 94.8965 )
								ret := 0.928571 // buy
							if( ci > 94.8965 )
								if( ap <= 1.12545 )
									ret := 0.909091 // buy
								if( ap > 1.12545 )
									ret := 0.428571
				if( d > 0.01145 )
					if( ap <= 2.36034 )
						if( tci <= -50.6513 )
							if( ap <= 1.36349 )
								if( ci_wt2 <= 15.1315 )
									ret := 0.904762 // buy
								if( ci_wt2 > 15.1315 )
									ret := -0.062500
							if( ap > 1.36349 )
								if( ci_wt2 <= -38.5402 )
									ret := 0.576923
								if( ci_wt2 > -38.5402 )
									ret := -0.411765
						if( tci > -50.6513 )
							if( d <= 0.012322 )
								if( ci_wt2 <= 7.07424 )
									ret := -0.835821 // sell
								if( ci_wt2 > 7.07424 )
									ret := -0.468354
							if( d > 0.012322 )
								if( ci <= -51.8793 )
									ret := -0.423729
								if( ci > -51.8793 )
									ret := -0.180180
					if( ap > 2.36034 )
						if( d_tci <= 42.7737 )
							if( esa <= 2.51307 )
								ret := 0.916667 // buy
							if( esa > 2.51307 )
								ret := 0.785714 // buy
						if( d_tci > 42.7737 )
							if( ap <= 2.48518 )
								ret := 0.500000
							if( ap > 2.48518 )
								ret := 0.111111
			if( wt2 > -38.4948 )
				if( ap <= 1.67868 )
					if( d <= 0.044655 )
						if( ci_wt2 <= -30.5525 )
							if( d <= 0.012671 )
								if( wt2 <= -29.1689 )
									ret := 0.111441
								if( wt2 > -29.1689 )
									ret := -0.055888
							if( d > 0.012671 )
								if( tci <= -50.3994 )
									ret := -1.000000 // sell
								if( tci > -50.3994 )
									ret := 0.210090
						if( ci_wt2 > -30.5525 )
							if( d <= 0.01543 )
								if( ci_wt2 <= -21.8931 )
									ret := -0.159341
								if( ci_wt2 > -21.8931 )
									ret := -0.017163
							if( d > 0.01543 )
								if( ci_wt2 <= 74.2309 )
									ret := -0.119876
								if( ci_wt2 > 74.2309 )
									ret := -0.334988
					if( d > 0.044655 )
						if( tci <= 60.4203 )
							if( ci_wt2 <= 101.706 )
								if( esa <= 1.09668 )
									ret := 0.928571 // buy
								if( esa > 1.09668 )
									ret := 0.475309
							if( ci_wt2 > 101.706 )
								if( ap <= 1.49434 )
									ret := -0.714286 // sell
								if( ap > 1.49434 )
									ret := 0.166667
						if( tci > 60.4203 )
							if( ci <= 41.5282 )
								if( esa <= 1.37159 )
									ret := -1.000000 // sell
								if( esa > 1.37159 )
									ret := -0.466667
							if( ci > 41.5282 )
								if( ap <= 1.25775 )
									ret := -0.487179
								if( ap > 1.25775 )
									ret := 0.209877
				if( ap > 1.67868 )
					if( ci_wt2 <= 16.4473 )
						if( tci <= -24.5367 )
							if( d_tci <= 39.3281 )
								if( ci <= -17.8051 )
									ret := 0.146809
								if( ci > -17.8051 )
									ret := 1.000000 // buy
							if( d_tci > 39.3281 )
								if( ci_wt2 <= -34.6419 )
									ret := -0.047170
								if( ci_wt2 > -34.6419 )
									ret := -0.694444
						if( tci > -24.5367 )
							if( d_tci <= 20.6589 )
								if( wt2 <= 9.86989 )
									ret := 0.080056
								if( wt2 > 9.86989 )
									ret := -0.104902
							if( d_tci > 20.6589 )
								if( ci_wt2 <= 11.4624 )
									ret := -0.663636
								if( ci_wt2 > 11.4624 )
									ret := 0.833333 // buy
					if( ci_wt2 > 16.4473 )
						if( ci_wt2 <= 71.1239 )
							if( wt2 <= 42.3697 )
								if( d <= 0.029621 )
									ret := -0.300905
								if( d > 0.029621 )
									ret := -0.657658
							if( wt2 > 42.3697 )
								if( d_tci <= -50.0597 )
									ret := -0.260563
								if( d_tci > -50.0597 )
									ret := 0.285714
						if( ci_wt2 > 71.1239 )
							if( ci_wt2 <= 143.374 )
								if( tci <= -27.97 )
									ret := 0.900000 // buy
								if( tci > -27.97 )
									ret := -0.057459
							if( ci_wt2 > 143.374 )
								if( tci <= 0.814293 )
									ret := 0.104167
								if( tci > 0.814293 )
									ret := -0.700000 // sell
	if( d_tci > 51.2188 )
		if( ap <= 1.84045 )
			if( d_tci <= 68.6567 )
				if( d <= 0.03871 )
					if( d_tci <= 53.9535 )
						if( ci <= -4.68825 )
							if( ci <= -109.921 )
								if( d_tci <= 52.1557 )
									ret := 0.389831
								if( d_tci > 52.1557 )
									ret := 0.216418
							if( ci > -109.921 )
								if( tci <= -52.7191 )
									ret := 0.175824
								if( tci > -52.7191 )
									ret := -0.032213
						if( ci > -4.68825 )
							if( esa <= 0.830194 )
								if( d <= 0.002915 )
									ret := 0.187500
								if( d > 0.002915 )
									ret := 0.724138 // buy
							if( esa > 0.830194 )
								if( d <= 0.004288 )
									ret := -0.090909
								if( d > 0.004288 )
									ret := 0.307692
					if( d_tci > 53.9535 )
						if( wt2 <= -60.3277 )
							if( ap <= 1.00283 )
								if( ci <= 33.019 )
									ret := -0.091925
								if( ci > 33.019 )
									ret := 0.552632
							if( ap > 1.00283 )
								if( d <= 0.011294 )
									ret := -0.127119
								if( d > 0.011294 )
									ret := 0.173620
						if( wt2 > -60.3277 )
							if( ap <= 0.593683 )
								if( d_tci <= 54.8128 )
									ret := -0.318584
								if( d_tci > 54.8128 )
									ret := 0.247941
							if( ap > 0.593683 )
								if( wt2 <= -50.8628 )
									ret := 0.050817
								if( wt2 > -50.8628 )
									ret := -0.113997
				if( d > 0.03871 )
					if( tci <= -65.6748 )
						if( d_tci <= 66.5315 )
							ret := -0.882353 // sell
						if( d_tci > 66.5315 )
							if( esa <= 1.19204 )
								ret := -0.555556
							if( esa > 1.19204 )
								if( esa <= 1.37416 )
									ret := 0.222222
								if( esa > 1.37416 )
									ret := 0.764706 // buy
					if( tci > -65.6748 )
						if( ci <= -9.75273 )
							if( d_tci <= 59.5515 )
								if( ci <= -104.893 )
									ret := 0.571429
								if( ci > -104.893 )
									ret := 0.987805 // buy
							if( d_tci > 59.5515 )
								if( ci_wt2 <= 38.0507 )
									ret := 0.897959 // buy
								if( ci_wt2 > 38.0507 )
									ret := 0.333333
						if( ci > -9.75273 )
							ret := -0.222222
			if( d_tci > 68.6567 )
				if( esa <= 0.373318 )
					if( d_tci <= 69.7917 )
						if( ci_wt2 <= -11.2143 )
							ret := 0.294118
						if( ci_wt2 > -11.2143 )
							ret := -0.555556
					if( d_tci > 69.7917 )
						if( d <= 0.000612 )
							if( ci_wt2 <= 20.711 )
								if( ap <= 0.017824 )
									ret := 0.404255
								if( ap > 0.017824 )
									ret := 0.882353 // buy
							if( ci_wt2 > 20.711 )
								if( esa <= 0.018963 )
									ret := 0.296296
								if( esa > 0.018963 )
									ret := -0.928571 // sell
						if( d > 0.000612 )
							if( ci_wt2 <= 19.6397 )
								if( ap <= 0.336795 )
									ret := 0.984615 // buy
								if( ap > 0.336795 )
									ret := 0.818182 // buy
							if( ci_wt2 > 19.6397 )
								ret := 0.600000
				if( esa > 0.373318 )
					if( ci <= -86.2964 )
						if( ci_wt2 <= -20.5239 )
							if( ap <= 0.429813 )
								if( ci <= -136.14 )
									ret := -0.826087 // sell
								if( ci > -136.14 )
									ret := -0.148148
							if( ap > 0.429813 )
								if( d <= 0.011554 )
									ret := 0.034188
								if( d > 0.011554 )
									ret := 0.340426
						if( ci_wt2 > -20.5239 )
							if( ap <= 0.715746 )
								if( tci <= -81.5584 )
									ret := -0.400000
								if( tci > -81.5584 )
									ret := 0.882353 // buy
							if( ap > 0.715746 )
								if( ci <= -88.317 )
									ret := 0.769231 // buy
								if( ci > -88.317 )
									ret := 0.933333 // buy
					if( ci > -86.2964 )
						if( wt2 <= -77.9401 )
							if( esa <= 0.584487 )
								if( ci <= -54.2244 )
									ret := -0.722222 // sell
								if( ci > -54.2244 )
									ret := 0.500000
							if( esa > 0.584487 )
								if( ci <= -65.5291 )
									ret := -0.320000
								if( ci > -65.5291 )
									ret := -0.642857
						if( wt2 > -77.9401 )
							if( tci <= -73.4002 )
								if( wt2 <= -73.7118 )
									ret := 0.482587
								if( wt2 > -73.7118 )
									ret := -0.258065
							if( tci > -73.4002 )
								if( wt2 <= -68.4657 )
									ret := 0.101545
								if( wt2 > -68.4657 )
									ret := -0.364583
		if( ap > 1.84045 )
			if( ci_wt2 <= -84.688 )
				if( ci <= -159.172 )
					ret := 0.909091 // buy
				if( ci > -159.172 )
					if( wt2 <= -48.8592 )
						ret := 0.000000
					if( wt2 > -48.8592 )
						ret := 0.538462
			if( ci_wt2 > -84.688 )
				if( wt2 <= -75.9275 )
					ret := 0.437500
				if( wt2 > -75.9275 )
					if( wt2 <= -67.2461 )
						if( tci <= -64.6271 )
							if( esa <= 2.16404 )
								if( ap <= 1.89063 )
									ret := -0.818182 // sell
								if( ap > 1.89063 )
									ret := -0.187500
							if( esa > 2.16404 )
								ret := -0.941176 // sell
						if( tci > -64.6271 )
							ret := -0.933333 // sell
					if( wt2 > -67.2461 )
						if( ci <= -74.0995 )
							if( ci <= -81.4932 )
								if( ci <= -87.1885 )
									ret := -0.505155
								if( ci > -87.1885 )
									ret := 0.250000
							if( ci > -81.4932 )
								if( esa <= 2.07237 )
									ret := -0.636364
								if( esa > 2.07237 )
									ret := -1.000000 // sell
						if( ci > -74.0995 )
							if( wt2 <= -64.6165 )
								if( ap <= 2.0485 )
									ret := 0.555556
								if( ap > 2.0485 )
									ret := 0.400000
							if( wt2 > -64.6165 )
								if( d_tci <= 55.3444 )
									ret := 0.069767
								if( d_tci > 55.3444 )
									ret := -0.457143
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_MATICUSDT_30Min_f9ad805a(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


