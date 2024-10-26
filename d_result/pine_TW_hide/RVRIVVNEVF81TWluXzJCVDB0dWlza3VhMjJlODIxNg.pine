//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: ETHUSDT_5Min_2BT0_a22e8216 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_2BT0_a22e8216", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_a22e8216(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= -16.0367 )
		if( tema <= 2263.05 )
			if( ema12 <= -4.11367 )
				if( bbp <= -19.2115 )
					if( bearPower <= -38.3882 )
						if( ema1 <= 2263.46 )
							if( ema2 <= 2051.64 )
								ret := 0.863636 // buy
							if( ema2 > 2051.64 )
								ret := 1.000000 // buy
						if( ema1 > 2263.46 )
							if( ema2 <= 2306.49 )
								if( bullPower <= -17.7136 )
									ret := -0.083333
								if( bullPower > -17.7136 )
									ret := 0.642857
							if( ema2 > 2306.49 )
								ret := 0.894737 // buy
					if( bearPower > -38.3882 )
						if( ema2 <= 1972.15 )
							if( bearPower <= -15.1733 )
								if( ema12 <= -12.0612 )
									ret := 0.243243
								if( ema12 > -12.0612 )
									ret := 0.611354
							if( bearPower > -15.1733 )
								if( bbm <= 6.49189 )
									ret := 0.754098 // buy
								if( bbm > 6.49189 )
									ret := 0.945455 // buy
						if( ema2 > 1972.15 )
							if( tema <= 1982.97 )
								if( ema13 <= -18.8054 )
									ret := 0.750000 // buy
								if( ema13 > -18.8054 )
									ret := -0.723404 // sell
							if( tema > 1982.97 )
								if( ema13 <= -6.78333 )
									ret := 0.330769
								if( ema13 > -6.78333 )
									ret := 0.873239 // buy
				if( bbp > -19.2115 )
					if( ema13 <= -18.3428 )
						ret := 0.937500 // buy
					if( ema13 > -18.3428 )
						if( bbm <= 7.5315 )
							if( tema <= 2172.74 )
								if( bearPower <= -11.9606 )
									ret := 0.800000 // buy
								if( bearPower > -11.9606 )
									ret := 0.240385
							if( tema > 2172.74 )
								if( bbm <= 6.34869 )
									ret := -0.215190
								if( bbm > 6.34869 )
									ret := 0.641026
						if( bbm > 7.5315 )
							if( tema <= 2082.46 )
								if( ema1 <= 1695.62 )
									ret := 0.166667
								if( ema1 > 1695.62 )
									ret := -0.500000
							if( tema > 2082.46 )
								if( ema1 <= 2205.2 )
									ret := 0.750000 // buy
								if( ema1 > 2205.2 )
									ret := -0.121212
			if( ema12 > -4.11367 )
				if( ema3 <= 1643.09 )
					if( bearPower <= -15.8775 )
						if( bbm <= 16.7199 )
							ret := 0.000000
						if( bbm > 16.7199 )
							ret := 0.727273 // buy
					if( bearPower > -15.8775 )
						if( bbp <= -17.0496 )
							ret := 0.666667
						if( bbp > -17.0496 )
							ret := 1.000000 // buy
				if( ema3 > 1643.09 )
					if( bullPower <= -6.41237 )
						if( ema1 <= 2182.03 )
							ret := 0.400000
						if( ema1 > 2182.03 )
							ret := 0.777778 // buy
					if( bullPower > -6.41237 )
						if( bbp <= -16.629 )
							if( ema2 <= 2044.41 )
								if( bbp <= -17.1474 )
									ret := -0.589286
								if( bbp > -17.1474 )
									ret := -1.000000 // sell
							if( ema2 > 2044.41 )
								if( ema1 <= 2188.52 )
									ret := 0.125000
								if( ema1 > 2188.52 )
									ret := -0.480769
						if( bbp > -16.629 )
							if( bullPower <= -5.54965 )
								ret := -0.153846
							if( bullPower > -5.54965 )
								if( bbp <= -16.3292 )
									ret := 0.923077 // buy
								if( bbp > -16.3292 )
									ret := 0.500000
		if( tema > 2263.05 )
			if( ema12 <= -15.2892 )
				if( bbp <= -149.977 )
					if( bullPower <= -69.5431 )
						if( bullPower <= -94.3875 )
							ret := 0.888889 // buy
						if( bullPower > -94.3875 )
							ret := 1.000000 // buy
					if( bullPower > -69.5431 )
						if( ema13 <= -54.3746 )
							if( ema12 <= -45.9925 )
								ret := 1.000000 // buy
							if( ema12 > -45.9925 )
								if( bullPower <= -58.1023 )
									ret := 0.000000
								if( bullPower > -58.1023 )
									ret := 0.583333
						if( ema13 > -54.3746 )
							if( bearPower <= -122.75 )
								ret := 0.800000 // buy
							if( bearPower > -122.75 )
								ret := 1.000000 // buy
				if( bbp > -149.977 )
					if( ema13 <= -40.4588 )
						if( ema2 <= 3241.18 )
							if( tema <= 2905.24 )
								if( bbp <= -76.6687 )
									ret := -0.240000
								if( bbp > -76.6687 )
									ret := 0.299065
							if( tema > 2905.24 )
								if( bbm <= 21.1524 )
									ret := -0.898305 // sell
								if( bbm > 21.1524 )
									ret := -0.140845
						if( ema2 > 3241.18 )
							if( tema <= 3296.35 )
								if( bullPower <= -19.8632 )
									ret := 0.960000 // buy
								if( bullPower > -19.8632 )
									ret := 0.645161
							if( tema > 3296.35 )
								if( ema1 <= 3805.8 )
									ret := -0.061350
								if( ema1 > 3805.8 )
									ret := 0.791667 // buy
					if( ema13 > -40.4588 )
						if( tema <= 3365.52 )
							if( ema12 <= -20.9155 )
								if( ema3 <= 2652.41 )
									ret := 0.939394 // buy
								if( ema3 > 2652.41 )
									ret := 0.184211
							if( ema12 > -20.9155 )
								if( ema3 <= 3147.16 )
									ret := 0.287634
								if( ema3 > 3147.16 )
									ret := -0.272340
						if( tema > 3365.52 )
							if( ema2 <= 3816.86 )
								if( bullPower <= -19.1265 )
									ret := 0.344498
								if( bullPower > -19.1265 )
									ret := 0.746988 // buy
							if( ema2 > 3816.86 )
								if( bbp <= -44.6953 )
									ret := 0.123596
								if( bbp > -44.6953 )
									ret := -0.800000 // sell
			if( ema12 > -15.2892 )
				if( bbm <= 23.525 )
					if( ema3 <= 2416.09 )
						if( ema12 <= -10.4783 )
							if( ema2 <= 2360.9 )
								if( bullPower <= -12.2307 )
									ret := -0.448980
								if( bullPower > -12.2307 )
									ret := -0.911765 // sell
							if( ema2 > 2360.9 )
								if( bearPower <= -24.9738 )
									ret := 0.714286 // buy
								if( bearPower > -24.9738 )
									ret := -0.285714
						if( ema12 > -10.4783 )
							if( ema1 <= 2375.87 )
								if( ema13 <= -19.6272 )
									ret := -0.689655
								if( ema13 > -19.6272 )
									ret := 0.043668
							if( ema1 > 2375.87 )
								if( bearPower <= -13.6553 )
									ret := -0.563830
								if( bearPower > -13.6553 )
									ret := 0.093750
					if( ema3 > 2416.09 )
						if( ema1 <= 2451.68 )
							if( ema13 <= -14.0967 )
								if( ema3 <= 2463.5 )
									ret := -0.140000
								if( ema3 > 2463.5 )
									ret := 0.714286 // buy
							if( ema13 > -14.0967 )
								if( bearPower <= -11.32 )
									ret := 0.789700 // buy
								if( bearPower > -11.32 )
									ret := -0.333333
						if( ema1 > 2451.68 )
							if( tema <= 2483.04 )
								if( ema12 <= -6.19682 )
									ret := -0.225806
								if( ema12 > -6.19682 )
									ret := -0.692308
							if( tema > 2483.04 )
								if( ema2 <= 2519.97 )
									ret := 0.425743
								if( ema2 > 2519.97 )
									ret := 0.053856
				if( bbm > 23.525 )
					if( ema3 <= 3586.92 )
						if( bearPower <= -32.7655 )
							if( ema13 <= -14.3539 )
								if( tema <= 3260.63 )
									ret := -0.140244
								if( tema > 3260.63 )
									ret := 0.493333
							if( ema13 > -14.3539 )
								if( tema <= 3485.65 )
									ret := 0.619048
								if( tema > 3485.65 )
									ret := -0.363636
						if( bearPower > -32.7655 )
							if( bbp <= -31.8317 )
								if( bbp <= -34.1045 )
									ret := 0.578947
								if( bbp > -34.1045 )
									ret := 0.878788 // buy
							if( bbp > -31.8317 )
								if( ema12 <= -2.19619 )
									ret := 0.445714
								if( ema12 > -2.19619 )
									ret := -0.409091
					if( ema3 > 3586.92 )
						if( ema3 <= 3609.72 )
							ret := -1.000000 // sell
						if( ema3 > 3609.72 )
							if( ema12 <= -8.26078 )
								if( bullPower <= -9.85877 )
									ret := 0.333333
								if( bullPower > -9.85877 )
									ret := -0.196078
							if( ema12 > -8.26078 )
								if( ema13 <= -11.7869 )
									ret := 0.875000 // buy
								if( ema13 > -11.7869 )
									ret := 0.472727
	if( bbp > -16.0367 )
		if( ema13 <= 4.9697 )
			if( tema <= 3849.6 )
				if( bearPower <= -2.67422 )
					if( ema1 <= 3648.25 )
						if( ema2 <= 3502.97 )
							if( bbm <= 28.9755 )
								if( ema3 <= 3500.59 )
									ret := 0.023645
								if( ema3 > 3500.59 )
									ret := 0.323529
							if( bbm > 28.9755 )
								if( ema13 <= -13.8338 )
									ret := 1.000000 // buy
								if( ema13 > -13.8338 )
									ret := 0.272727
						if( ema2 > 3502.97 )
							if( ema12 <= -1.167 )
								if( ema1 <= 3560.51 )
									ret := 0.096955
								if( ema1 > 3560.51 )
									ret := -0.162611
							if( ema12 > -1.167 )
								if( tema <= 3570.11 )
									ret := -0.327479
								if( tema > 3570.11 )
									ret := 0.098624
					if( ema1 > 3648.25 )
						if( ema1 <= 3772.3 )
							if( ema13 <= -22.8588 )
								if( ema12 <= -13.5255 )
									ret := -1.000000 // sell
								if( ema12 > -13.5255 )
									ret := -0.555556
							if( ema13 > -22.8588 )
								if( ema2 <= 3766.44 )
									ret := 0.165648
								if( ema2 > 3766.44 )
									ret := 0.612676
						if( ema1 > 3772.3 )
							if( ema1 <= 3782.67 )
								if( ema13 <= -1.4272 )
									ret := -0.720000 // sell
								if( ema13 > -1.4272 )
									ret := 0.237500
							if( ema1 > 3782.67 )
								if( ema1 <= 3786.35 )
									ret := 0.602564
								if( ema1 > 3786.35 )
									ret := 0.051607
				if( bearPower > -2.67422 )
					if( ema2 <= 3837.41 )
						if( ema1 <= 3832.8 )
							if( ema2 <= 3798.97 )
								if( tema <= 3795.25 )
									ret := -0.011320
								if( tema > 3795.25 )
									ret := -0.510791
							if( ema2 > 3798.97 )
								if( ema1 <= 3814.98 )
									ret := 0.290909
								if( ema1 > 3814.98 )
									ret := -0.023529
						if( ema1 > 3832.8 )
							if( ema3 <= 3834.03 )
								ret := -0.692308
							if( ema3 > 3834.03 )
								ret := -1.000000 // sell
					if( ema2 > 3837.41 )
						if( ema12 <= 1.92558 )
							if( ema3 <= 3854.12 )
								if( bbm <= 5.90438 )
									ret := 0.282609
								if( bbm > 5.90438 )
									ret := -0.250000
							if( ema3 > 3854.12 )
								ret := 1.000000 // buy
						if( ema12 > 1.92558 )
							if( bullPower <= 6.9588 )
								ret := 1.000000 // buy
							if( bullPower > 6.9588 )
								ret := 0.777778 // buy
			if( tema > 3849.6 )
				if( tema <= 3927.47 )
					if( ema13 <= 2.4731 )
						if( bbp <= 13.3951 )
							if( tema <= 3913.32 )
								if( ema2 <= 3885.47 )
									ret := -0.473538
								if( ema2 > 3885.47 )
									ret := -0.107492
							if( tema > 3913.32 )
								if( bearPower <= 0.968332 )
									ret := -0.666667
								if( bearPower > 0.968332 )
									ret := 0.266667
						if( bbp > 13.3951 )
							if( ema3 <= 3898.09 )
								ret := 1.000000 // buy
							if( ema3 > 3898.09 )
								if( tema <= 3911.35 )
									ret := -0.800000 // sell
								if( tema > 3911.35 )
									ret := 1.000000 // buy
					if( ema13 > 2.4731 )
						if( ema1 <= 3856.95 )
							if( ema3 <= 3843.2 )
								ret := -0.818182 // sell
							if( ema3 > 3843.2 )
								if( bbp <= 10.2053 )
									ret := -0.631579
								if( bbp > 10.2053 )
									ret := 0.300000
						if( ema1 > 3856.95 )
							if( ema3 <= 3908.46 )
								if( bullPower <= 5.07556 )
									ret := 0.186441
								if( bullPower > 5.07556 )
									ret := 0.737500 // buy
							if( ema3 > 3908.46 )
								if( ema12 <= 1.42637 )
									ret := 0.153846
								if( ema12 > 1.42637 )
									ret := -0.266667
				if( tema > 3927.47 )
					if( bbp <= -0.565353 )
						if( bearPower <= -10.6838 )
							if( bullPower <= -2.38696 )
								ret := 0.090909
							if( bullPower > -2.38696 )
								if( ema13 <= -9.71823 )
									ret := 0.400000
								if( ema13 > -9.71823 )
									ret := -0.795455 // sell
						if( bearPower > -10.6838 )
							if( tema <= 4045.04 )
								if( ema13 <= -3.13052 )
									ret := 0.603352
								if( ema13 > -3.13052 )
									ret := 0.155340
							if( tema > 4045.04 )
								if( ema2 <= 4051.77 )
									ret := -0.961538 // sell
								if( ema2 > 4051.77 )
									ret := 0.090909
					if( bbp > -0.565353 )
						if( bearPower <= -3.57463 )
							if( ema2 <= 4019.27 )
								if( ema13 <= 2.66748 )
									ret := -0.620690
								if( ema13 > 2.66748 )
									ret := 0.200000
							if( ema2 > 4019.27 )
								if( ema13 <= 1.75087 )
									ret := -0.444444
								if( ema13 > 1.75087 )
									ret := -1.000000 // sell
						if( bearPower > -3.57463 )
							if( ema3 <= 3962.49 )
								if( bullPower <= 6.29197 )
									ret := -0.076923
								if( bullPower > 6.29197 )
									ret := -0.612903
							if( ema3 > 3962.49 )
								if( ema1 <= 3991.4 )
									ret := 0.494624
								if( ema1 > 3991.4 )
									ret := -0.100775
		if( ema13 > 4.9697 )
			if( bullPower <= 48.2386 )
				if( ema1 <= 3783.63 )
					if( ema1 <= 3361.72 )
						if( bearPower <= -12.3992 )
							if( tema <= 2333.79 )
								ret := -1.000000 // sell
							if( tema > 2333.79 )
								if( tema <= 2952.81 )
									ret := -0.185185
								if( tema > 2952.81 )
									ret := -0.708333 // sell
						if( bearPower > -12.3992 )
							if( ema3 <= 3326.16 )
								if( ema1 <= 1622 )
									ret := 0.238806
								if( ema1 > 1622 )
									ret := -0.085521
							if( ema3 > 3326.16 )
								if( ema12 <= 5.11257 )
									ret := -0.186312
								if( ema12 > 5.11257 )
									ret := -0.625000
					if( ema1 > 3361.72 )
						if( tema <= 3482.12 )
							if( ema2 <= 3458.25 )
								if( tema <= 3378.67 )
									ret := 0.410526
								if( tema > 3378.67 )
									ret := 0.028571
							if( ema2 > 3458.25 )
								if( ema12 <= 2.73676 )
									ret := 0.280000
								if( ema12 > 2.73676 )
									ret := 0.600000
						if( tema > 3482.12 )
							if( ema2 <= 3758.07 )
								if( bbm <= 11.6081 )
									ret := -0.029263
								if( bbm > 11.6081 )
									ret := -0.244169
							if( ema2 > 3758.07 )
								if( ema1 <= 3763.28 )
									ret := 0.833333 // buy
								if( ema1 > 3763.28 )
									ret := 0.114754
				if( ema1 > 3783.63 )
					if( ema13 <= 12.9158 )
						if( bbm <= 25.808 )
							if( tema <= 3826.71 )
								if( ema12 <= 5.39982 )
									ret := -0.432353
								if( ema12 > 5.39982 )
									ret := 0.150000
							if( tema > 3826.71 )
								if( ema3 <= 3924.31 )
									ret := 0.173112
								if( ema3 > 3924.31 )
									ret := -0.192308
						if( bbm > 25.808 )
							if( bullPower <= 21.9055 )
								ret := -0.555556
							if( bullPower > 21.9055 )
								if( ema2 <= 3792.29 )
									ret := -1.000000 // sell
								if( ema2 > 3792.29 )
									ret := -0.857143 // sell
					if( ema13 > 12.9158 )
						if( ema3 <= 3920.15 )
							if( bbp <= 14.9367 )
								if( ema13 <= 21.9071 )
									ret := -0.187500
								if( ema13 > 21.9071 )
									ret := 0.689655
							if( bbp > 14.9367 )
								if( bbm <= 14.2706 )
									ret := -0.380435
								if( bbm > 14.2706 )
									ret := -0.725118 // sell
						if( ema3 > 3920.15 )
							if( ema2 <= 4017.28 )
								if( bullPower <= 25.1532 )
									ret := 0.216495
								if( bullPower > 25.1532 )
									ret := -0.588235
							if( ema2 > 4017.28 )
								ret := -0.666667
			if( bullPower > 48.2386 )
				if( bullPower <= 66.4016 )
					if( ema13 <= 58.3564 )
						if( ema13 <= 42.5607 )
							if( ema3 <= 3565.27 )
								if( ema2 <= 2145.62 )
									ret := 0.181818
								if( ema2 > 2145.62 )
									ret := 0.697143
							if( ema3 > 3565.27 )
								if( ema1 <= 3719.03 )
									ret := -1.000000 // sell
								if( ema1 > 3719.03 )
									ret := 0.458333
						if( ema13 > 42.5607 )
							if( ema3 <= 2949.89 )
								if( tema <= 3015.17 )
									ret := -0.083333
								if( tema > 3015.17 )
									ret := 1.000000 // buy
							if( ema3 > 2949.89 )
								if( ema3 <= 3451.22 )
									ret := -0.977778 // sell
								if( ema3 > 3451.22 )
									ret := -0.500000
					if( ema13 > 58.3564 )
						if( ema13 <= 62.466 )
							if( ema1 <= 3564.03 )
								ret := 0.800000 // buy
							if( ema1 > 3564.03 )
								ret := 0.600000
						if( ema13 > 62.466 )
							if( ema2 <= 2335.62 )
								ret := 0.909091 // buy
							if( ema2 > 2335.62 )
								if( bullPower <= 60.6682 )
									ret := 1.000000 // buy
								if( bullPower > 60.6682 )
									ret := 0.950000 // buy
				if( bullPower > 66.4016 )
					if( ema12 <= 58.6428 )
						if( bbp <= 100.166 )
							ret := 0.739130 // buy
						if( bbp > 100.166 )
							if( bearPower <= 43.7639 )
								if( bearPower <= 34.8341 )
									ret := -0.727273 // sell
								if( bearPower > 34.8341 )
									ret := -0.977778 // sell
							if( bearPower > 43.7639 )
								if( ema13 <= 46.0074 )
									ret := -0.666667
								if( ema13 > 46.0074 )
									ret := 0.113636
					if( ema12 > 58.6428 )
						if( bbp <= 218.488 )
							ret := 1.000000 // buy
						if( bbp > 218.488 )
							ret := 0.818182 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_ETHUSDT_5Min_a22e8216(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


