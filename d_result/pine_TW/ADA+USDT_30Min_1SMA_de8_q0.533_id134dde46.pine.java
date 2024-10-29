//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: ADAUSDT_30Min_1SMA_134dde46 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_1SMA_134dde46", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_134dde46(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Discount_Zone <= 0.333746 )
		if( atr <= 0.097127 )
			if( atr <= 0.058399 )
				if( Premium_Zone <= 0.391867 )
					if( atr <= 0.049505 )
						if( Premium_Zone <= 0.377899 )
							if( Equilibrium_Zone <= 0.33693 )
								if( Discount_Zone <= 0.294039 )
									ret := 0.078545
								if( Discount_Zone > 0.294039 )
									ret := -0.065459
							if( Equilibrium_Zone > 0.33693 )
								if( atr <= 0.033841 )
									ret := 0.190632
								if( atr > 0.033841 )
									ret := 0.558140
						if( Premium_Zone > 0.377899 )
							if( Swing_Low <= 0.311094 )
								if( Discount_Zone <= 0.325632 )
									ret := -0.184984
								if( Discount_Zone > 0.325632 )
									ret := 0.207171
							if( Swing_Low > 0.311094 )
								if( atr <= 0.042162 )
									ret := 0.451327
								if( atr > 0.042162 )
									ret := -0.888889 // sell
					if( atr > 0.049505 )
						if( Swing_High <= 0.350154 )
							if( Discount_Zone <= 0.2425 )
								if( Premium_Zone <= 0.199882 )
									ret := 0.333333
								if( Premium_Zone > 0.199882 )
									ret := -0.031496
							if( Discount_Zone > 0.2425 )
								if( Premium_Zone <= 0.375974 )
									ret := 0.759494 // buy
								if( Premium_Zone > 0.375974 )
									ret := 0.400000
						if( Swing_High > 0.350154 )
							if( Discount_Zone <= 0.267812 )
								ret := 1.000000 // buy
							if( Discount_Zone > 0.267812 )
								if( Discount_Zone <= 0.280474 )
									ret := -0.800000 // sell
								if( Discount_Zone > 0.280474 )
									ret := 0.285714
				if( Premium_Zone > 0.391867 )
					if( Discount_Zone <= 0.300298 )
						if( Equilibrium_Zone <= 0.335916 )
							if( Equilibrium_Zone <= 0.334307 )
								if( FVG_UpInt <= 0.5 )
									ret := 0.259259
								if( FVG_UpInt > 0.5 )
									ret := 0.750000 // buy
							if( Equilibrium_Zone > 0.334307 )
								if( Discount_Zone <= 0.277619 )
									ret := 1.000000 // buy
								if( Discount_Zone > 0.277619 )
									ret := 0.750000 // buy
						if( Equilibrium_Zone > 0.335916 )
							if( Internal_Swing_Low <= 0.332984 )
								if( Discount_Zone <= 0.299908 )
									ret := -0.067164
								if( Discount_Zone > 0.299908 )
									ret := -0.673077
							if( Internal_Swing_Low > 0.332984 )
								if( Equilibrium_Zone <= 0.336612 )
									ret := -0.058824
								if( Equilibrium_Zone > 0.336612 )
									ret := 0.437500
					if( Discount_Zone > 0.300298 )
						if( Premium_Zone <= 0.395999 )
							if( Internal_Swing_High <= 0.349837 )
								if( Discount_Zone <= 0.324218 )
									ret := 0.644928
								if( Discount_Zone > 0.324218 )
									ret := 0.000000
							if( Internal_Swing_High > 0.349837 )
								if( Internal_Swing_High <= 0.36875 )
									ret := -0.269231
								if( Internal_Swing_High > 0.36875 )
									ret := 0.657895
						if( Premium_Zone > 0.395999 )
							if( Equilibrium_Zone <= 0.365084 )
								if( Internal_Swing_High <= 0.368664 )
									ret := 0.311309
								if( Internal_Swing_High > 0.368664 )
									ret := 0.028674
							if( Equilibrium_Zone > 0.365084 )
								if( Premium_Zone <= 0.43497 )
									ret := 0.098011
								if( Premium_Zone > 0.43497 )
									ret := 0.538462
			if( atr > 0.058399 )
				if( Equilibrium_Zone <= 0.291637 )
					if( Premium_Zone <= 0.271732 )
						if( Premium_Zone <= 0.216838 )
							if( Discount_Zone <= 0.084922 )
								if( Internal_Swing_High <= 0.136775 )
									ret := 0.925000 // buy
								if( Internal_Swing_High > 0.136775 )
									ret := 0.000000
							if( Discount_Zone > 0.084922 )
								if( Premium_Zone <= 0.207735 )
									ret := -0.800000 // sell
								if( Premium_Zone > 0.207735 )
									ret := 0.580645
						if( Premium_Zone > 0.216838 )
							if( Discount_Zone <= 0.081035 )
								if( Premium_Zone <= 0.223008 )
									ret := 1.000000 // buy
								if( Premium_Zone > 0.223008 )
									ret := -0.466667
							if( Discount_Zone > 0.081035 )
								if( Swing_Low <= 0.07351 )
									ret := -0.786885 // sell
								if( Swing_Low > 0.07351 )
									ret := 0.000000
					if( Premium_Zone > 0.271732 )
						if( Internal_Swing_High <= 0.274646 )
							if( FVG_UpInt <= 0.5 )
								if( Internal_Swing_Low <= 0.306124 )
									ret := 0.437637
								if( Internal_Swing_Low > 0.306124 )
									ret := -0.500000
							if( FVG_UpInt > 0.5 )
								if( Equilibrium_Zone <= 0.246392 )
									ret := 0.000000
								if( Equilibrium_Zone > 0.246392 )
									ret := -0.875000 // sell
						if( Internal_Swing_High > 0.274646 )
							if( atr <= 0.088782 )
								if( atr <= 0.07117 )
									ret := -0.375000
								if( atr > 0.07117 )
									ret := 0.620690
							if( atr > 0.088782 )
								if( Premium_Zone <= 0.363158 )
									ret := 0.333333
								if( Premium_Zone > 0.363158 )
									ret := -0.500000
				if( Equilibrium_Zone > 0.291637 )
					if( Swing_Low <= 0.308739 )
						if( atr <= 0.068737 )
							if( Premium_Zone <= 0.38206 )
								if( Swing_High <= 0.323948 )
									ret := 0.327273
								if( Swing_High > 0.323948 )
									ret := -0.600000
							if( Premium_Zone > 0.38206 )
								if( Premium_Zone <= 0.391669 )
									ret := -0.675000
								if( Premium_Zone > 0.391669 )
									ret := -0.150082
						if( atr > 0.068737 )
							if( Internal_Swing_High <= 0.372739 )
								if( Premium_Zone <= 0.457196 )
									ret := -0.055901
								if( Premium_Zone > 0.457196 )
									ret := 0.276276
							if( Internal_Swing_High > 0.372739 )
								if( Premium_Zone <= 0.473545 )
									ret := -0.687500
								if( Premium_Zone > 0.473545 )
									ret := 0.310345
					if( Swing_Low > 0.308739 )
						if( Discount_Zone <= 0.270007 )
							if( Discount_Zone <= 0.264941 )
								if( Internal_Swing_Low <= 0.330983 )
									ret := 0.666667
								if( Internal_Swing_Low > 0.330983 )
									ret := 0.000000
							if( Discount_Zone > 0.264941 )
								ret := 1.000000 // buy
						if( Discount_Zone > 0.270007 )
							if( Discount_Zone <= 0.286314 )
								if( Internal_Swing_Low <= 0.319394 )
									ret := 0.250000
								if( Internal_Swing_Low > 0.319394 )
									ret := -0.636364
							if( Discount_Zone > 0.286314 )
								if( atr <= 0.087782 )
									ret := 0.473684
								if( atr > 0.087782 )
									ret := -1.000000 // sell
		if( atr > 0.097127 )
			if( atr <= 0.146011 )
				if( atr <= 0.119426 )
					if( Discount_Zone <= 0.171998 )
						if( Internal_Swing_High <= 0.26685 )
							if( atr <= 0.116987 )
								if( Internal_Swing_High <= 0.258 )
									ret := 0.866667 // buy
								if( Internal_Swing_High > 0.258 )
									ret := 1.000000 // buy
							if( atr > 0.116987 )
								ret := 0.727273 // buy
						if( Internal_Swing_High > 0.26685 )
							if( Internal_Swing_High <= 0.283116 )
								if( FVG_UpInt <= 0.5 )
									ret := 0.000000
								if( FVG_UpInt > 0.5 )
									ret := -0.666667
							if( Internal_Swing_High > 0.283116 )
								ret := 0.714286 // buy
					if( Discount_Zone > 0.171998 )
						if( Premium_Zone <= 0.447788 )
							if( Equilibrium_Zone <= 0.341706 )
								if( Discount_Zone <= 0.226227 )
									ret := 0.006993
								if( Discount_Zone > 0.226227 )
									ret := 0.377193
							if( Equilibrium_Zone > 0.341706 )
								if( Internal_Swing_Low <= 0.30785 )
									ret := -0.761905 // sell
								if( Internal_Swing_Low > 0.30785 )
									ret := 0.000000
						if( Premium_Zone > 0.447788 )
							if( atr <= 0.117809 )
								if( Discount_Zone <= 0.23716 )
									ret := 0.208333
								if( Discount_Zone > 0.23716 )
									ret := 0.719298 // buy
							if( atr > 0.117809 )
								if( Discount_Zone <= 0.276645 )
									ret := -0.029703
								if( Discount_Zone > 0.276645 )
									ret := 0.476190
				if( atr > 0.119426 )
					if( Discount_Zone <= 0.172123 )
						if( Internal_Swing_High <= 0.308255 )
							if( atr <= 0.136629 )
								if( Internal_Swing_Low <= 0.269025 )
									ret := 0.666667
								if( Internal_Swing_Low > 0.269025 )
									ret := -1.000000 // sell
							if( atr > 0.136629 )
								if( Internal_Swing_High <= 0.147221 )
									ret := 0.718750 // buy
								if( Internal_Swing_High > 0.147221 )
									ret := 1.000000 // buy
						if( Internal_Swing_High > 0.308255 )
							if( Internal_Swing_High <= 0.311678 )
								ret := -1.000000 // sell
							if( Internal_Swing_High > 0.311678 )
								ret := -0.400000
					if( Discount_Zone > 0.172123 )
						if( Equilibrium_Zone <= 0.450669 )
							if( Swing_High <= 0.474548 )
								if( Internal_Swing_High <= 0.313641 )
									ret := 1.000000 // buy
								if( Internal_Swing_High > 0.313641 )
									ret := 0.923077 // buy
							if( Swing_High > 0.474548 )
								ret := 0.500000
						if( Equilibrium_Zone > 0.450669 )
							if( Internal_Swing_High <= 0.22915 )
								if( Equilibrium_Zone <= 0.452329 )
									ret := 0.000000
								if( Equilibrium_Zone > 0.452329 )
									ret := 0.833333 // buy
							if( Internal_Swing_High > 0.22915 )
								ret := -0.250000
			if( atr > 0.146011 )
				if( Discount_Zone <= 0.285 )
					if( Premium_Zone <= 0.773752 )
						if( FVG_DownInt <= 0.5 )
							if( Equilibrium_Zone <= 0.509845 )
								if( Swing_High <= 0.497154 )
									ret := -0.352798
								if( Swing_High > 0.497154 )
									ret := 0.458333
							if( Equilibrium_Zone > 0.509845 )
								if( Premium_Zone <= 0.755462 )
									ret := 1.000000 // buy
								if( Premium_Zone > 0.755462 )
									ret := 0.000000
						if( FVG_DownInt > 0.5 )
							if( atr <= 0.180585 )
								if( Equilibrium_Zone <= 0.315025 )
									ret := 0.714286 // buy
								if( Equilibrium_Zone > 0.315025 )
									ret := -0.500000
							if( atr > 0.180585 )
								if( Internal_Swing_Low <= 0.541009 )
									ret := 0.875000 // buy
								if( Internal_Swing_Low > 0.541009 )
									ret := 1.000000 // buy
					if( Premium_Zone > 0.773752 )
						if( Equilibrium_Zone <= 0.559797 )
							if( Internal_Swing_High <= 0.566782 )
								if( Premium_Zone <= 0.84803 )
									ret := 0.693069
								if( Premium_Zone > 0.84803 )
									ret := -0.500000
							if( Internal_Swing_High > 0.566782 )
								if( Internal_Swing_High <= 0.673235 )
									ret := -0.266667
								if( Internal_Swing_High > 0.673235 )
									ret := -0.933333 // sell
						if( Equilibrium_Zone > 0.559797 )
							if( Premium_Zone <= 0.864704 )
								if( Discount_Zone <= 0.276712 )
									ret := -1.000000 // sell
								if( Discount_Zone > 0.276712 )
									ret := -0.352941
							if( Premium_Zone > 0.864704 )
								ret := 0.222222
				if( Discount_Zone > 0.285 )
					if( Discount_Zone <= 0.3303 )
						if( Premium_Zone <= 0.665142 )
							if( atr <= 0.169872 )
								if( Internal_Swing_Low <= 0.465189 )
									ret := 0.136364
								if( Internal_Swing_Low > 0.465189 )
									ret := -0.764706 // sell
							if( atr > 0.169872 )
								if( Premium_Zone <= 0.656684 )
									ret := 0.663158
								if( Premium_Zone > 0.656684 )
									ret := -0.454545
						if( Premium_Zone > 0.665142 )
							if( FVG_UpInt <= 0.5 )
								if( Swing_Low <= 0.438818 )
									ret := 0.561644
								if( Swing_Low > 0.438818 )
									ret := -0.437500
							if( FVG_UpInt > 0.5 )
								if( Internal_Swing_High <= 0.48038 )
									ret := 0.000000
								if( Internal_Swing_High > 0.48038 )
									ret := -0.800000 // sell
					if( Discount_Zone > 0.3303 )
						if( Equilibrium_Zone <= 0.66139 )
							if( Discount_Zone <= 0.331025 )
								if( Internal_Swing_High <= 0.6275 )
									ret := -0.253165
								if( Internal_Swing_High > 0.6275 )
									ret := -1.000000 // sell
							if( Discount_Zone > 0.331025 )
								if( Premium_Zone <= 0.650155 )
									ret := -0.333333
								if( Premium_Zone > 0.650155 )
									ret := 0.809524 // buy
						if( Equilibrium_Zone > 0.66139 )
							if( atr <= 0.36257 )
								ret := -0.800000 // sell
							if( atr > 0.36257 )
								ret := -0.666667
	if( Discount_Zone > 0.333746 )
		if( Swing_Low <= 0.422078 )
			if( atr <= 1.005 )
				if( Internal_Swing_High <= 0.49777 )
					if( atr <= 0.048716 )
						if( Equilibrium_Zone <= 0.798681 )
							if( atr <= 0.047433 )
								if( Premium_Zone <= 0.378502 )
									ret := 0.288235
								if( Premium_Zone > 0.378502 )
									ret := -0.004575
							if( atr > 0.047433 )
								if( Internal_Swing_High <= 0.483324 )
									ret := -0.299065
								if( Internal_Swing_High > 0.483324 )
									ret := 0.642857
						if( Equilibrium_Zone > 0.798681 )
							if( Premium_Zone <= 0.834997 )
								if( Internal_Swing_Low <= 0.796625 )
									ret := 0.937500 // buy
								if( Internal_Swing_Low > 0.796625 )
									ret := 0.000000
							if( Premium_Zone > 0.834997 )
								if( Discount_Zone <= 0.761133 )
									ret := 0.421053
								if( Discount_Zone > 0.761133 )
									ret := 0.160000
					if( atr > 0.048716 )
						if( Swing_High <= 0.46455 )
							if( Premium_Zone <= 3.34306 )
								if( atr <= 0.810312 )
									ret := 0.045666
								if( atr > 0.810312 )
									ret := -0.361290
							if( Premium_Zone > 3.34306 )
								if( Premium_Zone <= 3.38691 )
									ret := 0.407895
								if( Premium_Zone > 3.38691 )
									ret := 0.741935 // buy
						if( Swing_High > 0.46455 )
							if( atr <= 0.05637 )
								if( Premium_Zone <= 0.5199 )
									ret := 0.304348
								if( Premium_Zone > 0.5199 )
									ret := -0.214286
							if( atr > 0.05637 )
								if( Swing_High <= 0.479482 )
									ret := 0.500000
								if( Swing_High > 0.479482 )
									ret := 0.907407 // buy
				if( Internal_Swing_High > 0.49777 )
					if( Discount_Zone <= 0.549111 )
						if( Equilibrium_Zone <= 0.601565 )
							if( Order_Block_Low <= 0.56024 )
								if( Swing_High <= 0.536906 )
									ret := -0.108144
								if( Swing_High > 0.536906 )
									ret := 0.161392
							if( Order_Block_Low > 0.56024 )
								if( atr <= 0.127357 )
									ret := 0.608696
								if( atr > 0.127357 )
									ret := -0.117647
						if( Equilibrium_Zone > 0.601565 )
							if( Internal_Swing_High <= 0.590642 )
								if( Premium_Zone <= 0.714692 )
									ret := 0.583333
								if( Premium_Zone > 0.714692 )
									ret := -0.280000
							if( Internal_Swing_High > 0.590642 )
								if( Discount_Zone <= 0.378265 )
									ret := 0.363636
								if( Discount_Zone > 0.378265 )
									ret := -0.372180
					if( Discount_Zone > 0.549111 )
						if( Premium_Zone <= 2.45673 )
							if( Premium_Zone <= 2.27 )
								if( Premium_Zone <= 0.674896 )
									ret := 0.309859
								if( Premium_Zone > 0.674896 )
									ret := 0.005180
							if( Premium_Zone > 2.27 )
								if( Equilibrium_Zone <= 2.18673 )
									ret := 0.274869
								if( Equilibrium_Zone > 2.18673 )
									ret := -0.134615
						if( Premium_Zone > 2.45673 )
							if( Premium_Zone <= 2.93697 )
								if( Internal_Swing_High <= 2.13578 )
									ret := -0.063636
								if( Internal_Swing_High > 2.13578 )
									ret := -0.427778
							if( Premium_Zone > 2.93697 )
								if( Discount_Zone <= 1.95277 )
									ret := 0.434783
								if( Discount_Zone > 1.95277 )
									ret := -0.037037
			if( atr > 1.005 )
				if( Discount_Zone <= 0.734664 )
					if( Internal_Swing_High <= 1.71514 )
						if( Internal_Swing_High <= 0.77625 )
							ret := 0.894737 // buy
						if( Internal_Swing_High > 0.77625 )
							ret := 1.000000 // buy
					if( Internal_Swing_High > 1.71514 )
						ret := -0.500000
				if( Discount_Zone > 0.734664 )
					ret := 1.000000 // buy
		if( Swing_Low > 0.422078 )
			if( FVG_DownInt <= 0.5 )
				if( Swing_Low <= 0.501688 )
					if( Premium_Zone <= 0.499265 )
						if( Equilibrium_Zone <= 0.45675 )
							if( Swing_Low <= 0.435787 )
								if( Premium_Zone <= 0.458353 )
									ret := 0.400000
								if( Premium_Zone > 0.458353 )
									ret := -0.184211
							if( Swing_Low > 0.435787 )
								if( Equilibrium_Zone <= 0.4531 )
									ret := 0.809524 // buy
								if( Equilibrium_Zone > 0.4531 )
									ret := 0.214286
						if( Equilibrium_Zone > 0.45675 )
							if( Discount_Zone <= 0.42625 )
								ret := -1.000000 // sell
							if( Discount_Zone > 0.42625 )
								if( Equilibrium_Zone <= 0.463525 )
									ret := 0.047619
								if( Equilibrium_Zone > 0.463525 )
									ret := -0.714286 // sell
					if( Premium_Zone > 0.499265 )
						if( Equilibrium_Zone <= 0.556209 )
							if( Premium_Zone <= 0.593943 )
								if( atr <= 0.07617 )
									ret := 0.420000
								if( atr > 0.07617 )
									ret := -0.142857
							if( Premium_Zone > 0.593943 )
								if( Premium_Zone <= 0.615692 )
									ret := 0.894737 // buy
								if( Premium_Zone > 0.615692 )
									ret := 0.464286
						if( Equilibrium_Zone > 0.556209 )
							if( Internal_Swing_Low <= 0.481409 )
								if( Discount_Zone <= 0.381212 )
									ret := -0.250000
								if( Discount_Zone > 0.381212 )
									ret := -0.750000 // sell
							if( Internal_Swing_Low > 0.481409 )
								ret := 0.600000
				if( Swing_Low > 0.501688 )
					if( Discount_Zone <= 0.479928 )
						if( Swing_Low <= 0.54573 )
							if( Premium_Zone <= 0.694845 )
								if( Order_Block_Low <= 0.25145 )
									ret := -0.625000
								if( Order_Block_Low > 0.25145 )
									ret := 0.166667
							if( Premium_Zone > 0.694845 )
								if( atr <= 0.232442 )
									ret := 0.687500
								if( atr > 0.232442 )
									ret := -1.000000 // sell
						if( Swing_Low > 0.54573 )
							if( Equilibrium_Zone <= 0.583816 )
								if( atr <= 0.118 )
									ret := -0.500000
								if( atr > 0.118 )
									ret := -0.750000 // sell
							if( Equilibrium_Zone > 0.583816 )
								ret := -1.000000 // sell
					if( Discount_Zone > 0.479928 )
						if( atr <= 0.239676 )
							if( Swing_Low <= 1.58709 )
								if( Order_Block_High <= 0.6522 )
									ret := 0.133652
								if( Order_Block_High > 0.6522 )
									ret := -0.178571
							if( Swing_Low > 1.58709 )
								if( Premium_Zone <= 1.96259 )
									ret := -1.000000 // sell
								if( Premium_Zone > 1.96259 )
									ret := -0.177419
						if( atr > 0.239676 )
							if( Internal_Swing_Low <= 1.38491 )
								if( Discount_Zone <= 0.939046 )
									ret := 0.037500
								if( Discount_Zone > 0.939046 )
									ret := 0.621951
							if( Internal_Swing_Low > 1.38491 )
								if( Premium_Zone <= 2.57922 )
									ret := -0.098684
								if( Premium_Zone > 2.57922 )
									ret := 0.305970
			if( FVG_DownInt > 0.5 )
				if( Order_Block_High <= 1.14817 )
					if( Discount_Zone <= 0.399588 )
						if( Order_Block_High <= 0.458654 )
							if( Premium_Zone <= 0.499405 )
								ret := 0.250000
							if( Premium_Zone > 0.499405 )
								if( Equilibrium_Zone <= 0.447033 )
									ret := 0.800000 // buy
								if( Equilibrium_Zone > 0.447033 )
									ret := 1.000000 // buy
						if( Order_Block_High > 0.458654 )
							ret := 0.250000
					if( Discount_Zone > 0.399588 )
						if( Internal_Swing_Low <= 0.563316 )
							if( Premium_Zone <= 0.612295 )
								if( Premium_Zone <= 0.577864 )
									ret := 0.110390
								if( Premium_Zone > 0.577864 )
									ret := 0.657143
							if( Premium_Zone > 0.612295 )
								if( Equilibrium_Zone <= 0.566869 )
									ret := -0.695652
								if( Equilibrium_Zone > 0.566869 )
									ret := -0.121212
						if( Internal_Swing_Low > 0.563316 )
							if( Equilibrium_Zone <= 0.772547 )
								if( Discount_Zone <= 0.577502 )
									ret := 0.686567
								if( Discount_Zone > 0.577502 )
									ret := 0.227273
							if( Equilibrium_Zone > 0.772547 )
								if( Premium_Zone <= 0.94451 )
									ret := -0.750000 // sell
								if( Premium_Zone > 0.94451 )
									ret := 0.179487
				if( Order_Block_High > 1.14817 )
					if( Equilibrium_Zone <= 1.36747 )
						if( Equilibrium_Zone <= 1.33604 )
							if( Equilibrium_Zone <= 1.21214 )
								ret := 0.000000
							if( Equilibrium_Zone > 1.21214 )
								if( Order_Block_High <= 1.23 )
									ret := 0.941176 // buy
								if( Order_Block_High > 1.23 )
									ret := 0.500000
						if( Equilibrium_Zone > 1.33604 )
							if( Internal_Swing_Low <= 1.29746 )
								ret := 0.000000
							if( Internal_Swing_Low > 1.29746 )
								ret := -0.750000 // sell
					if( Equilibrium_Zone > 1.36747 )
						if( Discount_Zone <= 1.34525 )
							if( Discount_Zone <= 1.26978 )
								ret := 1.000000 // buy
							if( Discount_Zone > 1.26978 )
								if( Swing_Low <= 1.47566 )
									ret := 0.714286 // buy
								if( Swing_Low > 1.47566 )
									ret := 1.000000 // buy
						if( Discount_Zone > 1.34525 )
							if( Premium_Zone <= 2.55075 )
								if( atr <= 0.2935 )
									ret := -0.062500
								if( atr > 0.2935 )
									ret := 1.000000 // buy
							if( Premium_Zone > 2.55075 )
								if( Order_Block_Low <= 2.3155 )
									ret := 1.000000 // buy
								if( Order_Block_Low > 2.3155 )
									ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_ADAUSDT_30Min_134dde46(Bullish_CHoCHInt, Bearish_CHoCHInt, Order_Block_Low, FVG_UpInt, FVG_DownInt, atr, Premium_Zone, Discount_Zone, Swing_High, Internal_Swing_High, Equilibrium_Zone, Swing_Low, Order_Block_High, Bearish_BOSInt, Internal_Swing_Low, Bullish_BOSInt)

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


