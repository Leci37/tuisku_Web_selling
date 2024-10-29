//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ETSY_15Min_2TV0_4fecba11 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_2TV0_4fecba11", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_4fecba11(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= 0.332088 )
		if( ema1 <= 112.837 )
			if( ema3 <= 92.8788 )
				if( VIP_VIM <= -0.802271 )
					if( VIP <= 0.726196 )
						if( ema3 <= 20.2266 )
							if( ema2 <= 19.602 )
								if( ema2 <= 14.2238 )
									ret := 0.075472
								if( ema2 > 14.2238 )
									ret := 0.800000 // buy
							if( ema2 > 19.602 )
								ret := -1.000000 // sell
						if( ema3 > 20.2266 )
							if( ema3 <= 50.1008 )
								if( ema13 <= -0.42874 )
									ret := 0.911765 // buy
								if( ema13 > -0.42874 )
									ret := 0.181818
							if( ema3 > 50.1008 )
								if( ema2 <= 63.024 )
									ret := 0.209524
								if( ema2 > 63.024 )
									ret := 0.645963
					if( VIP > 0.726196 )
						if( VIP <= 5.20976 )
							if( ema1 <= 43.4456 )
								if( VIM <= 2.76536 )
									ret := 0.821782 // buy
								if( VIM > 2.76536 )
									ret := -0.125000
							if( ema1 > 43.4456 )
								if( tema <= 51.9257 )
									ret := -0.565217
								if( tema > 51.9257 )
									ret := 0.096019
						if( VIP > 5.20976 )
							if( VIP <= 8.54054 )
								ret := -0.800000 // sell
							if( VIP > 8.54054 )
								ret := -0.266667
				if( VIP_VIM > -0.802271 )
					if( VIP <= 0.773619 )
						if( VIP <= 0.572575 )
							if( ema12 <= -0.137002 )
								if( VIP <= 0.53134 )
									ret := 0.625000
								if( VIP > 0.53134 )
									ret := 0.928571 // buy
							if( ema12 > -0.137002 )
								ret := 0.960000 // buy
						if( VIP > 0.572575 )
							if( ema13 <= -2.43065 )
								if( ema1 <= 74.1305 )
									ret := 0.000000
								if( ema1 > 74.1305 )
									ret := -0.807018 // sell
							if( ema13 > -2.43065 )
								if( ema3 <= 67.2107 )
									ret := 0.136752
								if( ema3 > 67.2107 )
									ret := 0.284589
					if( VIP > 0.773619 )
						if( ema3 <= 63.8862 )
							if( VIM <= 1.26434 )
								if( ema13 <= -0.670859 )
									ret := -0.342756
								if( ema13 > -0.670859 )
									ret := 0.068877
							if( VIM > 1.26434 )
								if( ema13 <= 0.392982 )
									ret := -0.056347
								if( ema13 > 0.392982 )
									ret := 0.292593
						if( ema3 > 63.8862 )
							if( ema13 <= 0.471263 )
								if( tema <= 86.2487 )
									ret := -0.054686
								if( tema > 86.2487 )
									ret := -0.215867
							if( ema13 > 0.471263 )
								if( ema2 <= 68.7089 )
									ret := 0.419014
								if( ema2 > 68.7089 )
									ret := 0.183314
			if( ema3 > 92.8788 )
				if( VIM <= 0.918435 )
					if( ema2 <= 100.518 )
						if( ema3 <= 98.8411 )
							if( ema12 <= 0.000435 )
								ret := 0.500000
							if( ema12 > 0.000435 )
								if( ema13 <= 0.26492 )
									ret := -0.655172
								if( ema13 > 0.26492 )
									ret := 0.010638
						if( ema3 > 98.8411 )
							if( tema <= 100.841 )
								if( ema1 <= 100.16 )
									ret := 0.222222
								if( ema1 > 100.16 )
									ret := 0.791667 // buy
							if( tema > 100.841 )
								ret := -0.153846
					if( ema2 > 100.518 )
						if( ema2 <= 105.113 )
							if( ema13 <= 0.517943 )
								if( ema3 <= 104.793 )
									ret := -0.252252
								if( ema3 > 104.793 )
									ret := -1.000000 // sell
							if( ema13 > 0.517943 )
								if( VIP <= 1.14231 )
									ret := -0.944444 // sell
								if( VIP > 1.14231 )
									ret := -0.625000
						if( ema2 > 105.113 )
							if( tema <= 106.971 )
								if( ema3 <= 106.475 )
									ret := 0.200000
								if( ema3 > 106.475 )
									ret := 0.928571 // buy
							if( tema > 106.971 )
								if( ema13 <= 0.233809 )
									ret := -0.688525
								if( ema13 > 0.233809 )
									ret := 0.114583
				if( VIM > 0.918435 )
					if( tema <= 95.0355 )
						if( ema13 <= -0.875632 )
							if( ema13 <= -1.98873 )
								if( ema2 <= 96.3136 )
									ret := 0.277778
								if( ema2 > 96.3136 )
									ret := 0.918033 // buy
							if( ema13 > -1.98873 )
								if( VIM <= 1.1304 )
									ret := -0.904762 // sell
								if( VIM > 1.1304 )
									ret := 0.076923
						if( ema13 > -0.875632 )
							if( VIM <= 7.25197 )
								if( VIP_VIM <= -0.370698 )
									ret := 0.155556
								if( VIP_VIM > -0.370698 )
									ret := 0.566202
							if( VIM > 7.25197 )
								ret := -1.000000 // sell
					if( tema > 95.0355 )
						if( ema3 <= 97.5508 )
							if( VIP_VIM <= -0.414691 )
								if( tema <= 95.1664 )
									ret := -0.307692
								if( tema > 95.1664 )
									ret := 0.512195
							if( VIP_VIM > -0.414691 )
								if( VIM <= 1.17029 )
									ret := -0.017822
								if( VIM > 1.17029 )
									ret := -0.445026
						if( ema3 > 97.5508 )
							if( tema <= 110.759 )
								if( VIP <= 0.96414 )
									ret := 0.214721
								if( VIP > 0.96414 )
									ret := 0.059211
							if( tema > 110.759 )
								if( ema3 <= 112.082 )
									ret := 0.586705
								if( ema3 > 112.082 )
									ret := 0.048433
		if( ema1 > 112.837 )
			if( ema12 <= -2.26189 )
				if( VIM <= 1.27144 )
					if( tema <= 149.127 )
						if( ema12 <= -2.4186 )
							ret := 0.800000 // buy
						if( ema12 > -2.4186 )
							ret := 1.000000 // buy
					if( tema > 149.127 )
						if( ema13 <= -6.70109 )
							ret := 0.947368 // buy
						if( ema13 > -6.70109 )
							if( ema13 <= -3.90507 )
								if( ema13 <= -4.71706 )
									ret := 0.111111
								if( ema13 > -4.71706 )
									ret := -0.444444
							if( ema13 > -3.90507 )
								ret := 0.700000 // buy
				if( VIM > 1.27144 )
					if( VIP <= 0.736981 )
						if( ema3 <= 143.491 )
							if( ema3 <= 137.25 )
								if( ema1 <= 128.471 )
									ret := 0.333333
								if( ema1 > 128.471 )
									ret := -0.900000 // sell
							if( ema3 > 137.25 )
								if( ema13 <= -4.48719 )
									ret := 1.000000 // buy
								if( ema13 > -4.48719 )
									ret := 0.555556
						if( ema3 > 143.491 )
							if( ema1 <= 142.611 )
								if( ema12 <= -5.21453 )
									ret := -1.000000 // sell
								if( ema12 > -5.21453 )
									ret := -0.800000 // sell
							if( ema1 > 142.611 )
								if( ema13 <= -5.78846 )
									ret := 0.248447
								if( ema13 > -5.78846 )
									ret := -0.097222
					if( VIP > 0.736981 )
						if( ema1 <= 218.184 )
							if( tema <= 157.228 )
								ret := -0.300000
							if( tema > 157.228 )
								if( VIM <= 1.68702 )
									ret := 0.925373 // buy
								if( VIM > 1.68702 )
									ret := 0.485714
						if( ema1 > 218.184 )
							if( VIM <= 1.43914 )
								ret := 0.272727
							if( VIM > 1.43914 )
								ret := -0.909091 // sell
			if( ema12 > -2.26189 )
				if( tema <= 153.37 )
					if( ema1 <= 148.766 )
						if( tema <= 115.296 )
							if( ema2 <= 115.351 )
								if( tema <= 113.382 )
									ret := -0.314879
								if( tema > 113.382 )
									ret := 0.030864
							if( ema2 > 115.351 )
								if( ema2 <= 119.014 )
									ret := -0.589862
								if( ema2 > 119.014 )
									ret := 0.846154 // buy
						if( tema > 115.296 )
							if( VIM <= 0.963003 )
								if( ema1 <= 146.849 )
									ret := 0.091667
								if( ema1 > 146.849 )
									ret := 0.875000 // buy
							if( VIM > 0.963003 )
								if( ema12 <= -0.204744 )
									ret := -0.109621
								if( ema12 > -0.204744 )
									ret := 0.009132
					if( ema1 > 148.766 )
						if( ema1 <= 151.705 )
							if( tema <= 149.344 )
								if( VIP <= 1.67443 )
									ret := -0.476415
								if( VIP > 1.67443 )
									ret := 0.538462
							if( tema > 149.344 )
								if( VIP_VIM <= -0.03147 )
									ret := -0.613636
								if( VIP_VIM > -0.03147 )
									ret := -0.892562 // sell
						if( ema1 > 151.705 )
							if( ema3 <= 152.674 )
								if( VIM <= 1.24666 )
									ret := 0.230769
								if( VIM > 1.24666 )
									ret := 0.909091 // buy
							if( ema3 > 152.674 )
								if( ema2 <= 153.619 )
									ret := -0.571429
								if( ema2 > 153.619 )
									ret := -0.058824
				if( tema > 153.37 )
					if( ema2 <= 221.77 )
						if( ema3 <= 165.463 )
							if( ema1 <= 161.864 )
								if( VIP_VIM <= -0.809467 )
									ret := 0.812500 // buy
								if( VIP_VIM > -0.809467 )
									ret := 0.055080
							if( ema1 > 161.864 )
								if( VIP <= 1.26972 )
									ret := 0.290566
								if( VIP > 1.26972 )
									ret := 0.806818 // buy
						if( ema3 > 165.463 )
							if( ema13 <= -1.28887 )
								if( ema2 <= 187.289 )
									ret := -0.306839
								if( ema2 > 187.289 )
									ret := 0.025326
							if( ema13 > -1.28887 )
								if( ema1 <= 165.754 )
									ret := -0.463415
								if( ema1 > 165.754 )
									ret := 0.059068
					if( ema2 > 221.77 )
						if( tema <= 224.098 )
							if( ema2 <= 223.906 )
								if( ema2 <= 222.514 )
									ret := -0.242857
								if( ema2 > 222.514 )
									ret := -0.654054
							if( ema2 > 223.906 )
								if( ema2 <= 224.191 )
									ret := 0.727273 // buy
								if( ema2 > 224.191 )
									ret := -0.330097
						if( tema > 224.098 )
							if( VIP <= 1.19521 )
								if( ema12 <= -0.105291 )
									ret := -0.030238
								if( ema12 > -0.105291 )
									ret := -0.350299
							if( VIP > 1.19521 )
								if( ema12 <= 0.166426 )
									ret := -0.005952
								if( ema12 > 0.166426 )
									ret := 0.631068
	if( ema12 > 0.332088 )
		if( VIM <= 0.770799 )
			if( ema12 <= 2.9642 )
				if( ema13 <= 2.60535 )
					if( ema3 <= 60.606 )
						if( ema2 <= 53.3826 )
							if( tema <= 42.0916 )
								if( ema2 <= 36.1155 )
									ret := 0.285714
								if( ema2 > 36.1155 )
									ret := -0.850746 // sell
							if( tema > 42.0916 )
								if( tema <= 47.1385 )
									ret := 0.387755
								if( tema > 47.1385 )
									ret := -0.157360
						if( ema2 > 53.3826 )
							if( ema1 <= 56.7925 )
								if( tema <= 56.907 )
									ret := -0.333333
								if( tema > 56.907 )
									ret := 1.000000 // buy
							if( ema1 > 56.7925 )
								if( ema3 <= 58.4045 )
									ret := -0.747748 // sell
								if( ema3 > 58.4045 )
									ret := -0.051282
					if( ema3 > 60.606 )
						if( ema1 <= 99.2865 )
							if( VIP <= 1.42865 )
								if( ema12 <= 1.16481 )
									ret := 0.006764
								if( ema12 > 1.16481 )
									ret := 0.521127
							if( VIP > 1.42865 )
								if( ema13 <= 2.18847 )
									ret := 0.407855
								if( ema13 > 2.18847 )
									ret := -0.675676
						if( ema1 > 99.2865 )
							if( ema1 <= 103.117 )
								if( tema <= 103.184 )
									ret := -0.546667
								if( tema > 103.184 )
									ret := -0.866667 // sell
							if( ema1 > 103.117 )
								if( VIP <= 1.19134 )
									ret := 0.448718
								if( VIP > 1.19134 )
									ret := -0.011387
				if( ema13 > 2.60535 )
					if( ema1 <= 66.7006 )
						if( ema2 <= 37.8529 )
							ret := 1.000000 // buy
						if( ema2 > 37.8529 )
							if( tema <= 44.7627 )
								ret := -1.000000 // sell
							if( tema > 44.7627 )
								ret := -0.625000
					if( ema1 > 66.7006 )
						if( ema2 <= 140.041 )
							if( ema12 <= 1.9105 )
								if( VIP_VIM <= 0.795148 )
									ret := 0.714286 // buy
								if( VIP_VIM > 0.795148 )
									ret := -0.036364
							if( ema12 > 1.9105 )
								if( VIP <= 1.22097 )
									ret := -0.800000 // sell
								if( VIP > 1.22097 )
									ret := 0.265306
						if( ema2 > 140.041 )
							if( tema <= 151.922 )
								if( ema2 <= 144.891 )
									ret := -0.125000
								if( ema2 > 144.891 )
									ret := -1.000000 // sell
							if( tema > 151.922 )
								if( ema13 <= 4.89733 )
									ret := 0.082515
								if( ema13 > 4.89733 )
									ret := 0.610169
			if( ema12 > 2.9642 )
				if( tema <= 233.006 )
					if( ema13 <= 7.25553 )
						if( ema12 <= 3.1341 )
							if( ema1 <= 192.078 )
								ret := -0.736842 // sell
							if( ema1 > 192.078 )
								ret := -0.357143
						if( ema12 > 3.1341 )
							if( tema <= 217.101 )
								if( ema3 <= 142.512 )
									ret := -1.000000 // sell
								if( ema3 > 142.512 )
									ret := -0.458333
							if( tema > 217.101 )
								if( ema3 <= 210.998 )
									ret := -1.000000 // sell
								if( ema3 > 210.998 )
									ret := -0.904762 // sell
					if( ema13 > 7.25553 )
						if( ema2 <= 142.38 )
							ret := -0.764706 // sell
						if( ema2 > 142.38 )
							ret := 0.125000
				if( tema > 233.006 )
					if( ema1 <= 237.817 )
						ret := 1.000000 // buy
					if( ema1 > 237.817 )
						if( ema2 <= 235.984 )
							ret := -0.923077 // sell
						if( ema2 > 235.984 )
							if( ema2 <= 252.15 )
								ret := -0.095238
							if( ema2 > 252.15 )
								if( VIM <= 0.635717 )
									ret := 0.666667
								if( VIM > 0.635717 )
									ret := 0.307692
		if( VIM > 0.770799 )
			if( ema2 <= 107.943 )
				if( tema <= 100.236 )
					if( tema <= 37.8957 )
						if( tema <= 33.57 )
							ret := -0.785714 // sell
						if( tema > 33.57 )
							if( VIP <= 1.49781 )
								ret := 1.000000 // buy
							if( VIP > 1.49781 )
								if( ema12 <= 0.376516 )
									ret := 1.000000 // buy
								if( ema12 > 0.376516 )
									ret := 0.342857
					if( tema > 37.8957 )
						if( VIM <= 1.8429 )
							if( ema13 <= 0.943422 )
								if( ema1 <= 86.5668 )
									ret := -0.301711
								if( ema1 > 86.5668 )
									ret := -0.044150
							if( ema13 > 0.943422 )
								if( ema2 <= 38.7258 )
									ret := -0.787879 // sell
								if( ema2 > 38.7258 )
									ret := -0.052441
						if( VIM > 1.8429 )
							if( VIP_VIM <= -0.046066 )
								if( tema <= 84.3607 )
									ret := 0.909091 // buy
								if( tema > 84.3607 )
									ret := 0.000000
							if( VIP_VIM > -0.046066 )
								if( VIM <= 1.97412 )
									ret := 0.500000
								if( VIM > 1.97412 )
									ret := -0.295455
				if( tema > 100.236 )
					if( ema3 <= 102.251 )
						if( VIP_VIM <= 0.056147 )
							if( tema <= 102.49 )
								ret := -0.600000
							if( tema > 102.49 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.056147 )
							if( ema13 <= 0.624815 )
								if( tema <= 102.301 )
									ret := -0.133333
								if( tema > 102.301 )
									ret := 0.500000
							if( ema13 > 0.624815 )
								if( ema13 <= 1.35177 )
									ret := -0.694118
								if( ema13 > 1.35177 )
									ret := -0.438596
					if( ema3 > 102.251 )
						if( VIM <= 1.19962 )
							if( VIP_VIM <= 0.391349 )
								if( VIP_VIM <= 0.257565 )
									ret := -0.291139
								if( VIP_VIM > 0.257565 )
									ret := 0.282353
							if( VIP_VIM > 0.391349 )
								if( tema <= 108.491 )
									ret := -0.500000
								if( tema > 108.491 )
									ret := 0.272727
						if( VIM > 1.19962 )
							if( ema13 <= 1.33922 )
								if( ema2 <= 104.727 )
									ret := -0.967742 // sell
								if( ema2 > 104.727 )
									ret := -0.652174
							if( ema13 > 1.33922 )
								ret := 0.125000
			if( ema2 > 107.943 )
				if( tema <= 220.584 )
					if( tema <= 214.136 )
						if( VIP <= 1.14579 )
							if( ema3 <= 208.937 )
								if( ema2 <= 195.647 )
									ret := -0.135135
								if( ema2 > 195.647 )
									ret := -0.455399
							if( ema3 > 208.937 )
								if( ema2 <= 210.485 )
									ret := 0.960000 // buy
								if( ema2 > 210.485 )
									ret := -0.222222
						if( VIP > 1.14579 )
							if( ema1 <= 212.275 )
								if( VIP_VIM <= 0.637 )
									ret := -0.001239
								if( VIP_VIM > 0.637 )
									ret := -0.263052
							if( ema1 > 212.275 )
								if( VIP_VIM <= 0.458226 )
									ret := -0.563636
								if( VIP_VIM > 0.458226 )
									ret := -1.000000 // sell
					if( tema > 214.136 )
						if( tema <= 217.424 )
							if( VIM <= 2.29636 )
								if( VIP_VIM <= 0.513581 )
									ret := 0.671233
								if( VIP_VIM > 0.513581 )
									ret := -0.047619
							if( VIM > 2.29636 )
								ret := -0.400000
						if( tema > 217.424 )
							if( tema <= 217.6 )
								ret := -0.761905 // sell
							if( tema > 217.6 )
								if( VIP <= 1.52052 )
									ret := 0.035000
								if( VIP > 1.52052 )
									ret := 0.634921
				if( tema > 220.584 )
					if( ema3 <= 220.672 )
						if( ema1 <= 220.575 )
							if( ema2 <= 219.941 )
								if( VIP <= 1.21526 )
									ret := 0.108108
								if( VIP > 1.21526 )
									ret := -0.493671
							if( ema2 > 219.941 )
								ret := 0.555556
						if( ema1 > 220.575 )
							if( VIM <= 1.21582 )
								if( VIP <= 1.32095 )
									ret := -0.643478
								if( VIP > 1.32095 )
									ret := 0.090909
							if( VIM > 1.21582 )
								if( ema3 <= 219.901 )
									ret := -1.000000 // sell
								if( ema3 > 219.901 )
									ret := -0.805556 // sell
					if( ema3 > 220.672 )
						if( VIP <= 1.40151 )
							if( VIM <= 1.32012 )
								if( ema3 <= 223.674 )
									ret := 0.180723
								if( ema3 > 223.674 )
									ret := -0.305430
							if( VIM > 1.32012 )
								if( VIP_VIM <= -0.211566 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.211566 )
									ret := -0.689655
						if( VIP > 1.40151 )
							if( VIM <= 1.34462 )
								if( ema12 <= 2.1769 )
									ret := 0.559748
								if( ema12 > 2.1769 )
									ret := -0.344828
							if( VIM > 1.34462 )
								if( tema <= 242.079 )
									ret := -0.452229
								if( tema > 242.079 )
									ret := 0.524590
	
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
float op_operation = decision_tree_0_ETSY_15Min_4fecba11(ema12, ema3, ema13, tema, ema1, ema2, VIP, VIP_VIM, VIM)

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


