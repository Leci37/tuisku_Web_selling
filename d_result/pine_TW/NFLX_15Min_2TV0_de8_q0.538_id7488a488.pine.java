//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: NFLX_15Min_2TV0_7488a488 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NFLX_15Min_2TV0_7488a488", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NFLX_15Min_7488a488(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= 0.170543 )
		if( VIP <= 1.10043 )
			if( VIM <= 1.25326 )
				if( ema1 <= 322.565 )
					if( tema <= 116.439 )
						if( ema3 <= 116.623 )
							ret := 1.000000 // buy
						if( ema3 > 116.623 )
							if( ema2 <= 116.606 )
								ret := 0.000000
							if( ema2 > 116.606 )
								ret := 1.000000 // buy
					if( tema > 116.439 )
						if( tema <= 318.869 )
							if( ema3 <= 317.37 )
								if( ema1 <= 315.872 )
									ret := 0.066177
								if( ema1 > 315.872 )
									ret := 0.519481
							if( ema3 > 317.37 )
								if( ema1 <= 317.216 )
									ret := -0.462500
								if( ema1 > 317.216 )
									ret := 0.022989
						if( tema > 318.869 )
							if( VIP <= 0.876331 )
								if( ema3 <= 324.303 )
									ret := -0.015625
								if( ema3 > 324.303 )
									ret := -0.818182 // sell
							if( VIP > 0.876331 )
								if( VIM <= 1.0093 )
									ret := 0.085106
								if( VIM > 1.0093 )
									ret := 0.487069
				if( ema1 > 322.565 )
					if( ema1 <= 331.149 )
						if( ema3 <= 333.338 )
							if( VIP_VIM <= -0.540725 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.540725 )
								if( tema <= 321.777 )
									ret := -0.524590
								if( tema > 321.777 )
									ret := -0.142857
						if( ema3 > 333.338 )
							if( ema1 <= 329.911 )
								ret := 0.166667
							if( ema1 > 329.911 )
								ret := -1.000000 // sell
					if( ema1 > 331.149 )
						if( ema12 <= -2.74288 )
							if( VIP <= 0.810145 )
								if( ema1 <= 521.309 )
									ret := -0.195312
								if( ema1 > 521.309 )
									ret := -0.492958
							if( VIP > 0.810145 )
								if( ema1 <= 635.877 )
									ret := -0.040000
								if( ema1 > 635.877 )
									ret := 0.736842 // buy
						if( ema12 > -2.74288 )
							if( VIM <= 1.1262 )
								if( tema <= 332.949 )
									ret := 0.351852
								if( tema > 332.949 )
									ret := -0.018333
							if( VIM > 1.1262 )
								if( VIP <= 0.966473 )
									ret := 0.044704
								if( VIP > 0.966473 )
									ret := 0.160262
			if( VIM > 1.25326 )
				if( VIM <= 1.54766 )
					if( ema12 <= -5.73407 )
						if( ema2 <= 512.897 )
							if( ema12 <= -8.11419 )
								if( ema12 <= -8.42145 )
									ret := -0.192982
								if( ema12 > -8.42145 )
									ret := -1.000000 // sell
							if( ema12 > -8.11419 )
								if( tema <= 479.748 )
									ret := 0.692308
								if( tema > 479.748 )
									ret := -0.142857
						if( ema2 > 512.897 )
							if( ema1 <= 539.104 )
								if( ema13 <= -10.6787 )
									ret := 0.936170 // buy
								if( ema13 > -10.6787 )
									ret := 0.500000
							if( ema1 > 539.104 )
								ret := -0.250000
					if( ema12 > -5.73407 )
						if( ema12 <= -3.13049 )
							if( ema3 <= 271.935 )
								if( VIP <= 0.562798 )
									ret := 0.166667
								if( VIP > 0.562798 )
									ret := 0.921053 // buy
							if( ema3 > 271.935 )
								if( tema <= 279.648 )
									ret := -0.923077 // sell
								if( tema > 279.648 )
									ret := -0.057082
						if( ema12 > -3.13049 )
							if( ema13 <= -2.19726 )
								if( ema3 <= 316.924 )
									ret := 0.281019
								if( ema3 > 316.924 )
									ret := 0.117722
							if( ema13 > -2.19726 )
								if( tema <= 380.992 )
									ret := 0.018182
								if( tema > 380.992 )
									ret := 0.166578
				if( VIM > 1.54766 )
					if( ema1 <= 690.548 )
						if( ema13 <= -0.853595 )
							if( ema13 <= -26.4059 )
								if( tema <= 400.347 )
									ret := -0.384615
								if( tema > 400.347 )
									ret := -1.000000 // sell
							if( ema13 > -26.4059 )
								if( ema1 <= 167.586 )
									ret := 0.916667 // buy
								if( ema1 > 167.586 )
									ret := 0.317236
						if( ema13 > -0.853595 )
							if( ema1 <= 213.694 )
								if( ema3 <= 193.218 )
									ret := -0.030303
								if( ema3 > 193.218 )
									ret := -0.791667 // sell
							if( ema1 > 213.694 )
								if( ema1 <= 539.839 )
									ret := 0.200000
								if( ema1 > 539.839 )
									ret := -0.392857
					if( ema1 > 690.548 )
						if( ema13 <= -6.40756 )
							ret := 0.500000
						if( ema13 > -6.40756 )
							if( ema2 <= 701.801 )
								if( tema <= 688.671 )
									ret := -0.800000 // sell
								if( tema > 688.671 )
									ret := -1.000000 // sell
							if( ema2 > 701.801 )
								if( VIP_VIM <= -0.890318 )
									ret := -0.800000 // sell
								if( VIP_VIM > -0.890318 )
									ret := 0.000000
		if( VIP > 1.10043 )
			if( ema12 <= -0.536823 )
				if( ema1 <= 546.388 )
					if( VIM <= 1.06413 )
						if( ema13 <= -5.88699 )
							if( ema13 <= -9.58421 )
								ret := -0.500000
							if( ema13 > -9.58421 )
								ret := 1.000000 // buy
						if( ema13 > -5.88699 )
							if( VIP_VIM <= 0.180436 )
								if( VIM <= 0.967053 )
									ret := 1.000000 // buy
								if( VIM > 0.967053 )
									ret := -0.264706
							if( VIP_VIM > 0.180436 )
								if( ema13 <= -2.76152 )
									ret := -0.375000
								if( ema13 > -2.76152 )
									ret := -0.880000 // sell
					if( VIM > 1.06413 )
						if( ema1 <= 362.835 )
							if( ema3 <= 305.151 )
								if( tema <= 173.327 )
									ret := -0.134615
								if( tema > 173.327 )
									ret := 0.425424
							if( ema3 > 305.151 )
								if( ema12 <= -2.65494 )
									ret := -0.507463
								if( ema12 > -2.65494 )
									ret := 0.112485
						if( ema1 > 362.835 )
							if( ema3 <= 374.748 )
								if( VIP_VIM <= -0.472285 )
									ret := 0.873239 // buy
								if( VIP_VIM > -0.472285 )
									ret := 0.631579
							if( ema3 > 374.748 )
								if( ema2 <= 385.426 )
									ret := -0.139706
								if( ema2 > 385.426 )
									ret := 0.369601
				if( ema1 > 546.388 )
					if( ema1 <= 600.815 )
						if( ema13 <= -3.59834 )
							if( ema13 <= -6.1628 )
								if( tema <= 592.115 )
									ret := 0.000000
								if( tema > 592.115 )
									ret := -0.750000 // sell
							if( ema13 > -6.1628 )
								if( VIP <= 1.19581 )
									ret := -1.000000 // sell
								if( VIP > 1.19581 )
									ret := -0.823529 // sell
						if( ema13 > -3.59834 )
							if( ema12 <= -1.72163 )
								if( VIM <= 2.01855 )
									ret := 0.400000
								if( VIM > 2.01855 )
									ret := 1.000000 // buy
							if( ema12 > -1.72163 )
								if( tema <= 597.727 )
									ret := -0.211712
								if( tema > 597.727 )
									ret := -0.888889 // sell
					if( ema1 > 600.815 )
						if( ema1 <= 681.281 )
							if( VIP <= 1.43827 )
								if( ema3 <= 653.566 )
									ret := 0.641379
								if( ema3 > 653.566 )
									ret := 0.304348
							if( VIP > 1.43827 )
								if( tema <= 672.006 )
									ret := -0.092308
								if( tema > 672.006 )
									ret := 0.642857
						if( ema1 > 681.281 )
							if( VIP_VIM <= -0.045306 )
								if( VIP_VIM <= -0.482125 )
									ret := 0.000000
								if( VIP_VIM > -0.482125 )
									ret := -0.500000
							if( VIP_VIM > -0.045306 )
								if( VIP <= 1.16961 )
									ret := 0.250000
								if( VIP > 1.16961 )
									ret := 0.000000
			if( ema12 > -0.536823 )
				if( ema1 <= 141.649 )
					if( ema12 <= 0.014357 )
						if( ema13 <= -0.006255 )
							if( VIM <= 1.04981 )
								if( ema12 <= -0.089289 )
									ret := 0.250000
								if( ema12 > -0.089289 )
									ret := 0.000000
							if( VIM > 1.04981 )
								if( tema <= 124.15 )
									ret := 0.902439 // buy
								if( tema > 124.15 )
									ret := 0.554348
						if( ema13 > -0.006255 )
							if( ema1 <= 117.306 )
								ret := 1.000000 // buy
							if( ema1 > 117.306 )
								if( ema3 <= 122.122 )
									ret := -1.000000 // sell
								if( ema3 > 122.122 )
									ret := 0.184211
					if( ema12 > 0.014357 )
						if( ema2 <= 131.585 )
							if( tema <= 130.278 )
								if( ema1 <= 123.584 )
									ret := 0.000000
								if( ema1 > 123.584 )
									ret := 0.354839
							if( tema > 130.278 )
								if( VIM <= 2.14097 )
									ret := -0.821429 // sell
								if( VIM > 2.14097 )
									ret := 0.000000
						if( ema2 > 131.585 )
							if( ema1 <= 139.325 )
								if( ema3 <= 138.531 )
									ret := 0.291667
								if( ema3 > 138.531 )
									ret := 0.866667 // buy
							if( ema1 > 139.325 )
								if( VIM <= 0.972667 )
									ret := -0.085714
								if( VIM > 0.972667 )
									ret := 0.272727
				if( ema1 > 141.649 )
					if( ema1 <= 687.722 )
						if( ema2 <= 670.873 )
							if( ema2 <= 653.453 )
								if( ema1 <= 650.105 )
									ret := 0.085915
								if( ema1 > 650.105 )
									ret := 0.800000 // buy
							if( ema2 > 653.453 )
								if( ema2 <= 663.562 )
									ret := -0.750000 // sell
								if( ema2 > 663.562 )
									ret := -0.208955
						if( ema2 > 670.873 )
							if( VIM <= 2.18774 )
								if( ema12 <= 0.636235 )
									ret := 0.601351
								if( ema12 > 0.636235 )
									ret := -1.000000 // sell
							if( VIM > 2.18774 )
								if( ema2 <= 679.37 )
									ret := 0.100000
								if( ema2 > 679.37 )
									ret := -1.000000 // sell
					if( ema1 > 687.722 )
						if( ema1 <= 718.643 )
							if( VIP <= 1.53348 )
								if( tema <= 687.926 )
									ret := 1.000000 // buy
								if( tema > 687.926 )
									ret := -0.515789
							if( VIP > 1.53348 )
								if( ema1 <= 696.987 )
									ret := -0.125000
								if( ema1 > 696.987 )
									ret := 0.583333
						if( ema1 > 718.643 )
							if( ema1 <= 721.286 )
								ret := 1.000000 // buy
							if( ema1 > 721.286 )
								if( VIP_VIM <= 0.12713 )
									ret := 0.125000
								if( VIP_VIM > 0.12713 )
									ret := 1.000000 // buy
	if( ema13 > 0.170543 )
		if( VIM <= 0.973744 )
			if( ema3 <= 362.719 )
				if( VIM <= 0.69131 )
					if( ema3 <= 350.874 )
						if( ema1 <= 270.285 )
							if( tema <= 246.575 )
								if( VIP <= 1.30413 )
									ret := -0.005917
								if( VIP > 1.30413 )
									ret := 0.299083
							if( tema > 246.575 )
								if( VIP_VIM <= 0.509059 )
									ret := 0.727273 // buy
								if( VIP_VIM > 0.509059 )
									ret := -0.466667
						if( ema1 > 270.285 )
							if( ema2 <= 294.069 )
								if( ema1 <= 291.813 )
									ret := 0.487288
								if( ema1 > 291.813 )
									ret := 0.808824 // buy
							if( ema2 > 294.069 )
								if( tema <= 333.715 )
									ret := 0.037143
								if( tema > 333.715 )
									ret := 0.368254
					if( ema3 > 350.874 )
						if( tema <= 368.208 )
							if( ema13 <= 3.74842 )
								if( ema3 <= 357.24 )
									ret := 0.230769
								if( ema3 > 357.24 )
									ret := -0.488889
							if( ema13 > 3.74842 )
								if( VIM <= 0.580831 )
									ret := 0.333333
								if( VIM > 0.580831 )
									ret := -0.820513 // sell
						if( tema > 368.208 )
							if( VIP <= 1.38142 )
								if( ema13 <= 5.9288 )
									ret := 0.966667 // buy
								if( ema13 > 5.9288 )
									ret := 0.153846
							if( VIP > 1.38142 )
								if( ema3 <= 361.435 )
									ret := 0.096774
								if( ema3 > 361.435 )
									ret := -0.636364
				if( VIM > 0.69131 )
					if( ema13 <= 2.01401 )
						if( ema2 <= 222.783 )
							if( ema3 <= 124.614 )
								if( ema12 <= 0.481139 )
									ret := 0.540230
								if( ema12 > 0.481139 )
									ret := 0.000000
							if( ema3 > 124.614 )
								if( tema <= 149.331 )
									ret := -0.032828
								if( tema > 149.331 )
									ret := 0.131670
						if( ema2 > 222.783 )
							if( ema3 <= 353.148 )
								if( ema3 <= 228.09 )
									ret := -0.217228
								if( ema3 > 228.09 )
									ret := 0.007789
							if( ema3 > 353.148 )
								if( ema3 <= 357.5 )
									ret := 0.278373
								if( ema3 > 357.5 )
									ret := 0.021739
					if( ema13 > 2.01401 )
						if( ema13 <= 5.82014 )
							if( ema1 <= 196.337 )
								if( VIP_VIM <= 0.226124 )
									ret := -0.800000 // sell
								if( VIP_VIM > 0.226124 )
									ret := 0.460000
							if( ema1 > 196.337 )
								if( tema <= 199.236 )
									ret := -0.522727
								if( tema > 199.236 )
									ret := 0.138370
						if( ema13 > 5.82014 )
							if( tema <= 365.42 )
								if( ema2 <= 301.285 )
									ret := 0.066667
								if( ema2 > 301.285 )
									ret := -0.507353
							if( tema > 365.42 )
								if( ema1 <= 363.21 )
									ret := 1.000000 // buy
								if( ema1 > 363.21 )
									ret := 0.750000 // buy
			if( ema3 > 362.719 )
				if( ema2 <= 368.802 )
					if( tema <= 368.687 )
						if( ema13 <= 1.52266 )
							if( ema1 <= 368.214 )
								if( ema13 <= 0.899112 )
									ret := -0.135484
								if( ema13 > 0.899112 )
									ret := -0.508982
							if( ema1 > 368.214 )
								if( ema2 <= 368.322 )
									ret := 0.882353 // buy
								if( ema2 > 368.322 )
									ret := -0.500000
						if( ema13 > 1.52266 )
							if( VIM <= 0.780381 )
								if( VIP <= 1.2198 )
									ret := -0.625000
								if( VIP > 1.2198 )
									ret := 0.000000
							if( VIM > 0.780381 )
								if( ema1 <= 364.57 )
									ret := -0.200000
								if( ema1 > 364.57 )
									ret := 0.723684 // buy
					if( tema > 368.687 )
						if( tema <= 372.516 )
							if( ema2 <= 364.107 )
								if( VIP <= 1.18196 )
									ret := 1.000000 // buy
								if( VIP > 1.18196 )
									ret := -0.750000 // sell
							if( ema2 > 364.107 )
								if( ema12 <= 1.15082 )
									ret := -0.215909
								if( ema12 > 1.15082 )
									ret := -0.720000 // sell
						if( tema > 372.516 )
							if( ema1 <= 370.422 )
								if( VIP <= 1.35238 )
									ret := 0.760000 // buy
								if( VIP > 1.35238 )
									ret := -0.333333
							if( ema1 > 370.422 )
								if( ema3 <= 366.792 )
									ret := -0.500000
								if( ema3 > 366.792 )
									ret := 0.800000 // buy
				if( ema2 > 368.802 )
					if( ema13 <= 7.69916 )
						if( ema1 <= 370.043 )
							if( ema2 <= 369.679 )
								if( ema1 <= 369.455 )
									ret := 0.000000
								if( ema1 > 369.455 )
									ret := 0.653846
							if( ema2 > 369.679 )
								if( tema <= 369.779 )
									ret := 1.000000 // buy
								if( tema > 369.779 )
									ret := 0.750000 // buy
						if( ema1 > 370.043 )
							if( tema <= 373.096 )
								if( tema <= 371.532 )
									ret := 0.307692
								if( tema > 371.532 )
									ret := -0.413793
							if( tema > 373.096 )
								if( ema3 <= 377.001 )
									ret := 0.137427
								if( ema3 > 377.001 )
									ret := 0.004743
					if( ema13 > 7.69916 )
						if( VIM <= 0.453965 )
							if( ema3 <= 626.385 )
								ret := 1.000000 // buy
							if( ema3 > 626.385 )
								ret := 0.750000 // buy
						if( VIM > 0.453965 )
							if( ema12 <= 6.25114 )
								if( ema13 <= 10.2035 )
									ret := 0.219298
								if( ema13 > 10.2035 )
									ret := 0.705882 // buy
							if( ema12 > 6.25114 )
								if( ema1 <= 546.103 )
									ret := -0.535714
								if( ema1 > 546.103 )
									ret := 0.285714
		if( VIM > 0.973744 )
			if( ema1 <= 724.855 )
				if( ema3 <= 407.609 )
					if( tema <= 379.08 )
						if( ema3 <= 374.021 )
							if( ema12 <= 3.05306 )
								if( tema <= 374.407 )
									ret := -0.046987
								if( tema > 374.407 )
									ret := -0.530864
							if( ema12 > 3.05306 )
								if( VIP <= 4.27869 )
									ret := 0.426966
								if( VIP > 4.27869 )
									ret := -0.777778 // sell
						if( ema3 > 374.021 )
							if( VIP_VIM <= -0.055652 )
								if( ema1 <= 376.64 )
									ret := 0.857143 // buy
								if( ema1 > 376.64 )
									ret := 0.222222
							if( VIP_VIM > -0.055652 )
								if( ema13 <= 0.91371 )
									ret := -0.032787
								if( ema13 > 0.91371 )
									ret := 0.369565
					if( tema > 379.08 )
						if( ema2 <= 377.324 )
							if( VIP <= 1.72952 )
								if( VIP <= 1.52464 )
									ret := -1.000000 // sell
								if( VIP > 1.52464 )
									ret := -0.250000
							if( VIP > 1.72952 )
								ret := -1.000000 // sell
						if( ema2 > 377.324 )
							if( ema1 <= 389.699 )
								if( ema3 <= 378.283 )
									ret := 0.366667
								if( ema3 > 378.283 )
									ret := -0.328597
							if( ema1 > 389.699 )
								if( ema1 <= 392.764 )
									ret := 0.633803
								if( ema1 > 392.764 )
									ret := -0.137566
				if( ema3 > 407.609 )
					if( ema1 <= 410.895 )
						if( ema12 <= -0.069309 )
							ret := -0.800000 // sell
						if( ema12 > -0.069309 )
							if( tema <= 411.232 )
								if( VIP <= 1.10025 )
									ret := 0.357143
								if( VIP > 1.10025 )
									ret := 0.928571 // buy
							if( tema > 411.232 )
								ret := 0.000000
					if( ema1 > 410.895 )
						if( ema12 <= 0.45227 )
							if( VIP <= 2.88786 )
								if( VIP_VIM <= -0.855365 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.855365 )
									ret := 0.062345
							if( VIP > 2.88786 )
								if( ema1 <= 527.503 )
									ret := 0.060606
								if( ema1 > 527.503 )
									ret := -0.600000
						if( ema12 > 0.45227 )
							if( ema1 <= 411.908 )
								if( ema13 <= 0.959022 )
									ret := 0.000000
								if( ema13 > 0.959022 )
									ret := -0.914286 // sell
							if( ema1 > 411.908 )
								if( ema2 <= 615.233 )
									ret := 0.000766
								if( ema2 > 615.233 )
									ret := -0.154611
			if( ema1 > 724.855 )
				if( VIP <= 1.07356 )
					if( tema <= 726.234 )
						ret := -1.000000 // sell
					if( tema > 726.234 )
						ret := 0.000000
				if( VIP > 1.07356 )
					if( VIP_VIM <= -0.855843 )
						ret := 0.000000
					if( VIP_VIM > -0.855843 )
						if( VIP_VIM <= 0.123881 )
							if( ema1 <= 725.202 )
								ret := -0.750000 // sell
							if( ema1 > 725.202 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.123881 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_NFLX_15Min_7488a488(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


