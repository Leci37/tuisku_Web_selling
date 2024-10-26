//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Williams_Vix_Fix
// ID_model: ADSK_15Min_1WIL_4450142b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_1WIL_4450142b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_4450142b(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( midLine <= 1.70361 )
		if( lowerBand <= -0.740218 )
			if( upperBand <= 3.7568 )
				if( wvf <= 2.46991 )
					if( midLine <= 0.979818 )
						if( wvf <= 1.72824 )
							if( Color_con1 <= -1.35426 )
								if( wvf <= 0.419719 )
									ret := 0.312500
								if( wvf > 0.419719 )
									ret := 0.589520
							if( Color_con1 > -1.35426 )
								if( wvf <= 1.57023 )
									ret := -0.511364
								if( wvf > 1.57023 )
									ret := 0.268293
						if( wvf > 1.72824 )
							if( midLine <= 0.544308 )
								if( Color_con2 <= 0.572096 )
									ret := -0.333333
								if( Color_con2 > 0.572096 )
									ret := 0.444444
							if( midLine > 0.544308 )
								if( midLine <= 0.825997 )
									ret := 0.789809 // buy
								if( midLine > 0.825997 )
									ret := 0.418367
					if( midLine > 0.979818 )
						if( Color_con2 <= -4.46631 )
							if( midLine <= 1.14945 )
								ret := -0.937500 // sell
							if( midLine > 1.14945 )
								if( Color_con1 <= -2.56668 )
									ret := -0.285714
								if( Color_con1 > -2.56668 )
									ret := -0.125000
						if( Color_con2 > -4.46631 )
							if( midLine <= 1.19196 )
								if( Color_con1 <= -2.19719 )
									ret := -0.109453
								if( Color_con1 > -2.19719 )
									ret := 0.333333
							if( midLine > 1.19196 )
								if( sDev <= 2.19554 )
									ret := 0.112150
								if( sDev > 2.19554 )
									ret := 0.517766
				if( wvf > 2.46991 )
					if( lowerBand <= -0.849411 )
						if( Color_con2 <= 1.2872 )
							if( Color_con1 <= -0.029728 )
								if( sDev <= 2.2918 )
									ret := -0.630137
								if( sDev > 2.2918 )
									ret := 0.032258
							if( Color_con1 > -0.029728 )
								if( wvf <= 3.82118 )
									ret := 0.204545
								if( wvf > 3.82118 )
									ret := -0.142857
						if( Color_con2 > 1.2872 )
							if( Color_con1 <= 0.099275 )
								if( wvf <= 2.78454 )
									ret := -0.066667
								if( wvf > 2.78454 )
									ret := 0.666667
							if( Color_con1 > 0.099275 )
								if( wvf <= 2.85505 )
									ret := -0.861111 // sell
								if( wvf > 2.85505 )
									ret := 0.011321
					if( lowerBand > -0.849411 )
						if( sDev <= 2.24608 )
							if( wvf <= 3.1673 )
								if( lowerBand <= -0.811029 )
									ret := 0.652174
								if( lowerBand > -0.811029 )
									ret := 0.120000
							if( wvf > 3.1673 )
								if( sDev <= 2.00597 )
									ret := -0.500000
								if( sDev > 2.00597 )
									ret := 0.105263
						if( sDev > 2.24608 )
							ret := 0.916667 // buy
			if( upperBand > 3.7568 )
				if( sDev <= 2.84716 )
					if( Color_con1 <= -1.11016 )
						if( midLine <= 1.31154 )
							if( wvf <= 2.35465 )
								if( sDev <= 2.66763 )
									ret := 0.815789 // buy
								if( sDev > 2.66763 )
									ret := 0.000000
							if( wvf > 2.35465 )
								if( upperBand <= 3.94713 )
									ret := -0.384615
								if( upperBand > 3.94713 )
									ret := -0.090909
						if( midLine > 1.31154 )
							if( sDev <= 2.4139 )
								if( Color_con2 <= -3.531 )
									ret := 0.384615
								if( Color_con2 > -3.531 )
									ret := -0.194030
							if( sDev > 2.4139 )
								if( Color_con1 <= -3.50087 )
									ret := -0.189189
								if( Color_con1 > -3.50087 )
									ret := -0.647826
					if( Color_con1 > -1.11016 )
						if( lowerBand <= -1.12775 )
							if( Color_con1 <= -0.038878 )
								if( lowerBand <= -1.20627 )
									ret := 0.311475
								if( lowerBand > -1.20627 )
									ret := 0.796296 // buy
							if( Color_con1 > -0.038878 )
								if( lowerBand <= -1.29582 )
									ret := -0.285714
								if( lowerBand > -1.29582 )
									ret := -0.714286 // sell
						if( lowerBand > -1.12775 )
							if( Color_con1 <= -0.415809 )
								if( sDev <= 2.53101 )
									ret := 0.454545
								if( sDev > 2.53101 )
									ret := -0.115385
							if( Color_con1 > -0.415809 )
								if( wvf <= 4.40017 )
									ret := -0.456140
								if( wvf > 4.40017 )
									ret := 0.733333 // buy
				if( sDev > 2.84716 )
					if( Color_con2 <= 1.61649 )
						if( lowerBand <= -3.808 )
							ret := -0.736842 // sell
						if( lowerBand > -3.808 )
							if( Color_con2 <= -4.60376 )
								if( Color_con1 <= -3.5838 )
									ret := 0.178571
								if( Color_con1 > -3.5838 )
									ret := -1.000000 // sell
							if( Color_con2 > -4.60376 )
								if( lowerBand <= -1.27093 )
									ret := 0.697318
								if( lowerBand > -1.27093 )
									ret := -0.285714
					if( Color_con2 > 1.61649 )
						if( lowerBand <= -2.50157 )
							ret := 1.000000 // buy
						if( lowerBand > -2.50157 )
							if( upperBand <= 4.60053 )
								if( sDev <= 2.98568 )
									ret := 0.647059
								if( sDev > 2.98568 )
									ret := -0.187500
							if( upperBand > 4.60053 )
								if( wvf <= 4.18454 )
									ret := -0.904762 // sell
								if( wvf > 4.18454 )
									ret := -0.567568
		if( lowerBand > -0.740218 )
			if( wvf <= 0.023542 )
				if( lowerBand <= -0.479193 )
					if( sDev <= 2.03801 )
						if( Color_con1 <= -2.21685 )
							if( Color_con2 <= -2.5569 )
								ret := 0.263158
							if( Color_con2 > -2.5569 )
								if( sDev <= 1.64553 )
									ret := 0.750000 // buy
								if( sDev > 1.64553 )
									ret := 0.923077 // buy
						if( Color_con1 > -2.21685 )
							ret := -0.333333
					if( sDev > 2.03801 )
						ret := -0.235294
				if( lowerBand > -0.479193 )
					if( midLine <= 0.441715 )
						if( midLine <= 0.319188 )
							if( sDev <= 0.247223 )
								if( Color_con2 <= -0.582178 )
									ret := 0.354167
								if( Color_con2 > -0.582178 )
									ret := -0.500000
							if( sDev > 0.247223 )
								if( sDev <= 0.450836 )
									ret := -0.363985
								if( sDev > 0.450836 )
									ret := -0.800000 // sell
						if( midLine > 0.319188 )
							if( Color_con1 <= -0.875458 )
								if( Color_con1 <= -0.97649 )
									ret := 0.064516
								if( Color_con1 > -0.97649 )
									ret := 0.641791
							if( Color_con1 > -0.875458 )
								if( lowerBand <= -0.077228 )
									ret := -0.220339
								if( lowerBand > -0.077228 )
									ret := 0.305677
					if( midLine > 0.441715 )
						if( upperBand <= 1.28758 )
							if( Color_con1 <= -1.21874 )
								if( lowerBand <= -0.172399 )
									ret := -0.473684
								if( lowerBand > -0.172399 )
									ret := -0.909091 // sell
							if( Color_con1 > -1.21874 )
								if( midLine <= 0.475585 )
									ret := -0.818182 // sell
								if( midLine > 0.475585 )
									ret := -0.388158
						if( upperBand > 1.28758 )
							if( upperBand <= 3.33674 )
								if( lowerBand <= 0.203491 )
									ret := 0.033784
								if( lowerBand > 0.203491 )
									ret := -0.627451
							if( upperBand > 3.33674 )
								if( sDev <= 1.89894 )
									ret := -1.000000 // sell
								if( sDev > 1.89894 )
									ret := -0.800000 // sell
			if( wvf > 0.023542 )
				if( Color_con1 <= -1.52372 )
					if( upperBand <= 3.66931 )
						if( lowerBand <= -0.242963 )
							ret := 0.117833
						if( lowerBand > -0.242963 )
							if( lowerBand <= -0.113792 )
								if( midLine <= 0.9867 )
									ret := -0.241071
								if( midLine > 0.9867 )
									ret := -0.031384
							if( lowerBand > -0.113792 )
								if( midLine <= 1.23853 )
									ret := 0.185419
								if( midLine > 1.23853 )
									ret := 0.046897
					if( upperBand > 3.66931 )
						if( sDev <= 2.11855 )
							if( sDev <= 2.09601 )
								if( Color_con2 <= -2.14636 )
									ret := -0.100000
								if( Color_con2 > -2.14636 )
									ret := -0.743590 // sell
							if( sDev > 2.09601 )
								if( Color_con2 <= -1.83031 )
									ret := -1.000000 // sell
								if( Color_con2 > -1.83031 )
									ret := -0.875000 // sell
						if( sDev > 2.11855 )
							if( upperBand <= 3.8133 )
								if( Color_con2 <= -2.87049 )
									ret := 0.529412
								if( Color_con2 > -2.87049 )
									ret := -0.587302
							if( upperBand > 3.8133 )
								if( Color_con1 <= -3.45639 )
									ret := -0.375000
								if( Color_con1 > -3.45639 )
									ret := 0.537037
				if( Color_con1 > -1.52372 )
					if( lowerBand <= -0.462303 )
						if( sDev <= 0.8838 )
							if( Color_con2 <= -1.41264 )
								ret := -0.111111
							if( Color_con2 > -1.41264 )
								if( Color_con2 <= 0.362521 )
									ret := -0.617647
								if( Color_con2 > 0.362521 )
									ret := -0.891892 // sell
						if( sDev > 0.8838 )
							if( midLine <= 0.91737 )
								if( Color_con2 <= 0.267945 )
									ret := -0.075082
								if( Color_con2 > 0.267945 )
									ret := 0.145516
							if( midLine > 0.91737 )
								if( upperBand <= 3.80113 )
									ret := -0.281615
								if( upperBand > 3.80113 )
									ret := 0.452381
					if( lowerBand > -0.462303 )
						if( midLine <= 0.558556 )
							if( midLine <= 0.459323 )
								if( midLine <= 0.181084 )
									ret := -0.388626
								if( midLine > 0.181084 )
									ret := 0.013079
							if( midLine > 0.459323 )
								if( upperBand <= 1.15017 )
									ret := -0.159753
								if( upperBand > 1.15017 )
									ret := 0.028033
						if( midLine > 0.558556 )
							if( midLine <= 1.13997 )
								if( Color_con1 <= -0.5012 )
									ret := 0.017314
								if( Color_con1 > -0.5012 )
									ret := 0.099808
							if( midLine > 1.13997 )
								if( Color_con1 <= 0.961988 )
									ret := -0.019656
								if( Color_con1 > 0.961988 )
									ret := 0.818182 // buy
	if( midLine > 1.70361 )
		if( lowerBand <= -2.72901 )
			if( upperBand <= 16.504 )
				if( sDev <= 6.07428 )
					if( Color_con1 <= -1.93979 )
						if( Color_con2 <= -2.49131 )
							ret := 0.473684
						if( Color_con2 > -2.49131 )
							if( lowerBand <= -3.24598 )
								ret := -0.800000 // sell
							if( lowerBand > -3.24598 )
								ret := 0.000000
					if( Color_con1 > -1.93979 )
						if( Color_con1 <= -0.943327 )
							ret := 0.846154 // buy
						if( Color_con1 > -0.943327 )
							if( sDev <= 5.13621 )
								ret := 1.000000 // buy
							if( sDev > 5.13621 )
								ret := 0.900000 // buy
				if( sDev > 6.07428 )
					if( midLine <= 4.26366 )
						if( sDev <= 8.96176 )
							if( Color_con2 <= -4.03886 )
								ret := 1.000000 // buy
							if( Color_con2 > -4.03886 )
								if( sDev <= 6.55505 )
									ret := 0.500000
								if( sDev > 6.55505 )
									ret := 0.850000 // buy
						if( sDev > 8.96176 )
							ret := 0.000000
					if( midLine > 4.26366 )
						if( wvf <= 1.87422 )
							ret := 0.750000 // buy
						if( wvf > 1.87422 )
							if( lowerBand <= -3.34578 )
								ret := 1.000000 // buy
							if( lowerBand > -3.34578 )
								ret := 0.933333 // buy
			if( upperBand > 16.504 )
				if( upperBand <= 20.4353 )
					if( Color_con2 <= 0.043971 )
						if( sDev <= 11.3405 )
							ret := -0.833333 // sell
						if( sDev > 11.3405 )
							ret := -1.000000 // sell
					if( Color_con2 > 0.043971 )
						ret := -0.466667
				if( upperBand > 20.4353 )
					ret := 0.208333
		if( lowerBand > -2.72901 )
			if( upperBand <= 7.15399 )
				if( midLine <= 2.07406 )
					if( wvf <= 2.96656 )
						if( sDev <= 1.95627 )
							if( wvf <= 2.26673 )
								if( Color_con2 <= -2.24563 )
									ret := 0.272500
								if( Color_con2 > -2.24563 )
									ret := -0.048731
							if( wvf > 2.26673 )
								if( lowerBand <= 0.779982 )
									ret := -0.044574
								if( lowerBand > 0.779982 )
									ret := -0.389671
						if( sDev > 1.95627 )
							if( sDev <= 2.39003 )
								if( sDev <= 2.15242 )
									ret := -0.222874
								if( sDev > 2.15242 )
									ret := -0.454810
							if( sDev > 2.39003 )
								if( Color_con2 <= -0.121737 )
									ret := -0.126154
								if( Color_con2 > -0.121737 )
									ret := 0.657534
					if( wvf > 2.96656 )
						if( sDev <= 2.76866 )
							if( upperBand <= 2.90695 )
								ret := -1.000000 // sell
							if( upperBand > 2.90695 )
								if( midLine <= 1.82597 )
									ret := -0.126050
								if( midLine > 1.82597 )
									ret := -0.361983
						if( sDev > 2.76866 )
							if( Color_con2 <= 2.62603 )
								if( upperBand <= 5.0171 )
									ret := 0.023529
								if( upperBand > 5.0171 )
									ret := 0.448598
							if( Color_con2 > 2.62603 )
								if( Color_con2 <= 3.49703 )
									ret := -0.354839
								if( Color_con2 > 3.49703 )
									ret := -0.956522 // sell
				if( midLine > 2.07406 )
					if( upperBand <= 2.9564 )
						if( Color_con2 <= 0.170397 )
							if( lowerBand <= 1.35199 )
								if( Color_con1 <= -0.735304 )
									ret := 0.901639 // buy
								if( Color_con1 > -0.735304 )
									ret := 0.600000
							if( lowerBand > 1.35199 )
								if( upperBand <= 2.8386 )
									ret := 0.044944
								if( upperBand > 2.8386 )
									ret := 0.523810
						if( Color_con2 > 0.170397 )
							if( midLine <= 2.19558 )
								ret := -0.916667 // sell
							if( midLine > 2.19558 )
								ret := -0.900000 // sell
					if( upperBand > 2.9564 )
						if( lowerBand <= 1.02644 )
							if( wvf <= 0.746504 )
								if( lowerBand <= 0.399063 )
									ret := 0.207951
								if( lowerBand > 0.399063 )
									ret := -0.176856
							if( wvf > 0.746504 )
								if( midLine <= 3.41734 )
									ret := -0.102870
								if( midLine > 3.41734 )
									ret := 0.196532
						if( lowerBand > 1.02644 )
							if( sDev <= 0.863504 )
								if( lowerBand <= 1.99218 )
									ret := -0.098558
								if( lowerBand > 1.99218 )
									ret := -0.432432
							if( sDev > 0.863504 )
								if( Color_con2 <= -7.39093 )
									ret := 0.909091 // buy
								if( Color_con2 > -7.39093 )
									ret := 0.062301
			if( upperBand > 7.15399 )
				if( Color_con1 <= -0.700669 )
					if( lowerBand <= -1.5291 )
						if( wvf <= 0.129001 )
							if( Color_con1 <= -9.69745 )
								ret := 1.000000 // buy
							if( Color_con1 > -9.69745 )
								ret := 0.500000
						if( wvf > 0.129001 )
							if( wvf <= 8.8705 )
								if( wvf <= 5.80501 )
									ret := -0.495798
								if( wvf > 5.80501 )
									ret := -0.918519 // sell
							if( wvf > 8.8705 )
								if( midLine <= 7.26834 )
									ret := 0.692308
								if( midLine > 7.26834 )
									ret := -0.923077 // sell
					if( lowerBand > -1.5291 )
						if( lowerBand <= 5.01494 )
							if( upperBand <= 8.97972 )
								if( midLine <= 5.86365 )
									ret := -0.287671
								if( midLine > 5.86365 )
									ret := 0.433962
							if( upperBand > 8.97972 )
								if( sDev <= 4.73865 )
									ret := -0.140659
								if( sDev > 4.73865 )
									ret := 0.273790
						if( lowerBand > 5.01494 )
							if( Color_con2 <= -2.14104 )
								if( midLine <= 8.59034 )
									ret := -0.444444
								if( midLine > 8.59034 )
									ret := 0.818182 // buy
							if( Color_con2 > -2.14104 )
								if( lowerBand <= 7.04449 )
									ret := -0.915493 // sell
								if( lowerBand > 7.04449 )
									ret := -0.333333
				if( Color_con1 > -0.700669 )
					if( upperBand <= 7.28605 )
						ret := -0.181818
					if( upperBand > 7.28605 )
						if( lowerBand <= -0.639353 )
							if( wvf <= 8.06822 )
								if( Color_con1 <= -0.158465 )
									ret := 0.444444
								if( Color_con1 > -0.158465 )
									ret := 1.000000 // buy
							if( wvf > 8.06822 )
								if( Color_con1 <= 1.20418 )
									ret := -0.600000
								if( Color_con1 > 1.20418 )
									ret := -1.000000 // sell
						if( lowerBand > -0.639353 )
							if( Color_con2 <= 3.24161 )
								if( upperBand <= 8.14268 )
									ret := 0.790698 // buy
								if( upperBand > 8.14268 )
									ret := 1.000000 // buy
							if( Color_con2 > 3.24161 )
								if( Color_con2 <= 3.68079 )
									ret := -0.272727
								if( Color_con2 > 3.68079 )
									ret := 0.705882 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Williams_Vix_Fix 
//@version=5
//indicator "CM_Williams_Vix_Fix", overlay=false)

// Inputs
pd = input.int(22, title="LookBack Period Standard Deviation High")
bbl = input.int(20, title="Bollinger Band Length")
mult = input.float(2.0, minval=1, maxval=5, title="Bollinger Band Standard Deviation Up")
lb = input.int(50, title="Look Back Period Percentile High")
ph = input.float(0.85, title="Highest Percentile - 0.90=90%, 0.95=95%, 0.99=99%")
pl = input.float(1.01, title="Lowest Percentile - 1.10=90%, 1.05=95%, 1.01=99%")
hp = input.bool(false, title="Show High Range - Based on Percentile and LookBack Period?")
sd = input.bool(false, title="Show Standard Deviation Line?")

// Calculations
wvf = ((ta.highest(close, pd) - low) / ta.highest(close, pd)) * 100

sDev = mult * ta.stdev(wvf, bbl)
midLine = ta.sma(wvf, bbl)
lowerBand = midLine - sDev
upperBand = midLine + sDev

rangeHigh = ta.highest(wvf, lb) * ph
rangeLow = ta.lowest(wvf, lb) * pl


Color_con1 = wvf - upperBand
Color_con2 = wvf - rangeHigh
// Color condition
col = wvf >= upperBand or wvf >= rangeHigh ? color.lime : color.gray
colInt = wvf >= upperBand or wvf >= rangeHigh ? 1 : 0 //Bool to int

// Plots
plot(hp and na(rangeHigh) ? na : rangeHigh, title="Range High Percentile", color=color.orange, linewidth=4)
plot(hp and na(rangeLow) ? na : rangeLow, title="Range Low Percentile", color=color.orange, linewidth=4)
plot(wvf, title="Williams Vix Fix", color=col, style=plot.style_histogram, linewidth=4)
plot(sd and na(upperBand) ? na : upperBand, title="Upper Band", color=color.aqua, linewidth=3)

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
float op_operation = decision_tree_0_ADSK_15Min_4450142b(rangeHigh, rangeLow, midLine, sDev, lowerBand, wvf, Color_con1, colInt, Color_con2, upperBand)

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


