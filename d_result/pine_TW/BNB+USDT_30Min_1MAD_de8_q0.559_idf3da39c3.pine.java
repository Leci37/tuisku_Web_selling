//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: BNBUSDT_30Min_1MAD_f3da39c3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_30Min_1MAD_f3da39c3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_30Min_f3da39c3(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ma20 <= 586.729 )
		if( ma75_colorInt <= 2.5 )
			if( ma25 <= 28.369 )
				if( ma90 <= 21.5752 )
					if( ma10 <= 22.41 )
						ret := 1.000000 // buy
					if( ma10 > 22.41 )
						if( ma30 <= 22.1185 )
							if( ma10 <= 22.535 )
								ret := -1.000000 // sell
							if( ma10 > 22.535 )
								if( ma15 <= 22.548 )
									ret := 0.600000
								if( ma15 > 22.548 )
									ret := -0.500000
						if( ma30 > 22.1185 )
							if( ma35 <= 22.3965 )
								if( ma90 <= 21.2768 )
									ret := -0.750000 // sell
								if( ma90 > 21.2768 )
									ret := -1.000000 // sell
							if( ma35 > 22.3965 )
								ret := -0.600000
				if( ma90 > 21.5752 )
					if( ma35 <= 22.1596 )
						if( ma70_colorInt <= 1.5 )
							if( ma100 <= 21.5861 )
								ret := -0.666667
							if( ma100 > 21.5861 )
								if( ma10 <= 22.3688 )
									ret := 0.875000 // buy
								if( ma10 > 22.3688 )
									ret := 0.250000
						if( ma70_colorInt > 1.5 )
							if( ma90 <= 21.6141 )
								ret := 0.750000 // buy
							if( ma90 > 21.6141 )
								ret := 1.000000 // buy
					if( ma35 > 22.1596 )
						if( ma100 <= 22.1006 )
							if( ma55 <= 21.98 )
								if( ma05 <= 21.9554 )
									ret := 1.000000 // buy
								if( ma05 > 21.9554 )
									ret := 0.750000 // buy
							if( ma55 > 21.98 )
								if( ma75 <= 22.0386 )
									ret := -0.866667 // sell
								if( ma75 > 22.0386 )
									ret := -0.200000
						if( ma100 > 22.1006 )
							if( ma10_colorInt <= 3.5 )
								if( ma90_colorInt <= 2.5 )
									ret := 0.401084
								if( ma90_colorInt > 2.5 )
									ret := -0.175000
							if( ma10_colorInt > 3.5 )
								if( ma70_colorInt <= 2.5 )
									ret := -0.394737
								if( ma70_colorInt > 2.5 )
									ret := 0.800000 // buy
			if( ma25 > 28.369 )
				if( ma100 <= 581.709 )
					if( ma05 <= 29.2155 )
						if( ma30 <= 28.824 )
							if( ma40 <= 28.6637 )
								if( ma15_colorInt <= 1.5 )
									ret := -0.200000
								if( ma15_colorInt > 1.5 )
									ret := 0.280303
							if( ma40 > 28.6637 )
								if( ma70 <= 28.6184 )
									ret := 0.707692 // buy
								if( ma70 > 28.6184 )
									ret := -0.181818
						if( ma30 > 28.824 )
							if( ma75_colorInt <= 1.5 )
								if( ma80 <= 28.6932 )
									ret := -0.333333
								if( ma80 > 28.6932 )
									ret := 0.869565 // buy
							if( ma75_colorInt > 1.5 )
								if( ma35 <= 29.2995 )
									ret := -0.933333 // sell
								if( ma35 > 29.2995 )
									ret := -0.254902
					if( ma05 > 29.2155 )
						if( ma15 <= 30.2963 )
							if( ma100 <= 28.6699 )
								if( ma15 <= 29.7823 )
									ret := -0.463415
								if( ma15 > 29.7823 )
									ret := 0.857143 // buy
							if( ma100 > 28.6699 )
								if( ma85 <= 29.4178 )
									ret := 0.612565
								if( ma85 > 29.4178 )
									ret := 0.303644
						if( ma15 > 30.2963 )
							if( ma80 <= 30.6421 )
								if( ma05 <= 30.7084 )
									ret := 0.072386
								if( ma05 > 30.7084 )
									ret := -0.341207
							if( ma80 > 30.6421 )
								if( ma25 <= 216.672 )
									ret := 0.151464
								if( ma25 > 216.672 )
									ret := 0.068632
				if( ma100 > 581.709 )
					if( ma40 <= 589.124 )
						if( ma05_colorInt <= 3.5 )
							if( ma65 <= 587.18 )
								if( ma05 <= 583.108 )
									ret := 0.164384
								if( ma05 > 583.108 )
									ret := 0.675439
							if( ma65 > 587.18 )
								if( ma40 <= 587.992 )
									ret := 1.000000 // buy
								if( ma40 > 587.992 )
									ret := 0.750000 // buy
						if( ma05_colorInt > 3.5 )
							if( ma30_colorInt <= 3.5 )
								if( ma10 <= 582.847 )
									ret := -0.120000
								if( ma10 > 582.847 )
									ret := -1.000000 // sell
							if( ma30_colorInt > 3.5 )
								if( ma85 <= 585.618 )
									ret := 0.857143 // buy
								if( ma85 > 585.618 )
									ret := 0.250000
					if( ma40 > 589.124 )
						if( ma45 <= 591.777 )
							if( ma55 <= 592.58 )
								if( ma55 <= 591.343 )
									ret := -0.750000 // sell
								if( ma55 > 591.343 )
									ret := -1.000000 // sell
							if( ma55 > 592.58 )
								ret := -0.166667
						if( ma45 > 591.777 )
							ret := 1.000000 // buy
		if( ma75_colorInt > 2.5 )
			if( ma40 <= 275.893 )
				if( ma90 <= 278.144 )
					if( ma10 <= 19.0645 )
						if( ma15_colorInt <= 3.5 )
							ret := 1.000000 // buy
						if( ma15_colorInt > 3.5 )
							if( ma85 <= 20.0841 )
								ret := 1.000000 // buy
							if( ma85 > 20.0841 )
								ret := 0.000000
					if( ma10 > 19.0645 )
						if( ma80 <= 21.2544 )
							if( ma10_colorInt <= 2.5 )
								if( ma50_colorInt <= 2 )
									ret := 0.888889 // buy
								if( ma50_colorInt > 2 )
									ret := 0.000000
							if( ma10_colorInt > 2.5 )
								if( ma85 <= 21.2455 )
									ret := -0.726190 // sell
								if( ma85 > 21.2455 )
									ret := -0.214286
						if( ma80 > 21.2544 )
							if( ma20 <= 21.0276 )
								if( ma05_colorInt <= 3.5 )
									ret := 0.972973 // buy
								if( ma05_colorInt > 3.5 )
									ret := 0.500000
							if( ma20 > 21.0276 )
								if( ma65 <= 21.5884 )
									ret := -0.852941 // sell
								if( ma65 > 21.5884 )
									ret := 0.043905
				if( ma90 > 278.144 )
					if( ma15 <= 264.807 )
						if( ma30_colorInt <= 3.5 )
							if( ma100 <= 283.954 )
								if( ma10_colorInt <= 3.5 )
									ret := 1.000000 // buy
								if( ma10_colorInt > 3.5 )
									ret := 0.250000
							if( ma100 > 283.954 )
								if( ma100 <= 298.812 )
									ret := 1.000000 // buy
								if( ma100 > 298.812 )
									ret := 0.800000 // buy
						if( ma30_colorInt > 3.5 )
							if( ma30 <= 260.225 )
								ret := 1.000000 // buy
							if( ma30 > 260.225 )
								if( ma65 <= 275.325 )
									ret := 0.500000
								if( ma65 > 275.325 )
									ret := -0.400000
					if( ma15 > 264.807 )
						if( ma80 <= 276.93 )
							ret := 1.000000 // buy
						if( ma80 > 276.93 )
							if( ma35 <= 271.512 )
								if( ma25_colorInt <= 3.5 )
									ret := 0.578947
								if( ma25_colorInt > 3.5 )
									ret := -0.513514
							if( ma35 > 271.512 )
								if( ma75 <= 278.572 )
									ret := 0.772727 // buy
								if( ma75 > 278.572 )
									ret := 0.239130
			if( ma40 > 275.893 )
				if( ma55 <= 280.181 )
					if( ma100 <= 280.611 )
						if( ma50 <= 278.349 )
							if( ma90 <= 279.023 )
								if( ma10 <= 279.828 )
									ret := -0.064286
								if( ma10 > 279.828 )
									ret := 0.869565 // buy
							if( ma90 > 279.023 )
								if( ma15 <= 277.784 )
									ret := 0.632911
								if( ma15 > 277.784 )
									ret := -0.200000
						if( ma50 > 278.349 )
							if( ma65 <= 279.622 )
								if( ma05 <= 279.358 )
									ret := -0.055556
								if( ma05 > 279.358 )
									ret := -0.744681 // sell
							if( ma65 > 279.622 )
								if( ma30_colorInt <= 1.5 )
									ret := 0.600000
								if( ma30_colorInt > 1.5 )
									ret := 1.000000 // buy
					if( ma100 > 280.611 )
						if( ma65 <= 279.965 )
							if( ma85 <= 280.11 )
								if( ma30 <= 278.02 )
									ret := 0.375000
								if( ma30 > 278.02 )
									ret := -0.800000 // sell
							if( ma85 > 280.11 )
								if( ma10_colorInt <= 3.5 )
									ret := -0.834437 // sell
								if( ma10_colorInt > 3.5 )
									ret := -0.416667
						if( ma65 > 279.965 )
							if( ma70 <= 280.326 )
								if( ma30 <= 279.396 )
									ret := 0.842105 // buy
								if( ma30 > 279.396 )
									ret := 0.000000
							if( ma70 > 280.326 )
								if( ma100 <= 282.604 )
									ret := -0.653846
								if( ma100 > 282.604 )
									ret := -0.074074
				if( ma55 > 280.181 )
					if( ma05 <= 280.204 )
						if( ma15 <= 272.544 )
							if( ma60 <= 287.569 )
								if( ma05 <= 263.824 )
									ret := 1.000000 // buy
								if( ma05 > 263.824 )
									ret := -0.500000
							if( ma60 > 287.569 )
								ret := -1.000000 // sell
						if( ma15 > 272.544 )
							if( ma35 <= 284.773 )
								if( ma30 <= 282.269 )
									ret := 0.226866
								if( ma30 > 282.269 )
									ret := -0.333333
							if( ma35 > 284.773 )
								if( ma20 <= 287.297 )
									ret := 0.621429
								if( ma20 > 287.297 )
									ret := -0.050000
					if( ma05 > 280.204 )
						if( ma05 <= 285.445 )
							if( ma20 <= 284.412 )
								if( ma40 <= 285.104 )
									ret := -0.161765
								if( ma40 > 285.104 )
									ret := 0.417476
							if( ma20 > 284.412 )
								if( ma20 <= 287.896 )
									ret := -0.567227
								if( ma20 > 287.896 )
									ret := -0.059701
						if( ma05 > 285.445 )
							if( ma30 <= 285.177 )
								if( ma90 <= 283.783 )
									ret := 0.254237
								if( ma90 > 283.783 )
									ret := 0.808824 // buy
							if( ma30 > 285.177 )
								if( ma10_colorInt <= 2.5 )
									ret := -0.070739
								if( ma10_colorInt > 2.5 )
									ret := 0.026467
	if( ma20 > 586.729 )
		if( ma25 <= 589.63 )
			if( ma15 <= 591.035 )
				if( ma05 <= 592.023 )
					if( ma45 <= 588.793 )
						if( ma35 <= 585.483 )
							if( ma05 <= 591.243 )
								if( ma25 <= 586.182 )
									ret := -1.000000 // sell
								if( ma25 > 586.182 )
									ret := -0.666667
							if( ma05 > 591.243 )
								ret := -0.250000
						if( ma35 > 585.483 )
							if( ma40 <= 584.892 )
								ret := 0.800000 // buy
							if( ma40 > 584.892 )
								if( ma45 <= 586.746 )
									ret := -0.078652
								if( ma45 > 586.746 )
									ret := -0.360000
					if( ma45 > 588.793 )
						if( ma75 <= 591.199 )
							if( ma60 <= 590.199 )
								if( ma100 <= 586.863 )
									ret := -0.928571 // sell
								if( ma100 > 586.863 )
									ret := -0.388889
							if( ma60 > 590.199 )
								if( ma40 <= 589.297 )
									ret := -0.750000 // sell
								if( ma40 > 589.297 )
									ret := -1.000000 // sell
						if( ma75 > 591.199 )
							if( ma90 <= 595.793 )
								if( ma05 <= 587.603 )
									ret := -0.100000
								if( ma05 > 587.603 )
									ret := 1.000000 // buy
							if( ma90 > 595.793 )
								if( ma90 <= 597.198 )
									ret := -1.000000 // sell
								if( ma90 > 597.198 )
									ret := -0.750000 // sell
				if( ma05 > 592.023 )
					if( ma10 <= 593.145 )
						if( ma30 <= 585.819 )
							if( ma35 <= 584.366 )
								if( ma05 <= 594.732 )
									ret := -0.222222
								if( ma05 > 594.732 )
									ret := 1.000000 // buy
							if( ma35 > 584.366 )
								if( ma10 <= 590.486 )
									ret := 0.250000
								if( ma10 > 590.486 )
									ret := -0.857143 // sell
						if( ma30 > 585.819 )
							if( ma45 <= 585.187 )
								if( ma35 <= 584.988 )
									ret := 0.500000
								if( ma35 > 584.988 )
									ret := 1.000000 // buy
							if( ma45 > 585.187 )
								ret := 0.000000
					if( ma10 > 593.145 )
						if( ma10 <= 593.758 )
							ret := -1.000000 // sell
						if( ma10 > 593.758 )
							ret := 0.000000
			if( ma15 > 591.035 )
				if( ma10 <= 596.682 )
					if( ma85 <= 576.746 )
						if( ma10 <= 595.858 )
							ret := -1.000000 // sell
						if( ma10 > 595.858 )
							ret := -0.666667
					if( ma85 > 576.746 )
						if( ma80 <= 578.595 )
							if( ma80 <= 577.63 )
								ret := 0.000000
							if( ma80 > 577.63 )
								ret := 1.000000 // buy
						if( ma80 > 578.595 )
							if( ma70 <= 585.551 )
								if( ma80 <= 579.973 )
									ret := -1.000000 // sell
								if( ma80 > 579.973 )
									ret := -0.307692
							if( ma70 > 585.551 )
								if( ma45 <= 587.127 )
									ret := -1.000000 // sell
								if( ma45 > 587.127 )
									ret := -0.750000 // sell
				if( ma10 > 596.682 )
					if( ma90 <= 568.378 )
						ret := 0.500000
					if( ma90 > 568.378 )
						ret := -0.750000 // sell
		if( ma25 > 589.63 )
			if( ma20 <= 591.569 )
				if( ma60 <= 602.439 )
					if( ma90 <= 597.887 )
						if( ma90 <= 596.265 )
							if( ma70 <= 592.113 )
								if( ma20 <= 591.233 )
									ret := -0.159664
								if( ma20 > 591.233 )
									ret := 0.408163
							if( ma70 > 592.113 )
								if( ma30 <= 590.995 )
									ret := 0.875000 // buy
								if( ma30 > 590.995 )
									ret := 0.358491
						if( ma90 > 596.265 )
							if( ma30 <= 591.527 )
								if( ma60 <= 593.998 )
									ret := -0.750000 // sell
								if( ma60 > 593.998 )
									ret := -1.000000 // sell
							if( ma30 > 591.527 )
								if( ma90 <= 597.439 )
									ret := -0.187500
								if( ma90 > 597.439 )
									ret := 0.444444
					if( ma90 > 597.887 )
						if( ma15_colorInt <= 3.5 )
							if( ma20 <= 591.249 )
								if( ma15 <= 587.69 )
									ret := 0.687500
								if( ma15 > 587.69 )
									ret := 0.938776 // buy
							if( ma20 > 591.249 )
								ret := 0.000000
						if( ma15_colorInt > 3.5 )
							if( ma25 <= 590.742 )
								ret := 0.500000
							if( ma25 > 590.742 )
								ret := 0.000000
				if( ma60 > 602.439 )
					if( ma75 <= 608.385 )
						ret := -1.000000 // sell
					if( ma75 > 608.385 )
						if( ma70 <= 611.076 )
							if( ma05 <= 583.938 )
								ret := 1.000000 // buy
							if( ma05 > 583.938 )
								ret := 0.250000
						if( ma70 > 611.076 )
							ret := -1.000000 // sell
			if( ma20 > 591.569 )
				if( ma15 <= 645.594 )
					if( ma40 <= 624.144 )
						if( ma45_colorInt <= 1.5 )
							if( ma20 <= 618.958 )
								if( ma40 <= 609.374 )
									ret := -0.039314
								if( ma40 > 609.374 )
									ret := 0.554913
							if( ma20 > 618.958 )
								if( ma60 <= 619.441 )
									ret := -0.390805
								if( ma60 > 619.441 )
									ret := 0.189189
						if( ma45_colorInt > 1.5 )
							if( ma05 <= 582.893 )
								if( ma05 <= 576.89 )
									ret := 0.000000
								if( ma05 > 576.89 )
									ret := 0.866667 // buy
							if( ma05 > 582.893 )
								if( ma05 <= 621.87 )
									ret := -0.192933
								if( ma05 > 621.87 )
									ret := -0.577465
					if( ma40 > 624.144 )
						if( ma100 <= 641.317 )
							if( ma40 <= 628.253 )
								if( ma20 <= 617.837 )
									ret := -0.636364
								if( ma20 > 617.837 )
									ret := 0.630435
							if( ma40 > 628.253 )
								if( ma80 <= 631.094 )
									ret := -0.270588
								if( ma80 > 631.094 )
									ret := 0.379421
						if( ma100 > 641.317 )
							if( ma50 <= 643.865 )
								if( ma05 <= 609.601 )
									ret := 1.000000 // buy
								if( ma05 > 609.601 )
									ret := -0.706422 // sell
							if( ma50 > 643.865 )
								if( ma15 <= 640.374 )
									ret := 0.803571 // buy
								if( ma15 > 640.374 )
									ret := -0.358974
				if( ma15 > 645.594 )
					if( ma55 <= 645.1 )
						if( ma70 <= 636.85 )
							if( ma30 <= 638.181 )
								ret := -1.000000 // sell
							if( ma30 > 638.181 )
								if( ma15 <= 654.175 )
									ret := 0.375000
								if( ma15 > 654.175 )
									ret := -0.142857
						if( ma70 > 636.85 )
							if( ma85 <= 642.281 )
								if( ma10_colorInt <= 1.5 )
									ret := -0.653846
								if( ma10_colorInt > 1.5 )
									ret := -0.120000
							if( ma85 > 642.281 )
								if( ma25 <= 647.092 )
									ret := -1.000000 // sell
								if( ma25 > 647.092 )
									ret := -0.857143 // sell
					if( ma55 > 645.1 )
						if( ma85 <= 658.122 )
							if( ma40 <= 657.673 )
								if( ma55 <= 646.808 )
									ret := 0.365854
								if( ma55 > 646.808 )
									ret := -0.289474
							if( ma40 > 657.673 )
								if( ma35 <= 659.763 )
									ret := 0.925000 // buy
								if( ma35 > 659.763 )
									ret := 0.102564
						if( ma85 > 658.122 )
							if( ma80 <= 679.711 )
								if( ma05 <= 645.171 )
									ret := 0.000000
								if( ma05 > 645.171 )
									ret := -0.648485
							if( ma80 > 679.711 )
								if( ma85 <= 700.44 )
									ret := 0.118343
								if( ma85 > 700.44 )
									ret := -0.814815 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_BNBUSDT_30Min_f3da39c3(ma65, ma15_colorInt, ma90_colorInt, ma75, ma10_colorInt, ma100, ma65_colorInt, ma50, ma55_colorInt, ma80_colorInt, ma70, ma20, ma30_colorInt, ma60, ma05, ma25, ma60_colorInt, ma35, ma25_colorInt, ma05_colorInt, ma90, ma80, ma40_colorInt, ma85, ma75_colorInt, ma30, ma40, ma55, ma15, ma35_colorInt, ma70_colorInt, ma45, ma20_colorInt, ma10, ma45_colorInt, ma85_colorInt, ma50_colorInt)

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


